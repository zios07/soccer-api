package com.soccer.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PLAYER_TABLE")
public class Player {

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    private String lastName;

    @Lob
    private byte[] image;

    private String preferredPosition;

    private String email;

    private String username;

    private String password;

    @ManyToOne(cascade = CascadeType.ALL)
    private Address address;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Team team;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Participation> participations;

    @OneToOne
    private Statistic statistic;

    public Player() {

    }

    public Player(String firstName, String lastName, String email, String username, String password, Statistic statistic,
                  String preferredPosition, byte[] image, Address address, List<Participation> participations) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
        this.statistic = statistic;
        this.preferredPosition = preferredPosition;
        this.image = image;
//        this.team = team;
        this.address = address;
        this.participations = participations;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Statistic getStatistic() {
        return statistic;
    }

    public void setStatistic(Statistic statistic) {
        this.statistic = statistic;
    }

    public String getPreferredPosition() {
        return preferredPosition;
    }

    public void setPreferredPosition(String preferredPosition) {
        this.preferredPosition = preferredPosition;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

//    public Team getTeam() {
//        return team;
//    }
//
//    public void setTeam(Team team) {
//        this.team = team;
//    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Participation> getParticipations() {
        return participations;
    }

    public void setParticipations(List<Participation> participations) {
        this.participations = participations;
    }
}

