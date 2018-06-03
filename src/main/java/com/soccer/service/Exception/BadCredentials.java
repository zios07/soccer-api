package com.soccer.service.Exception;

public class BadCredentials extends Exception {

  private String code;
  private String message;

  public BadCredentials(String code, String message) {
    super();
    this.code = code;
    this.message = message;
  }

}
