package com.anderson.aprender.springboot.webapp.springboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anderson.aprender.springboot.webapp.springboot.models.User;
import com.anderson.aprender.springboot.webapp.springboot.models.dto.ParamDto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.HashMap;
import java.util.Map; // Add this import statement
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @Value("${config.username}")
    private String username;

    // @Value("${config.message}")
    // private String message;

    // @Value("${config.listOfValues}")
    // private String[] listOfValues;
    @Value("'${config.listOfValues}")
    private List<String> listOfValues;

    @Value("${config.code}")
    private Integer code;

    @Value("#{'${config.listOfValues}'.toUpperCase().split(',')}")
    private List<String> valueList;

    @Value("#{'${config.listOfValues}'.toUpperCase()}")
    private String valueString;

    @GetMapping("/baz/{message}")
    public ParamDto baz(@PathVariable() String message) {

        ParamDto paramDto = new ParamDto();
        paramDto.setMessage(message);

        return paramDto;
    }

    @GetMapping("/mix/{product}/{id}")
    public Map<String, Object> mixPathVar(@PathVariable String product, @PathVariable Long id) {
        Map<String, Object> json = new HashMap<>();
        json.put("product", product);
        json.put("id", id);

        return json;
    }

    @PostMapping("/create")
    public User create(@RequestBody User user) {
        // Create User into DataBase
        user.setName(user.getName().toUpperCase());
        return user;
    }

    @GetMapping("/values")
    public Map<String, Object> values(@Value("${config.message}") String message) {

        Map<String, Object> json = new HashMap<>();
        json.put("username", username);
        json.put("code", code);
        json.put("message", message);
        json.put("listOfValues", listOfValues);
        json.put("valueString", valueString);
        json.put("valueList", valueList);

        return json;
    }

}
