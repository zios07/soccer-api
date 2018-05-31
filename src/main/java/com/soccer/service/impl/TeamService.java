package com.soccer.service.impl;

import com.soccer.domain.Team;
import com.soccer.repository.TeamRepository;
import com.soccer.service.ITeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService implements ITeamService{

    @Autowired
    private TeamRepository repo;

    @Override
    public Team getById(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public List<Team> getAll() {
        return repo.findAll();
    }

    @Override
    public Team create(Team team) {
        return repo.save(team);
    }

    @Override
    public void remove(Long id) {
        repo.deleteById(id);
    }
}
