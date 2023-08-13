package com.laman.paydaytradesystem.controller;

import com.laman.paydaytradesystem.model.dto.request.AuthenticationRequestDto;
import com.laman.paydaytradesystem.model.dto.request.CustomerRequestDto;
import com.laman.paydaytradesystem.model.dto.response.AuthenticationResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("payday/v1/auth")
public class AuthenticationController {

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponseDto> register(@RequestBody CustomerRequestDto customerRequestDto) {

        return null;
    }


    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponseDto> register(@RequestBody AuthenticationRequestDto authenticationRequest) {
                                                                                                   
        return null;
    }
}
