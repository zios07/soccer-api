package com.soccer.service.impl;

import com.soccer.domain.Player;
import com.soccer.domain.Team;
import com.soccer.domain.User;
import com.soccer.dto.JoinRequest;
import com.soccer.repository.PlayerRepository;
import com.soccer.repository.TeamRepository;
import com.soccer.service.Exception.NotFoundException;
import com.soccer.service.IPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PlayerService implements IPlayerService{

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private TeamRepository teamRepository;

    @Override
    public Player getById(Long id) {
        return playerRepository.findOne(id);
    }

  @Override
  public Player findByUsername(String username) throws NotFoundException {
    Player player = playerRepository.findByUsername(username);
    if(player == null)
      throw new NotFoundException("PLAYER.NOT.FOUND", "Player with username : "+username+" not found");
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
}
