package com.felxx.springboot_commerce.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felxx.springboot_commerce.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    
    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1L, "João", "joao@gmail.com", "9999999999", "1234");
        return ResponseEntity.ok().body(user);
    }
}
