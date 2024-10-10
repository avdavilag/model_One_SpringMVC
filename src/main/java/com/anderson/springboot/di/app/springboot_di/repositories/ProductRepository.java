package com.anderson.springboot.di.app.springboot_di.repositories;

import java.util.List;

import com.anderson.springboot.di.app.springboot_di.models.Products;

public interface ProductRepository {
    List<Products> findAll();

    Products findById(Long id);
}
