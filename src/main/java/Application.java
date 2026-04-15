package com.example.demo;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping(value = "/", method = {
            RequestMethod.GET, RequestMethod.POST, RequestMethod.HEAD
    }, produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> home(@RequestBody(required = false) String body) {
        return Map.of(
                "status", "ok",
                "path", "/",
                "body", body == null ? "" : body
        );
    }

    @RequestMapping(value = {
            "/triggerTLSValidate",
            "/triggerTLSvalidate"
    }, method = {
            RequestMethod.GET, RequestMethod.POST, RequestMethod.HEAD
    }, produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> triggerTlsValidate(@RequestBody(required = false) String body) {
        return Map.of(
                "status", "ok",
                "path", "triggerTLSValidate",
                "body", body == null ? "" : body
        );
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
