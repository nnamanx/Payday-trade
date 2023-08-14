package com.laman.paydaytradesystem.service;

import com.laman.paydaytradesystem.model.dto.request.CustomerRequestDto;
import com.laman.paydaytradesystem.model.dto.response.AuthenticationResponseDto;

public interface AuthenticationService {

    AuthenticationResponseDto register(CustomerRequestDto customerRequestDto);

    AuthenticationResponseDto authenticate(CustomerRequestDto customerRequestDto);

}
