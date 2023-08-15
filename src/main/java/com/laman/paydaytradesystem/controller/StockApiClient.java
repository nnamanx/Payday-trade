package com.laman.paydaytradesystem.controller;

import com.laman.paydaytradesystem.model.entity.Stock;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/payday/v1/")
@FeignClient(url = "https://dummyapi.io/data/api")
public interface StockApiClient {

    @GetMapping("/stocks")
    List<Stock> getAllMockStocks();
}
