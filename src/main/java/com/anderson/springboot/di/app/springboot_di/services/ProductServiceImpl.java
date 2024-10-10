package com.anderson.springboot.di.app.springboot_di.services;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.anderson.springboot.di.app.springboot_di.models.Products;
import com.anderson.springboot.di.app.springboot_di.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private Environment environment;
    @Autowired
    private ProductRepository repository;

    // private ProductRepositoryImpl repository = new ProductRepositoryImpl();

    @Override
    public List<Products> findAll() {
        return repository.findAll().stream().map(p -> {
            Double priceTax = p.getPrice() * environment.getProperty("config.price.tax",Double.class);
            // Products newProd = new Products(p.getId(), p.getName(),
            // priceImp.longValue());
            // Products newProd = (Products) p.clone();
            // newProd.setPrice(priceTax.longValue());
            // return newProd;
            p.setPrice(priceTax.longValue());
            return p;
        }).collect(Collectors.toList());
    }

    @Override
    public Products findById(Long id) {
        return repository.findById(id);

    }
}
