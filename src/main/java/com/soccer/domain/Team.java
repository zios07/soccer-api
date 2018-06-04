package com.soccer.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name =  "TEAM_TABLE")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class  Team {

    @Id @GeneratedValue
    private Long id;

    private String code;

    private String name;

    @OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Player> players;

    @ManyToMany
    private List<Match> matches;

    public Team() {

    }

  public Team(String code, String name, List<Player> players, List<Match> matches) {
    this.code = code;
    this.name = name;
    this.players = players;
    this.matches = matches;
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

  public List<Match> getMatches() {
    return matches;
  }

  public void setMatches(List<Match> matches) {
    this.matches = matches;
  }
}
