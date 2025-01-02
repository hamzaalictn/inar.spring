package com.inar.web.dto;

public record CourseApplicationDTO(
    String firstName,
    String lastName,
    String address,
    String phone, // Optional field
    String course,
    String cardNumber,
    String expiryDate,
    String cvv) {
  // Optional: You can add validation or utility methods here, if needed

  public CourseApplicationDTO {
    // Example: Validate mandatory fields
    if (firstName == null || firstName.isBlank()) {
      throw new IllegalArgumentException("First name must not be blank");
    }
    if (lastName == null || lastName.isBlank()) {
      throw new IllegalArgumentException("Last name must not be blank");
    }
    if (address == null || address.isBlank()) {
      throw new IllegalArgumentException("Address must not be blank");
    }
    if (course == null || course.isBlank()) {
      throw new IllegalArgumentException("Course selection is required");
    }
    if (cardNumber == null || cardNumber.isBlank()) {
      throw new IllegalArgumentException("Card number must not be blank");
    }
    if (expiryDate == null) {
      throw new IllegalArgumentException("Expiry date must not be null");
    }
    if (cvv == null || cvv.isBlank()) {
      throw new IllegalArgumentException("CVV must not be blank");
    }
  }
}
