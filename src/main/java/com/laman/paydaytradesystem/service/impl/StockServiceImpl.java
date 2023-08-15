package com.laman.paydaytradesystem.service.impl;

import com.laman.paydaytradesystem.controller.StockApiClient;
import com.laman.paydaytradesystem.model.entity.Stock;
import com.laman.paydaytradesystem.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StockServiceImpl implements StockService {


    private final StockApiClient stockApiClient;


    public List<Stock> getAllStocks() {
        return stockApiClient.getAllStocks();
    }

}
