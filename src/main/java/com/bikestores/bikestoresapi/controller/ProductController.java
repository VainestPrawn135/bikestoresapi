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

import com.bikestores.bikestoresapi.model.Product;
import com.bikestores.bikestoresapi.repository.ProductRepository;

@CrossOrigin("http://localhost:5173")
@RequestMapping("/api/product/v1")
@RestController
@ResponseBody
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id){
        Product product = productRepository.findById(id).orElseThrow();
        return ResponseEntity.ok(product);
    }
}
