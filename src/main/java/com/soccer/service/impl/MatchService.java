package com.soccer.service.impl;

import com.soccer.domain.Match;
import com.soccer.repository.MatchRepository;
import com.soccer.service.IMatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchService implements IMatchService{

    @Autowired
    private MatchRepository repo;

    @Override
    public Match getById(Long id) {
        return repo.findOne(id);
    }

    @Override
    public List<Match> getAll() {
        return repo.findAll();
    }

    @Override
    public Match create(Match match) {
        return repo.save(match);
    }

    @Override
    public void remove(Long id) {
        repo.delete(id);
    }
}
