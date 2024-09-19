package com.anderson.springboot.di.app.springboot_di.repositories;

import java.util.List;

import com.anderson.springboot.di.app.springboot_di.models.Products;

public interface ProductoRepository {
    List<Products> findAll();

    Products findById(Long id);
}
