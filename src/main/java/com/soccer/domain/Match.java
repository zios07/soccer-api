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

  @ManyToOne(cascade = CascadeType.PERSIST)
  private Team host;

  @ManyToOne(cascade = CascadeType.PERSIST)
  private Team guest;

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

  public Match(String label, Address address, Date date, Pitch pitch, Team host, Team guest, Team winner, int hostGoals, int guestGoals, Player manOfTheMatch, String statuts) {
    this.label = label;
    this.address = address;
    this.date = date;
    this.pitch = pitch;
    this.host = host;
    this.guest = guest;
    this.winner = winner;
    this.hostGoals = hostGoals;
    this.guestGoals = guestGoals;
    this.manOfTheMatch = manOfTheMatch;
    this.statuts = statuts;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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

  public Team getHost() {
    return host;
  }

  public void setHost(Team host) {
    this.host = host;
  }

  public Team getGuest() {
    return guest;
  }

  public void setGuest(Team guest) {
    this.guest = guest;
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

  public static int getNb() {
    return nb;
  }

  public static void setNb(int nb) {
    Match.nb = nb;
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

  public Player getManOfTheMatch() {
    return manOfTheMatch;
  }

  public void setManOfTheMatch(Player manOfTheMatch) {
    this.manOfTheMatch = manOfTheMatch;
  }

  public String getStatuts() {
    return statuts;
  }

  public void setStatuts(String statuts) {
    this.statuts = statuts;
  }
}
