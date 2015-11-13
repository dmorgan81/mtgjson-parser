package com.mtgjson.parser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class Unmarshaller {

    private static final Logger LOG = LoggerFactory.getLogger(Unmarshaller.class);

    private final ObjectMapper objectMapper;

    @Autowired
    public Unmarshaller(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    /**
     * Unmarshall some mtgjson data into a collection of Sets. For our purpose
     * we will merely add them to a collection. In production you'd probably
     * want to do something with each set once it is unmarshalled, such as
     * persisting it to a DB with JPA, marshalling it to XML, etc. Handling each
     * set before unmarshalling the next one is better for memory since there
     * are 30,000+ objects in the whole AllSets-x.json file.
     */
    public Collection<Set> unmarshall(byte[] data) throws IOException {
        LOG.info("Unmarshalling mtgjson data");
        List<Set> sets = new ArrayList<>();

        JsonParser parser = objectMapper.getFactory().createParser(data);

        parser.nextValue(); // Advance into top level object
        while (parser.nextValue() != null) {
            // Read the current value as a Set. This will automatically read the
            // cards property as a collection of Card objects and so on. This is
            // where the magic of Jackson happens
            Set set = parser.readValueAs(Set.class);
            sets.add(set);
        }

        return sets;
    }

}
