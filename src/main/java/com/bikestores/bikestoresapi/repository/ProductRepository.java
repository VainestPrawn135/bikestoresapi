package com.bikestores.bikestoresapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikestores.bikestoresapi.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
