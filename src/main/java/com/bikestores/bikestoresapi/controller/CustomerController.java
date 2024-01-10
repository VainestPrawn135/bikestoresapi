package com.bikestores.bikestoresapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikestores.bikestoresapi.model.Customer;
import com.bikestores.bikestoresapi.repository.CustomerRepository;

@CrossOrigin("http://localhost:5173")
@RequestMapping("/api/customers/v1")
@RestController
@ResponseBody
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable Long id){
        Customer customer = customerRepository.findById(id).orElseThrow();
        return ResponseEntity.ok(customer);
    }
}
