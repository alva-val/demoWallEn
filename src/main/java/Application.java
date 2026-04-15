package com.example.demo;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @GetMapping("/")
    public String home() {
        return "OK";
    }

    @GetMapping("/triggerTLSValidate")
    public Map<String, Object> triggerTLSValidateGet() {
        return Map.of("status", "ok");
    }

    @PostMapping(
        value = "/triggerTLSValidate",
        consumes = MediaType.ALL_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Map<String, Object> triggerTLSValidatePost(@RequestBody(required = false) String body) {
        return Map.of(
            "status", "ok",
            "received", body == null ? "" : body
        );
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
