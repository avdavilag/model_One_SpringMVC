package com.anderson.aprender.springboot.webapp.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import java.util.ArrayList; // Add this import statement
import com.anderson.aprender.springboot.webapp.springboot.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Anderson Vinicio", "Davila Guerrero");
        user.setEmail("avdg@gmail.com");
        model.addAttribute("title", "Hellow World Spring");
        model.addAttribute("user", user);

        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        List<User> users = new ArrayList<>();
        model.addAttribute("users", users);
        model.addAttribute("title", "Listado de usuario");
        return "list";
    }

}
