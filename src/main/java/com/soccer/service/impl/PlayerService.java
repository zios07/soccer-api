package com.soccer.service.impl;

import com.soccer.domain.Participation;
import com.soccer.domain.Player;
import com.soccer.domain.Team;
import com.soccer.domain.User;
import com.soccer.dto.JoinRequest;
import com.soccer.repository.ParticipationRepository;
import com.soccer.repository.PlayerRepository;
import com.soccer.repository.TeamRepository;
import com.soccer.service.Exception.NotFoundException;
import com.soccer.service.IPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Iterator;
import java.util.List;

@Service
@Transactional
public class PlayerService implements IPlayerService {

  @Autowired
  private PlayerRepository playerRepository;

  @Autowired
  private TeamRepository teamRepository;

  @Autowired
  private ParticipationRepository participationRepository;

  @Override
  public Player getById(Long id) {
    return playerRepository.findOne(id);
  }

  @Override
  public Player findByUsername(String username) throws NotFoundException {
    Player player = playerRepository.findByUsername(username);
    if (player == null)
      throw new NotFoundException("PLAYER.NOT.FOUND", "Player with username : " + username + " not found");
    return player;
  }

  @Override
  public List<Player> getAll() {
    return playerRepository.findAll();
  }

  @Override
  public Player save(Player player) {
    return playerRepository.save(player);
  }

  @Override
  public void remove(Long id) {
    playerRepository.delete(id);
  }

  @Override
  public Player quitMatch(Long playerId, Long matchId) {
    Player player = playerRepository.findOne(playerId);
    List<Participation> participations = player.getParticipations();
//    participations.stream().forEach(participation -> {
//      if(participation.getMatch().getId() == matchId) {
//        participationRepository.delete(participation.getId());
//        participations.remove(participation);
//      }
//    });
    Iterator<Participation> it = participations.iterator();
    while(it.hasNext()) {
      Participation p = it.next();
      if(p.getMatch().getId() == matchId) {
        participationRepository.delete(p.getId());
        it.remove();
      }
    }
    if(participations.size() == 0)
      player.setParticipations(null);
    else
      player.setParticipations(participations);
    return playerRepository.save(player);
  }
}

