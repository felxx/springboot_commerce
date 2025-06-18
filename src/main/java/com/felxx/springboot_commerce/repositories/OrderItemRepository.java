package com.felxx.springboot_commerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felxx.springboot_commerce.entities.OrderItem;
import com.felxx.springboot_commerce.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
