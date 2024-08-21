package com.anderson.aprender.springboot.webapp.springboot.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class UserRestController {

    @GetMapping(path = "/details")
    @ResponseBody
    public Map<String, Object> details() {
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hellow World Spring");
        body.put("name", "Anderson Vinicio");
        body.put("lastname", "Davila Guerrero");

        return body;

    }

}
