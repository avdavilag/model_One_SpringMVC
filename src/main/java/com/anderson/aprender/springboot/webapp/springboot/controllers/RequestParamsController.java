package com.anderson.aprender.springboot.webapp.springboot.controllers;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anderson.aprender.springboot.webapp.springboot.models.dto.ParamDto;
import com.anderson.aprender.springboot.webapp.springboot.models.dto.ParamMixDto;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("api/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDto foo(
            @RequestParam(required = false, defaultValue = "Hola que tal") String message) {
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }

    @GetMapping("/bar")
    public ParamMixDto bar(@RequestParam() String text, @RequestParam Integer code) {
        ParamMixDto paramsmix = new ParamMixDto();
        paramsmix.setMessage(text);
        paramsmix.setCode(code);
        return paramsmix;
    }

    @GetMapping("/request")
    public ParamMixDto request(HttpServletRequest request) {
        Integer code = 10;
        try {
            code = Integer.parseInt(request.getParameter("code"));
        } catch (NumberFormatException e) {
        }

        ParamMixDto paramMixDto = new ParamMixDto();
        paramMixDto.setCode(code);
        paramMixDto.setMessage(request.getParameter("message"));

        return paramMixDto;
    }





}
