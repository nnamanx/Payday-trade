package com.laman.paydaytradesystem.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient (url = "https://dummyapi.io/data/api")
@FeignClient(value = "rate", url = "$https://dummyjson.com/}")
@Component
public interface StockApiClient {

    @GetMapping("/products")
    String getAllMockStocks();

}
