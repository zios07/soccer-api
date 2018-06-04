package com.soccer.service;

import com.soccer.domain.Player;
import com.soccer.dto.JoinRequest;
import com.soccer.service.Exception.NotFoundException;

import java.util.List;

public interface IPlayerService {

    Player getById(Long id);

    Player findByUsername(String username) throws NotFoundException;

    List<Player> getAll();

    Player save(Player player);

    void remove(Long id);
}
