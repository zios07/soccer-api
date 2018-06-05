package com.soccer.controller;

import com.soccer.domain.Match;
import com.soccer.service.IMatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/matches")
public class MatchController {

    @Autowired
    private IMatchService service;

    @GetMapping
    public Page<Match> getAll(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
      return this.service.getAll(page, size);
    }

    @GetMapping(value = "today")
    public List<Match> getTodayMatches() {
      return this.service.getTodayMatches();
    }


    @PostMapping
    public Match create(@RequestBody Match match) {
      return this.service.create(match);
    }

    @GetMapping(value = "player/{id}")
    public List<Match> getJoinedMatch(@PathVariable Long id) {
      return service.findJoinedMatch(id);
    }
}
