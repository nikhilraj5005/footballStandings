package com.football.standings.exception;

public class BadRequestException extends RuntimeException {

  public BadRequestException(String ex) {
    super(ex);
  }

  public BadRequestException() {
  }
}
