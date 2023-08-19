package com.laman.paydaytradesystem.controller;


import com.laman.paydaytradesystem.model.dto.request.StockDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/payday/v1/stocks")

public class StockController {

    private final StockApiClient stockApiClient;

    @GetMapping("/all")
    public List<StockDTO> getAllStocks() {

        return stockApiClient.getAllMockStocks();
    }

}
