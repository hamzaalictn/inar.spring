package com.inar.web.controllers;

import com.inar.web.dto.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/** REST Controller for handling login-related API endpoints. */
@RestController
public class LoginRestController {

  /**
   * Endpoint to provide a greeting message.
   *
   * @param name the name to include in the greeting, defaults to "Inar" if not provided
   * @return a {@link Greeting} object containing the greeting message
   */
  @GetMapping("/rest")
  public Greeting greet(@RequestParam(defaultValue = "Inar") String name) {
    return new Greeting("Hello " + name + "!");
  }
}
