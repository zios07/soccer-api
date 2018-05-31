package com.soccer.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/auth")
public class AuthenticationController {

    @GetMapping(value = "login")
    public String test() {
        return "auth works";
    }

}
