package com.soccer.domain;

import javax.persistence.*;

@Entity
@Table(name = "ADDRESS_TABLE")
public class Address {

  @Id @GeneratedValue
  private Long id;

  private String city;

  private int zip;

  public Address() {
  }

  public Address(Long id, String city, int zip) {
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

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public int getZip() {
    return zip;
  }

  public void setZip(int zip) {
    this.zip = zip;
  }
}
