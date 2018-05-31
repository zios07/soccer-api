package com.soccer.service;

import com.soccer.domain.Player;

import java.util.List;

public interface IPlayerService {

    Player getById(Long id);

    List<Player> getAll();

    Player create(Player player);

    void remove(Long id);
}
