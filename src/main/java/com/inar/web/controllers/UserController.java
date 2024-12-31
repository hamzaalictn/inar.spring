package com.inar.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @GetMapping("/login")
    public String sayHello(@RequestParam(value = "name", defaultValue = "User") String name, Model model) {
        model.addAttribute("user", name);
        return "login";
    }
}
