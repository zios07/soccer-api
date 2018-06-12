package com.soccer.repository;

import com.soccer.domain.Participation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface ParticipationRepository extends JpaRepository<Participation, Long> {


  List<Participation> findByPlayerId(Long id);

  Participation findByPlayerIdAndMatchId(Long playerId, Long matchId);
}
