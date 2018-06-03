package com.soccer.service.impl;

import com.soccer.domain.Player;
import com.soccer.dto.UserDto;
import com.soccer.repository.PlayerRepository;
import com.soccer.service.Exception.BadCredentials;
import com.soccer.service.Exception.NotFoundException;
import com.soccer.service.IAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService implements IAuthService {

    @Autowired
    private PlayerRepository repo;

    @Override
    public Player login(UserDto user) throws NotFoundException, BadCredentials {
      Player player = repo.findByUsername(user.getUsername());
      if(player == null)
        throw new NotFoundException("PLAYER.NOT.FOUND", "Player with username : "+ user.getUsername() +"not found");
      if(!player.getPassword().equals(user.getPassword()))
        throw new BadCredentials("INVALID.CREDENTIALS", "Username or password incorrect");
      return player;
    }

}

