package com.anderson.springboot.di.app.springboot_di.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import com.anderson.springboot.di.app.springboot_di.models.Products;

@SessionScope
@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private List<Products> data;

    public ProductRepositoryImpl() {
        this.data = Arrays.asList(
                new Products(1L, "Memory corsair", 235L),
                new Products(2L, "CPU verifity", 320L),
                new Products(3L, "Teclado Rize Mner", 401L),
                new Products(4L, "Motherborad Gigabyte", 520L));
    }

    @Override
    public List<Products> findAll() {
        return data;
    }

    @Override
    public Products findById(Long id) {
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

}