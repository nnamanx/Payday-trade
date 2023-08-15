package com.laman.paydaytradesystem.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/payday/v1/")
//@FeignClient(name = "stock-api", url = "${stock.api.url}")
public class StockApiClient {

//    @GetMapping("/stocks")
//    List<StockInfo> getAllStocks();
}
