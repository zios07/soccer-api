package com.soccer.controller;

import com.soccer.service.ICityService;
import com.soccer.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private IUserService service;


}