package com.soccer.domain;

import javax.persistence.*;

@Entity
@Table(name = "PARTICIPATION_TABLE")
public class Participation {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    private Team team;

    @OneToOne
    private Match match;

    public Participation() {

    }

    public Participation(Team team, Match match) {
        this.team = team;
        this.match = match;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }
}
