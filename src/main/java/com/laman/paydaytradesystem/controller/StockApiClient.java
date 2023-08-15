package com.laman.paydaytradesystem.controller;

import com.laman.paydaytradesystem.model.entity.Stock;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/payday/v1/")
@FeignClient(name = "dummy-json-api", url = "https://dummyapi.io/data/api")
public interface StockApiClient {

    @GetMapping("/stocks")
    List<Stock> getAllMockStocks();
}
