package com.laman.paydaytradesystem.controller;


import com.laman.paydaytradesystem.model.entity.Stock;
import com.laman.paydaytradesystem.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/payday/v1/stocks")

public class StockController {

    private final StockService stockService;


    @GetMapping
    public ResponseEntity<List<Stock>> listMockStocks() {
        List<Stock> mockStocks = stockService.getAllMockStocks();
        return ResponseEntity.ok(mockStocks);
    }
}
