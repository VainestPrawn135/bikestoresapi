package com.bikestores.bikestoresapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikestores.bikestoresapi.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
