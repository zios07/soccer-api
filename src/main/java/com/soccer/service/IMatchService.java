package com.soccer.service;

import com.soccer.domain.Match;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IMatchService {


    Match getById(Long id);

    Page<Match> getAll(int page, int size);

    List<Match> getTodayMatches();

    List<Match> findJoinedMatch(Long id);

    Match create(Match match);

    void remove(Long id);
}
