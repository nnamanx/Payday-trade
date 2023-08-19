package com.laman.paydaytradesystem.service;

import com.laman.paydaytradesystem.model.dto.request.StockDTO;

import java.util.List;

public interface StockService {

    List<StockDTO> fetchStocks();
}
