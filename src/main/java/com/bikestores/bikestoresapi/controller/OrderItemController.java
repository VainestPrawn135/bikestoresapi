package com.bikestores.bikestoresapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikestores.bikestoresapi.model.OrderItem;
import com.bikestores.bikestoresapi.repository.OrderItemRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin("http://localhost:5173")
@RequestMapping("/api/orderitems/v1")
@RestController
@ResponseBody
public class OrderItemController {
    @Autowired
    private OrderItemRepository orderItemRepository;

    @GetMapping("/orderitems")
    public List<OrderItem> getAllOrderItems() {
        return orderItemRepository.findAll();
    }
}
