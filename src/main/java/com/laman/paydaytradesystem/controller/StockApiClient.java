package com.laman.paydaytradesystem.controller;

import com.laman.paydaytradesystem.model.dto.request.StockDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@FeignClient(value = "StockData", url = "https://dummyjson.com/products")
@Component
public interface StockApiClient {

    @GetMapping()
    List<StockDTO> getAllMockStocks();






}
