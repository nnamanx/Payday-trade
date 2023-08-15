package com.laman.paydaytradesystem.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient (url = "https://dummyapi.io/data/api")
@FeignClient(value = "rate", url = "${https://dummyapi.io/data/api}")
public interface StockApiClient {

    @GetMapping("/stocks")
    String getAllMockStocks();

}
