package com.laman.paydaytradesystem.service;

import com.laman.paydaytradesystem.model.entity.Customer;
import com.laman.paydaytradesystem.model.entity.OrderStock;

public interface CustomerService {

    void executeOrderAndUpdateBalance(OrderStock order, Double currentPrice);

    Customer registerCustomer(String username, String email, String password);

    String generateActivationCode();

    String generateActivationLink(Long userId, String activationCode);

    void activateUser(Long userId, String activationCode);
}
