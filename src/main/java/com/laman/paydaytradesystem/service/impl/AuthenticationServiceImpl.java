package com.laman.paydaytradesystem.service.impl;

import com.laman.paydaytradesystem.model.dto.request.CustomerRequestDto;
import com.laman.paydaytradesystem.model.dto.response.AuthenticationResponseDto;
import com.laman.paydaytradesystem.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {
    @Override
    public AuthenticationResponseDto register(CustomerRequestDto customerRequestDto) {
        return null;
    }

    @Override
    public AuthenticationResponseDto authenticate(CustomerRequestDto customerRequestDto) {
        return null;
    }
}
