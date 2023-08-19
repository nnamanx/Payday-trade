package com.laman.paydaytradesystem.controller;


import com.laman.paydaytradesystem.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/payday/v1/stocks")

public class StockController {

    private final StockService stockService;


//    @GetMapping
//    public ResponseEntity<List<Stock>> listMockStocks() {
//        List<StockDTO> mockStocks = stockService.getAllMockStocks();
//        return ResponseEntity.ok(mockStocks);
//        return null;
//    }

}
