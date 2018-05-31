package com.soccer.repository;

import com.soccer.domain.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository  extends JpaRepository<Match, Long> {
}
