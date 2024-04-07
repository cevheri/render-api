package com.cevheri.java.renderapi.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Hello {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Hello.class);

    @GetMapping("/hello")
    public String hello() {
        log.info("Rest request received for /api/v1/hello");
        return "Hello World!";
    }
}
