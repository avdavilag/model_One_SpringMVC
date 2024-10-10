package com.anderson.springboot.di.app.springboot_di.repositories;

import java.util.List;
import java.io.IOException;
import java.util.Arrays;
import org.springframework.core.io.ClassPathResource;

import com.anderson.springboot.di.app.springboot_di.models.Products;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ProductRepositoryJson implements ProductRepository {

    private List<Products> list;

    public ProductRepositoryJson() {
        ClassPathResource resource = new ClassPathResource("json/product.json");
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            list = Arrays.asList(objectMapper.readValue(resource.getInputStream(), Products[].class));
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Products> findAll() {
        return list;
    }

    @Override
    public Products findById(Long id) {
        return list.stream().filter(p -> p.getId().equals(id)).findFirst().orElseThrow();
    }

}
