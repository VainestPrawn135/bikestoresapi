package com.bikestores.bikestoresapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikestores.bikestoresapi.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}
