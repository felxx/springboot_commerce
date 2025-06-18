package com.felxx.springboot_commerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felxx.springboot_commerce.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
