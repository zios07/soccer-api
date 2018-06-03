package com.soccer.domain;

import javax.persistence.*;

@Entity
@Table(name = "ADDRESS_TABLE")
public class Address {

  @Id @GeneratedValue
  private Long id;

  @ManyToOne
  private City city;

  private int zip;

  public Address() {
  }

  public Address(Long id, City city, int zip) {
    this.id = id;
    this.city = city;
    this.zip = zip;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }

  public int getZip() {
    return zip;
  }

  public void setZip(int zip) {
    this.zip = zip;
  }
}
