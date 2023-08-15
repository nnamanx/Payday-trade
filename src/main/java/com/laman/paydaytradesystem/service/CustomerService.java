package com.laman.paydaytradesystem.service;

import com.laman.paydaytradesystem.model.dto.request.CustomerRequestDto;
import com.laman.paydaytradesystem.model.dto.response.AuthenticationResponseDto;
import com.laman.paydaytradesystem.model.dto.response.ResponseDto;
import com.laman.paydaytradesystem.model.entity.OrderStock;
import org.apache.coyote.Response;

import java.math.BigDecimal;

public interface CustomerService {

    void executeOrderAndUpdateBalance(OrderStock order, Double currentPrice);
    
}
