package com.bikestores.bikestoresapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikestores.bikestoresapi.model.Staff;

public interface StaffRepository extends JpaRepository<Staff, Long>{
    
}
