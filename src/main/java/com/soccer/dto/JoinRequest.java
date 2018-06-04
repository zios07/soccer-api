package com.soccer.dto;

import com.soccer.domain.Player;
import com.soccer.domain.Team;

public class JoinRequest {

    private Player player;

    private Team team;

    public JoinRequest() {

    }

    public JoinRequest(Player player, Team team) {
        this.player = player;
        this.team = team;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
