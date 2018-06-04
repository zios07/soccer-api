package com.soccer.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name =  "TEAM_TABLE")
public class  Team {

    @Id @GeneratedValue
    private Long id;

    private String code;

    private String name;

    @OneToMany(mappedBy = "team")
    private List<Player> players;

    @ManyToMany
    private List<Match> matchs;

    public Team() {

    }

  public Team(String code, String name, List<Player> players, List<Match> matchs) {
    this.code = code;
    this.name = name;
    this.players = players;
    this.matchs = matchs;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Player> getPlayers() {
    return players;
  }

  public void setPlayers(List<Player> players) {
    this.players = players;
  }

  public List<Match> getMatchs() {
    return matchs;
  }

  public void setMatchs(List<Match> matchs) {
    this.matchs = matchs;
  }
}
