package com.soccer.service.impl;

import com.soccer.domain.Match;
import com.soccer.domain.Participation;
import com.soccer.repository.MatchRepository;
import com.soccer.repository.ParticipationRepository;
import com.soccer.service.IParticipationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ParticipationService implements IParticipationService {


  @Autowired
  private ParticipationRepository participationRepository;

  @Autowired
  private MatchRepository matchRepository;


  @Override
  public Participation findByPlayerIdAndMatchId(Long playerId, Long matchId) {
    return participationRepository.findByPlayerIdAndMatchId(playerId, matchId);
  }

  @Override
  public List<Participation> findByPlayerId(Long playerId) {
    return participationRepository.findByPlayerId(playerId);
  }

  @Override
  public Participation create(Match m, Long playerId) {

    Participation participation = new Participation(m, playerId);
    participation = participationRepository.save(participation);
      Match match = matchRepository.findOne(m.getId());
      match.setAvailablePlaces(match.getAvailablePlaces() - 1);
      matchRepository.save(match);
    return participation;
  }

  @Override
  public void delete(Long playerId, Long matchId) {
    Participation participation = participationRepository.findByPlayerIdAndMatchId(playerId, matchId);
    if(participation != null) {
      participationRepository.delete(participation.getId());
    }
  }
}
