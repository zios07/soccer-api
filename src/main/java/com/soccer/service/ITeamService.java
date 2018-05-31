package com.soccer.service;

import com.soccer.domain.Team;

import java.util.List;

public interface ITeamService {
    
    Team getById(Long id);

    List<Team> getAll();

    Team create(Team city);

    void remove(Long id);
}
