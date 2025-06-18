package com.felxx.springboot_commerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felxx.springboot_commerce.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
