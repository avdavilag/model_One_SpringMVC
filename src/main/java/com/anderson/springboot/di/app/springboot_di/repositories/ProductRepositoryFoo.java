package com.anderson.springboot.di.app.springboot_di.repositories;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.anderson.springboot.di.app.springboot_di.models.Products;

@Repository
public class ProductRepositoryFoo implements ProductRepository {

    @Override
    public List<Products> findAll() {
        return Collections.singletonList(new Products(1L, "Monitor Asus 27", 600L));
    }

    @Override
    public Products findById(Long id) {
        return new Products(id, "Monitor Asus 27", 600L);
    }

}
