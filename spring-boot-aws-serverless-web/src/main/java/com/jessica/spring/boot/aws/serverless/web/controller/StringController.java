package com.jessica.spring.boot.aws.serverless.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/string")
public class StringController {

    @RequestMapping(path = "/reverse", method = RequestMethod.GET)
    public String reverse(@RequestParam String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
