package com.soccer.service.impl;

import com.soccer.domain.Match;
import com.soccer.domain.Participation;
import com.soccer.domain.Player;
import com.soccer.repository.MatchRepository;
import com.soccer.repository.ParticipationRepository;
import com.soccer.service.IMatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public Page<Match> getAll(int page, int size) {
        return repo.findAll(new PageRequest(page, size, Sort.Direction.DESC, "date"));
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
        return repo.save(match);
    }

    @Override
    public void remove(Long id) {
        repo.delete(id);
    }

}

