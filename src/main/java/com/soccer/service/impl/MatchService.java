package com.soccer.service.impl;

import com.soccer.domain.Match;
import com.soccer.repository.MatchRepository;
import com.soccer.service.IMatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MatchService implements IMatchService {

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
    public List<Match> getTodayMatches() {
        return repo.findTodayMatches();
    }

    @Override
    public Match create(Match match) {
        match = setTeamsCode(match);
        return repo.save(match);
    }

    @Override
    public void remove(Long id) {
        repo.delete(id);
    }

    public Match setTeamsCode(Match match) {
        if(match.getHost() != null) {
            if (match.getHost().getCode() == null && match.getHost().getName() != null) {
                String hostCode = match.getHost().getName().substring(0, 3).toUpperCase();
                match.getHost().setCode(hostCode);
            }
        }
        if(match.getGuest() != null) {
            if (match.getGuest().getCode() == null && match.getGuest().getName() != null) {
                String hostCode = match.getGuest().getName().substring(0, 3).toUpperCase();
                match.getGuest().setCode(hostCode);
            }
        }
        return match;
    }
}
