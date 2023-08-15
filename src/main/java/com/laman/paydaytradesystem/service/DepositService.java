package com.laman.paydaytradesystem.service;

import com.laman.paydaytradesystem.model.dto.response.DepositResponse;

import java.math.BigDecimal;

public interface DepositService {

    DepositResponse depositCash(Long userId, BigDecimal amount);

}
