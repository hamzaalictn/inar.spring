package com.inar.web.controllers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

/** Unit tests for {@link UserController} using MockMvc for web layer testing. */
@WebMvcTest(UserController.class)
public class UserControllerMockMVCTest {

  @Autowired private MockMvc mockMvc;

  /** Verifies that the MockMvc object is properly autowired. */
  @Test
  void shouldAutowireMockMvcSuccessfully() {
    assertThat(mockMvc).as("MockMvc should be autowired and not null").isNotNull();
  }

  /**
   * Tests that the login page loads correctly without a user-provided name. Verifies the view name
   * and default user model attribute.
   *
   * @throws Exception if the request fails
   */
  @Test
  void shouldLoadLoginPageWithDefaultUser() throws Exception {
    mockMvc
        .perform(get("/login"))
        .andExpect(status().isOk())
        .andExpect(view().name("login"))
        .andExpect(model().attribute("user", "User"));
  }

  /**
   * Tests that the login page loads correctly with a user-provided name. Verifies the view name and
   * the user model attribute matches the provided name.
   *
   * @throws Exception if the request fails
   */
  @Test
  void shouldLoadLoginPageWithProvidedUserName() throws Exception {
    mockMvc
        .perform(get("/login").param("name", "TestUser"))
        .andExpect(status().isOk())
        .andExpect(view().name("login"))
        .andExpect(model().attribute("user", "TestUser"));
  }
}
