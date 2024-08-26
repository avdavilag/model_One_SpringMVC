package com.anderson.aprender.springboot.webapp.springboot.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.List; // Add this import statement
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.anderson.aprender.springboot.webapp.springboot.models.User;
import com.anderson.aprender.springboot.webapp.springboot.models.dto.UserDTO;

@Controller
@RequestMapping("/api")
public class UserRestController {

    @GetMapping(path = "/details")
    @ResponseBody
    public UserDTO details() {
        UserDTO userDto = new UserDTO();
        User user = new User("Anderson Vinicio", "Davila Guerrero");
        userDto.setTitle("Hellow Word Spring");
        userDto.setUser(user);
        return userDto;
    }

    @GetMapping("/list-details")
    @ResponseBody
    public List<User> list() {
        User user = new User("Anderson Vinicio", "Davila Guerrero");
        User userone = new User("Juan Andres", "Perez Gonzaga ");
        User usertwo = new User("Marco Luis", "Suarez Benitez");
        List<User> users = Arrays.asList(user, userone, usertwo);
        // List<User> users = new ArrayList<>();
        // users.add(user);
        // users.add(userone);
        // users.add(usertwo);
        return users;
    }

    @GetMapping(path = "/details-map")
    @ResponseBody
    public Map<String, Object> detailsMap() {
        User user = new User("Anderson Vinicio", "Davila Guerrero");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "deHellow World Spring");
        body.put("user", user);
        return body;

    }

}
