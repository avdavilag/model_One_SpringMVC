package com.anderson.springboot.di.app.springboot_di.repositories;

import java.util.Arrays;
import java.util.List;

import com.anderson.springboot.di.app.springboot_di.models.Products;

public class ProductRepository {

    private List<Products> data;

    public ProductRepository() {
        this.data = Arrays.asList(
                new Products(1L, "Memory corsair", 2L),
                new Products(2L, "CPU verifity", 3L),
                new Products(3L, "Teclado Rize Mner", 4L),
                new Products(4L, "Motherborad Gigabyte", 5L));
    }

    public List<Products> findAll() {
        return data;
    }

    public Products findById(Long id) {
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

}