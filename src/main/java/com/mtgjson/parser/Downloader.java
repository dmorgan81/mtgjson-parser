package com.mtgjson.parser;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.zip.ZipInputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Downloader {

    private static final Logger LOG = LoggerFactory.getLogger(Downloader.class);

    private final URI downloadUri;

    private final RestTemplate restTemplate;

    @Autowired
    public Downloader(@Value("${mtgjson.download-uri}") URI downloadURI,
            RestTemplate restTemplate) {
        this.downloadUri = downloadURI;
        this.restTemplate = restTemplate;
    }

    public byte[] download() throws IOException {
        LOG.info("Downloading {}", downloadUri);
        byte[] data;
        if ("file".equals(downloadUri.getScheme())) data = readFile(downloadUri);
        else data = restTemplate.getForObject(downloadUri, byte[].class);
        return uncompress(data);
    }

    private static byte[] readFile(URI uri) throws IOException {
        Path path = Paths.get(uri);
        return Files.readAllBytes(path);
    }

    private static byte[] uncompress(byte[] data) throws IOException {
        Path temp = Files.createTempFile("mtgjson", ".json");
        try (ZipInputStream input = new ZipInputStream(new ByteArrayInputStream(data))) {
            input.getNextEntry();
            Files.copy(input, temp, StandardCopyOption.REPLACE_EXISTING);
            return Files.readAllBytes(temp);
        } finally {
            Files.deleteIfExists(temp);
        }
    }

}
