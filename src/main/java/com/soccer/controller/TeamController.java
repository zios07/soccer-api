package com.soccer.controller;

import com.soccer.service.ICityService;
import com.soccer.service.ITeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

    @Autowired
    private ITeamService service;


}
