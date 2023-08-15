package com.laman.paydaytradesystem.controller;

import com.laman.paydaytradesystem.model.entity.Stock;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//@FeignClient (url = "https://dummyapi.io/data/api")
//@FeignClient(value = "rate", url = "${https://dummyapi.io/data/api}")
public interface StockApiClient {

    @GetMapping("/stocks")
    List<Stock> getAllMockStocks();
}
