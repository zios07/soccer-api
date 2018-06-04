package com.soccer.repository;

import com.soccer.domain.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface MatchRepository  extends JpaRepository<Match, Long> {


  @Query(nativeQuery = true, value = "select * from match_table m where m.date = current_date")
  List<Match> findTodayMatches();

}
