package com.soccer.controller;

import com.soccer.domain.Player;
import com.soccer.dto.JoinRequest;
import com.soccer.service.ICityService;
import com.soccer.service.IPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/players")
public class PlayerController {

    @Autowired
    private IPlayerService service;

    @GetMapping
    public ResponseEntity<List<Player>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Player> getById(@PathVariable Long id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Player> update(@RequestBody Player player) {
        return new ResponseEntity<>(service.save(player), HttpStatus.OK);
    }

}
