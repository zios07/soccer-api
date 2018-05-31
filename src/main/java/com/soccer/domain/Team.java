package com.soccer.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Team {

    @Id @GeneratedValue
    private Long id;

    @OneToMany
    private List<Player> players;

    @ManyToMany
    private List<Match> matchs;

    public Team() {

    }

    public Team(List<Player> players, List<Match> matchs) {
        this.players = players;
        this.matchs = matchs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
