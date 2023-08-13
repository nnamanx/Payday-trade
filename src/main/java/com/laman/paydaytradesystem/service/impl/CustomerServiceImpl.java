package com.laman.paydaytradesystem.service.impl;

import com.laman.paydaytradesystem.model.entity.OrderStock;
import com.laman.paydaytradesystem.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    @Override
    public void executeOrderAndUpdateBalance(OrderStock order, Double currentPrice) {


    }
}
