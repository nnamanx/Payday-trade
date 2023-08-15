package com.laman.paydaytradesystem.service.impl;

import com.laman.paydaytradesystem.exception.CustomerNotFoundException;
import com.laman.paydaytradesystem.model.dto.response.DepositResponse;
import com.laman.paydaytradesystem.model.entity.Customer;
import com.laman.paydaytradesystem.repository.CustomerRepository;
import com.laman.paydaytradesystem.service.DepositService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepositServiceImpl implements DepositService {

    private CustomerRepository customerRepository;

    @Override
    public DepositResponse depositCash(Long userId, Double amount) {

        // Getting customer's account from the repository
        Customer customer = customerRepository.findById(userId).orElseThrow(CustomerNotFoundException::new);

        // Increase user's cash balance
        Double currentBalance = customer.getBalance();
        Double newBalance = currentBalance.add(amount);
        customer.setBalance(newBalance);
        customerRepository.save(customer);

        DepositResponse response = new DepositResponse();
        response.setNewBalance(newBalance);
        return response;
    }
}
