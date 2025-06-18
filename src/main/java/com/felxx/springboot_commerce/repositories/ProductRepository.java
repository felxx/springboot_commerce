package com.felxx.springboot_commerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felxx.springboot_commerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
