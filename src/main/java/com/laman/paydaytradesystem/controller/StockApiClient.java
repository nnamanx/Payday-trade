package com.laman.paydaytradesystem.controller;

import com.laman.paydaytradesystem.model.entity.Stock;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/payday/v1/")
//@FeignClient(name = "stock-api", url = "${stock.api.url}")
public interface StockApiClient {

    @GetMapping("/stocks")
    List<Stock> getAllStocks();
}
