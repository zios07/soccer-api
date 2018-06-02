package com.soccer.service.impl;

import com.soccer.domain.Player;
import com.soccer.repository.PlayerRepository;
import com.soccer.service.IPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService implements IPlayerService{

    @Autowired
    private PlayerRepository repo;

    @Override
    public Player getById(Long id) {
        return repo.findOne(id);
    }

    @Override
    public List<Player> getAll() {
        return repo.findAll();
    }

    @Override
    public Player create(Player player) {
        return repo.save(player);
    }

    @Override
    public void remove(Long id) {
        repo.delete(id);
    }
}
