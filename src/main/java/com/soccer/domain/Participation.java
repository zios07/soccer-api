package com.soccer.domain;

import javax.persistence.*;

@Entity
@Table(name = "PARTICIPATION_TABLE")
public class Participation {

  @Id
  @GeneratedValue
  private Long id;

  @OneToOne
  private Match match;

  private Long playerId;

  public Participation() {

  }

  public Participation(Match match, Long player) {
    this.match = match;
    this.playerId = player;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Match getMatch() {
    return match;
  }

  public void setMatch(Match match) {
    this.match = match;
  }

  public Long getPlayerId() {
    return playerId;
  }

  public void setPlayerId(Long playerId) {
    this.playerId = playerId;
  }
}
