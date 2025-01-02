package com.inar.web.controllers;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

class UserControllerTest {

  @Test
  void showLoginPage() {
    LoginController controller = new LoginController();
    Model model = new BindingAwareModelMap();
    String result = controller.showLoginPage("UserTest", model);
    assertThat(result).isEqualTo("login");
    assertThat(model.getAttribute("user")).isEqualTo("UserTest");
  }
}
