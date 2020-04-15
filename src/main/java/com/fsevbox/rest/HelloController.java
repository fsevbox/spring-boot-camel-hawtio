package com.fsevbox.rest;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private ProducerTemplate producerTemplate;

    @GetMapping("/")
    public String hello() {
        String message = "Hello " + System.currentTimeMillis();
        producerTemplate.sendBody("direct:message", message);
        return message;
    }
}
