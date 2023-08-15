package com.laman.paydaytradesystem.service.impl;

import com.laman.paydaytradesystem.service.StockPriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class StockPriceServiceImpl implements StockPriceService {

    private Map<String, BigDecimal> stockPrices = new HashMap<>();

    @Override
    @PostConstruct
    public void initializeStockPrices() {

        stockPrices.put("TSLA", new BigDecimal("250.00"));
        stockPrices.put("AAPL", new BigDecimal("180.00"));
        // +++ and some more
    }

    @Override
    public BigDecimal getStockPrice(String stockSymbol) {

        BigDecimal initialPrice = stockPrices.get(stockSymbol);
        BigDecimal randomChange = BigDecimal.valueOf(Math.random() * 20 - 10);
        return initialPrice.add(randomChange);
    }
}
