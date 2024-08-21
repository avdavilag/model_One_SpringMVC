package com.anderson.aprender.springboot.webapp.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        model.addAttribute("title", "Hellow World Spring");
        model.addAttribute("name", "Anderson Vinicio");
        model.addAttribute("lastname", "Davila Guerrero");

        return "details";

    }

}
