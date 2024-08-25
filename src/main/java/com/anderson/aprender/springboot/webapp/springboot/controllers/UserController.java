package com.anderson.aprender.springboot.webapp.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.anderson.aprender.springboot.webapp.springboot.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Anderson Vinicio", "Davila Guerrero");
        model.addAttribute("title", "Hellow World Spring");
        model.addAttribute("user", user);

        return "details";

    }

}
