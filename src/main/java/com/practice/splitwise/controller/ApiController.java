package com.practice.splitwise.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/hi")
    public String hello(){
        return "helli";
    }
}
