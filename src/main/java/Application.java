package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping(value = "/", method = {
            RequestMethod.GET, RequestMethod.POST, RequestMethod.HEAD
    })
    public Map<String, Object> home(@RequestBody(required = false) String body) {
        Map<String, Object> res = new HashMap<>();
        res.put("status", "ok");
        res.put("path", "/");
        res.put("body", body == null ? "" : body);
        return res;
    }

    @RequestMapping(value = {
            "/triggerTLSValidate",
            "/triggerTLSvalidate"
    }, method = {
            RequestMethod.GET, RequestMethod.POST, RequestMethod.HEAD
    })
    public Map<String, Object> triggerTlsValidate(@RequestBody(required = false) String body) {
        Map<String, Object> res = new HashMap<>();
        res.put("status", "ok");
        res.put("path", "triggerTLSValidate");
        res.put("body", body == null ? "" : body);
        return res;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}                "path", "triggerTLSValidate",
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
