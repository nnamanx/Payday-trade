package com.laman.paydaytradesystem.service;

import java.math.BigDecimal;

public interface StockPriceService {

    void initializeStockPrices();
    BigDecimal getStockPrice(String stockSymbol);
}
