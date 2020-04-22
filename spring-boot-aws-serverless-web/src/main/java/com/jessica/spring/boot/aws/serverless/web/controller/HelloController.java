package com.jessica.spring.boot.aws.serverless.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hello")
public class HelloController {

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String testHello(@RequestParam String name) {
        return "hello " + name;
    }
}
