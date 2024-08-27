package com.anderson.aprender.springboot.webapp.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;

import java.util.List;
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
        // model.addAttribute("users", users);
        model.addAttribute("title", "Listado de Usuarios!");
        return "list";
    }

    //// Model Attribute pilas

    @ModelAttribute("users")
    public List<User> UsersModel() {
        List<User> users = Arrays.asList(
                new User("Pepa", "Gonzales"),
                new User("Kerly", "Lopez", "kerly@gmail.com"),
                new User("Diana", "Cañizares", "diana@gmail.com"),
                new User("Esteban", "Cando"));

        return users;
    }

}
