package com.inar.web.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

class CourseApplicationControllerTest {

  @Test
  void showApplicationForm() {
    // Arrange
    CourseApplicationController controller = new CourseApplicationController();

    // Act
    String result = controller.showApplicationForm();

    // Assert
    assertEquals("course-application-form", result);
  }

  @Test
  void submitApplication() {
    // Arrange
    CourseApplicationController controller = new CourseApplicationController();
    String firstName = "John";
    String lastName = "Doe";
    String address = "123 Main St";
    String phone = "1234567890";
    String course = "Computer Science";
    String cardNumber = "1234123412341234";
    String expiryDate = "12/26";
    String cvv = "123";
    Model model = new ExtendedModelMap();

    // Act
    String result =
        controller.submitApplication(
            firstName, lastName, address, phone, course, cardNumber, expiryDate, cvv, model);

    // Assert
    assertEquals("application-success", result);
  }
}
