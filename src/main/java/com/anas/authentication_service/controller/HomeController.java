package com.anas.authentication_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @GetMapping("/")
    private String greeting(){
        return "Welcome to the authentication service";
    }

    @GetMapping("/greeting")
    private String testing(){
        return "you what's up 1?";
    }
}
