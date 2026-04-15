package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping(value = "/", method = {
            RequestMethod.GET, RequestMethod.POST, RequestMethod.HEAD
    })
    public Map<String, Object> home() {
        Map<String, Object> res = new HashMap<>();
        res.put("status", "ok");
        res.put("path", "/");
        return res;
    }

    @RequestMapping(value = {
            "/triggerTLSValidate",
            "/triggerTLSvalidate"
    }, method = {
            RequestMethod.GET, RequestMethod.POST, RequestMethod.HEAD
    })
    public Map<String, Object> triggerTlsValidate() {
        Map<String, Object> res = new HashMap<>();
        res.put("status", "ok");
        res.put("path", "triggerTLSValidate");
        return res;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
