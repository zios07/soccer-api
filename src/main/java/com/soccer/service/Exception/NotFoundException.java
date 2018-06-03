package com.soccer.service.Exception;

public class NotFoundException extends Exception {

  private String code;
  private String message;

  public NotFoundException(String code, String message) {
    super();
    this.code = code;
    this.message = message;
  }

}
