package com.laman.paydaytradesystem.service;

import com.laman.paydaytradesystem.model.entity.Customer;
import com.laman.paydaytradesystem.model.enums.OrderType;

import java.math.BigDecimal;

public interface OrderService {

    void placeOrder(Customer customer, OrderType orderType, String stockSymbol, BigDecimal targetPrice, int quantity);
    void executeOrders();
}
