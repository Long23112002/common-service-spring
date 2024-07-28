package com.longnh.exceptions;

import java.util.Date;
import org.springframework.http.HttpStatus;

public class ExceptionResponse {
  private Integer status;

  private Date timestamp;

  private String message;

  private String messageCode;

  private String description;

  private String path;

  public Integer getStatus() {
    return this.status;
  }

  public Date getTimestamp() {
    return this.timestamp;
  }

  public String getMessage() {
    return this.message;
  }

  public String getMessageCode() {
    return this.messageCode;
  }

  public String getDescription() {
    return this.description;
  }

  public String getPath() {
    return this.path;
  }

  public ExceptionResponse(
      HttpStatus status, Date timestamp, String message, String description, String path) {
    this.status = Integer.valueOf(status.value());
    this.timestamp = timestamp;
    this.message = message;
    this.description = description;
    this.path = path;
  }

  public ExceptionResponse(
      HttpStatus status,
      Date timestamp,
      String message,
      String messageCode,
      String description,
      String path) {
    this.status = Integer.valueOf(status.value());
    this.timestamp = timestamp;
    this.message = message;
    this.description = description;
    this.messageCode = messageCode;
    this.path = path;
  }
}
