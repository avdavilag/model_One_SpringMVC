package com.anderson.aprender.springboot.webapp.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anderson.aprender.springboot.webapp.springboot.models.dto.ParamDto;

@RestController
@RequestMapping("api/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false,defaultValue = "Hola que tal",name = "mensaje") String message) {
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }
}
