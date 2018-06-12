package com.soccer.controller;

import com.soccer.domain.Match;
import com.soccer.domain.Participation;
import com.soccer.service.IParticipationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/participations")
public class ParticipationController {

  @Autowired
  private IParticipationService participationService;

  @PostMapping(value = "{playerId}")
  public Participation addParticipation(@RequestBody Match match, @PathVariable Long playerId) {
    return participationService.create(match, playerId);
  }

  @GetMapping(value = "player/{playerId}")
  public List<Participation> getParticipationsForPlayer(@PathVariable Long playerId) {
    return participationService.findByPlayerId(playerId);
  }

  @DeleteMapping(value = "player/{playerId}/match/{matchId}")
  public ResponseEntity quiteMatch(@PathVariable Long playerId, @PathVariable Long matchId) {
    participationService.delete(playerId, matchId);
    return ResponseEntity.ok().build();
  }

}
