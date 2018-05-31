package com.soccer.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pitch {

    @Id @GeneratedValue
    private Long id;

    private int pitchNumber;

    private int size;

    private String name;

    public Pitch() {

    }

    public Pitch(int pitchNumber, String name) {
        this.pitchNumber = pitchNumber;
        this.name = name;
        this.size = size;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPitchNumber() {
        return pitchNumber;
    }

    public void setPitchNumber(int pitchNumber) {
        this.pitchNumber = pitchNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
