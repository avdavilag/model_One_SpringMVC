package com.anderson.springboot.di.app.springboot_di.controllers;

import java.util.*;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anderson.springboot.di.app.springboot_di.models.Products;
import com.anderson.springboot.di.app.springboot_di.services.ProductService;

@RestController
@RequestMapping("/api")
public class SomeController {

    private ProductService service = new ProductService();

    @GetMapping
    public List<Products> list() {

        return service.findAll();
    }

    @GetMapping("/{id}")
    public Products show(@PathVariable Long id) {
        return service.findById(id);
    }

}