package com.soccer.controller;


import com.soccer.domain.Player;
import com.soccer.dto.UserDto;
import com.soccer.service.Exception.BadCredentials;
import com.soccer.service.Exception.NotFoundException;
import com.soccer.service.IPlayerService;
import com.soccer.service.impl.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/auth")
public class AuthenticationController {

  @Autowired
  private IPlayerService service;

  @Autowired
  private AuthService authService;

    @PostMapping(value = "login")
    public ResponseEntity<Player> login(@RequestBody UserDto user) throws NotFoundException, BadCredentials {
        return new ResponseEntity<>(authService.login(user), HttpStatus.OK);
    }

    @PostMapping(value = "register")
    public ResponseEntity<Player> register(@RequestBody Player player) {
      return new ResponseEntity<>(service.save(player), HttpStatus.CREATED);
    }

}
