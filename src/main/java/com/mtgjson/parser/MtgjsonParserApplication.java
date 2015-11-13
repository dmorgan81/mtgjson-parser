package com.mtgjson.parser;

import java.io.IOException;
import java.util.Collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
@Configuration
public class MtgjsonParserApplication {

    public static void main(String[] args) throws IOException {
        ApplicationContext context = SpringApplication.run(MtgjsonParserApplication.class, args);
        Downloader downloader = context.getBean(Downloader.class);
        Unmarshaller unmarshaller = context.getBean(Unmarshaller.class);

        byte[] data = downloader.download();
        Collection<Set> sets = unmarshaller.unmarshall(data);

        // We will simply output the size of the sets.
        System.out.println(sets.size());
    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
