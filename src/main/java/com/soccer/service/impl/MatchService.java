package com.soccer.service.impl;

import com.soccer.domain.Match;
import com.soccer.domain.Participation;
import com.soccer.repository.MatchRepository;
import com.soccer.repository.ParticipationRepository;
import com.soccer.service.IMatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MatchService implements IMatchService {

    @Autowired
    private MatchRepository repo;

    @Autowired
    private ParticipationRepository participationRepository;

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
    public List<Match> findJoinedMatch(Long id) {
        List<Participation> playerParticipations = participationRepository.findByPlayerId(id);
        List<Match> matches = new ArrayList<>();
        if(playerParticipations != null) {
          playerParticipations.stream().forEach(participation -> {
            matches.add(participation.getMatch());
          });
        }
        return matches;
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
