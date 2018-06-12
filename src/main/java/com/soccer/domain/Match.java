package com.soccer.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "MATCH_TABLE")
public class Match {

  @Id
  @GeneratedValue
  private Long id;

  private String label;

  @ManyToOne(cascade = CascadeType.ALL)
  private Address address;

  @Temporal(TemporalType.TIMESTAMP)
  private Date date;

  @ManyToOne
  private Pitch pitch;

  private int playersCount;

  private int availablePlaces;

  @ManyToOne
  private Team winner;

  private int hostGoals;

  private int guestGoals;

  private String statuts;

  @ManyToOne
  private Player manOfTheMatch;

  protected static int nb = 1;

  @PrePersist
  protected void setMatchLabel() {
    this.setLabel("Match " + nb);
    nb++;
  }

  public Match() {

  }

  public Match(String label, Address address, Date date, Pitch pitch, int playersCount, int availablePlaces, Team winner, int hostGoals, int guestGoals, String statuts, Player manOfTheMatch) {
    this.label = label;
    this.address = address;
    this.date = date;
    this.pitch = pitch;
    this.playersCount = playersCount;
    this.availablePlaces = availablePlaces;
    this.winner = winner;
    this.hostGoals = hostGoals;
    this.guestGoals = guestGoals;
    this.statuts = statuts;
    this.manOfTheMatch = manOfTheMatch;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Pitch getPitch() {
    return pitch;
  }

  public void setPitch(Pitch pitch) {
    this.pitch = pitch;
  }

  public int getPlayersCount() {
    return playersCount;
  }

  public void setPlayersCount(int playersCount) {
    this.playersCount = playersCount;
  }

  public int getAvailablePlaces() {
    return availablePlaces;
  }

  public void setAvailablePlaces(int availablePlaces) {
    this.availablePlaces = availablePlaces;
  }

  public Team getWinner() {
    return winner;
  }

  public void setWinner(Team winner) {
    this.winner = winner;
  }

  public int getHostGoals() {
    return hostGoals;
  }

  public void setHostGoals(int hostGoals) {
    this.hostGoals = hostGoals;
  }

  public int getGuestGoals() {
    return guestGoals;
  }

  public void setGuestGoals(int guestGoals) {
    this.guestGoals = guestGoals;
  }

  public String getStatuts() {
    return statuts;
  }

  public void setStatuts(String statuts) {
    this.statuts = statuts;
  }

  public Player getManOfTheMatch() {
    return manOfTheMatch;
  }

  public void setManOfTheMatch(Player manOfTheMatch) {
    this.manOfTheMatch = manOfTheMatch;
  }

  public static int getNb() {
    return nb;
  }

  public static void setNb(int nb) {
    Match.nb = nb;
  }
}
