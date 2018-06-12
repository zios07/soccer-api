package com.soccer.controller;

import com.soccer.domain.Team;
import com.soccer.service.ITeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamController {

    @Autowired
    private ITeamService service;

    @GetMapping
    public List<Team> getAll() {
        return service.getAll();
    }

}
