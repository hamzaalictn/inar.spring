package com.inar.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/** Custom exception thrown when a requested user is not found. */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

  /**
   * Constructs a new UserNotFoundException with the specified detail message.
   *
   * @param message the detail message.
   */
  public UserNotFoundException(String message) {
    super(message);
  }

  /**
   * Constructs a new UserNotFoundException with the specified detail message and cause.
   *
   * @param message the detail message.
   * @param cause the cause of the exception.
   */
  public UserNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }
}
