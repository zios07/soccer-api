package com.soccer.repository;

import com.soccer.domain.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface MatchRepository  extends JpaRepository<Match, Long> {


  @Query(nativeQuery = true, value = "select * from match_table m where  DATEDIFF(day, CURRENT_DATE, m.date) = 0")
  List<Match> findTodayMatches();

}
