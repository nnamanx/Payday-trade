package com.laman.paydaytradesystem.controller;

import com.laman.paydaytradesystem.model.dto.request.CustomerRequestDto;
import com.laman.paydaytradesystem.model.dto.response.AuthenticationResponseDto;
import com.laman.paydaytradesystem.service.AuthenticationService;
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

    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponseDto> register(@RequestBody CustomerRequestDto customerRequestDto) {

        return ResponseEntity.ok(authenticationService.register(customerRequestDto));
    }


    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponseDto> authenticate(@RequestBody CustomerRequestDto customerRequestDto ) {

        return ResponseEntity.ok(authenticationService.authenticate(customerRequestDto)); 
    }
}
