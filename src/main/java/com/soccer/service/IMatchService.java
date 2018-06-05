package com.soccer.service;

import com.soccer.domain.Match;

import java.util.List;

public interface IMatchService {


    Match getById(Long id);

    List<Match> getAll();

    List<Match> getTodayMatches();

    List<Match> findJoinedMatch(Long id);

    Match create(Match match);

    void remove(Long id);
}
