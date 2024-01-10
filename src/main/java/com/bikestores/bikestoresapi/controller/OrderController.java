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

import com.bikestores.bikestoresapi.model.Order;
import com.bikestores.bikestoresapi.repository.OrderRepository;

@CrossOrigin("http://localhost:5173")
@RequestMapping("/api/orders/v1")
@RestController
@ResponseBody
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/orders")
    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    @GetMapping("/order/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable Long id){
        Order order = orderRepository.findById(id).orElseThrow();
        return ResponseEntity.ok(order);
    }
}
