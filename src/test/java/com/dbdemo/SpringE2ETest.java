package com.dbdemo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@Data
public class SpringE2ETest {
    @Autowired
    private TestRestTemplate testRestTemplate;

    public ResponseEntity<String> executeGet(String url) {
        ResponseEntity<String> respEntity = testRestTemplate.getForEntity(url, String.class);
        return respEntity;
    }
}
