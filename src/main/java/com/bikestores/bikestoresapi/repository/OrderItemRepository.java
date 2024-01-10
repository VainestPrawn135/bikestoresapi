package com.bikestores.bikestoresapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikestores.bikestoresapi.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    
}
