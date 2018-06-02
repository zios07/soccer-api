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

  @ManyToOne
  private Address address;

  @Temporal(TemporalType.TIMESTAMP)
  private Date date;

  @ManyToOne
  private Pitch pitch;

  @ManyToOne
  private Team host;

  @ManyToOne
  private Team guest;

  protected static int nb = 1;

  @PrePersist
  protected void setMatchLabel() {
    this.setLabel("Match " + nb);
    nb++;
  }

  public Match() {

  }

  public Match(Address address, Date date, Pitch pitch, Team host, Team guest) {
    this.date = date;
    this.pitch = pitch;
    this.host = host;
    this.guest = guest;
    this.address = address;
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
}
