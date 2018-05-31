package com.soccer.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Statistic {

    @Id
    @GeneratedValue
    private Long id;

    private int matchCount;

    public Statistic() {
    }

    public Statistic(int matchCount) {
        this.matchCount = matchCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMatchCount() {
        return matchCount;
    }

    public void setMatchCount(int matchCount) {
        this.matchCount = matchCount;
    }

}
