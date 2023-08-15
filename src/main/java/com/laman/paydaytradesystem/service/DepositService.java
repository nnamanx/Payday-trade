package com.laman.paydaytradesystem.service;

import com.laman.paydaytradesystem.model.dto.response.DepositResponse;

public interface DepositService {

    DepositResponse depositCash(Long userId, Double amount);

}
