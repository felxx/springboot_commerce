package com.felxx.springboot_commerce.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felxx.springboot_commerce.entities.Product;
import com.felxx.springboot_commerce.repositories.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> productOptional = productRepository.findById(id);
        return productOptional.get();
    }
}
