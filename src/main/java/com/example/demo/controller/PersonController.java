package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping
    public String index() {
        return "Person Controller - /";
    }

    @GetMapping("/User")
    public String user() {
        return "User Controller - /";
    }

}
