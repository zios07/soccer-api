package com.soccer.domain;

import javax.persistence.*;

@Entity
@Table(name = "ADDRESS_TABLE")
public class Address {

  @Id @GeneratedValue
  private Long id;

  private String value;

  private double lat;

  private double lng;

  public Address() {
  }

  public Address(String value, double lat, double lng) {
    this.value = value;
    this.lat = lat;
    this.lng = lng;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public double getLat() {
    return lat;
  }

  public void setLat(double lat) {
    this.lat = lat;
  }

  public double getLng() {
    return lng;
  }

  public void setLng(double lng) {
    this.lng = lng;
  }
}
