package com.felxx.springboot_commerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felxx.springboot_commerce.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
