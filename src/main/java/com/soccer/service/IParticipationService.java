package com.soccer.service;

import com.soccer.domain.Match;
import com.soccer.domain.Participation;

import java.util.List;

public interface IParticipationService {

  Participation findByPlayerIdAndMatchId(Long playerId, Long matchId);


  List<Participation> findByPlayerId(Long playerId);

  Participation create(Match match, Long playerId);

  void delete(Long playerId, Long matchId);
}
