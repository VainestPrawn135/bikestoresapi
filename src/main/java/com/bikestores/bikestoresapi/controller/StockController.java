package com.bikestores.bikestoresapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikestores.bikestoresapi.model.Stock;
import com.bikestores.bikestoresapi.repository.StockRepository;

@CrossOrigin("http://localhost:5173")
@RequestMapping("/api/stock/v1")
@RestController
@ResponseBody
public class StockController {
    @Autowired
    private StockRepository stockRepository;

    @GetMapping("/stock")
    public List<Stock> getAllStock(){
        return stockRepository.findAll();
    }
}
