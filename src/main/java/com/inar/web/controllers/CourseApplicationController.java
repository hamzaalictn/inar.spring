package com.inar.web.controllers;

import com.inar.web.dto.CourseApplicationDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/course-application")
public class CourseApplicationController {

    @GetMapping
    public String showApplicationForm() {
        return "course-application-form"; // This serves course-application-form.html
    }

    @PostMapping("/submit")
    public String submitApplication(
            @RequestParam("first_name") String firstName,
            @RequestParam("last_name") String lastName,
            @RequestParam("address") String address,
            @RequestParam(value = "phone", required = false) String phone,
            @RequestParam("course") String course,
            @RequestParam("card") String cardNumber,
            @RequestParam("expiry") String expiryDate,
            @RequestParam("cvv") String cvv,
            Model model) {

        // Create the DTO
        CourseApplicationDTO application = new CourseApplicationDTO(
                firstName, lastName, address, phone, course, cardNumber, expiryDate, cvv);

        // Add to the model for the success page
        model.addAttribute("application", application);

        return "application-success"; // Serve application-success.html
    }
}