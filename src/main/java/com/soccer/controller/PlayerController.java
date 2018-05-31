package com.soccer.controller;

import com.soccer.service.ICityService;
import com.soccer.service.IPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

    @Autowired
    private IPlayerService service;


}
