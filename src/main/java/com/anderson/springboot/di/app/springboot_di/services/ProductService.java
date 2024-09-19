package com.anderson.springboot.di.app.springboot_di.services;

import java.util.List;

import com.anderson.springboot.di.app.springboot_di.models.Products;

public interface ProductService {

    List<Products> findAll();

    Products findById(Long id);

}
