package com.anderson.springboot.di.app.springboot_di.services;

import java.util.*;
import java.util.stream.Collectors;

import com.anderson.springboot.di.app.springboot_di.models.Products;
import com.anderson.springboot.di.app.springboot_di.repositories.ProductRepository;

public class ProductService {

    private ProductRepository repository = new ProductRepository();

    public List<Products> findAll() {
        return repository.findAll().stream().map(p -> {
            Double priceTax = p.getPrice() * 1.25d;
            // Products newProd = new Products(p.getId(), p.getName(),
            // priceImp.longValue());
            Products newProd = (Products) p.clone();
            newProd.setPrice(priceTax.longValue());
            return newProd;
        }).collect(Collectors.toList());
    }

    public Products findById(Long id) {
        return repository.findById(id);

    }
}
