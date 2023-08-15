package com.laman.paydaytradesystem.service.impl;

import com.laman.paydaytradesystem.model.dto.request.CustomerRequestDto;
import com.laman.paydaytradesystem.model.dto.response.AuthenticationResponseDto;
import com.laman.paydaytradesystem.model.entity.Customer;
import com.laman.paydaytradesystem.model.enums.Role;
import com.laman.paydaytradesystem.repository.CustomerRepository;
import com.laman.paydaytradesystem.service.AuthenticationService;
import com.laman.paydaytradesystem.service.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

    private final CustomerRepository customerRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;


    @Override
    public AuthenticationResponseDto register(CustomerRequestDto customerRequestDto) {

        var customer = Customer.builder()
                .fullName(customerRequestDto.getFullName())
                .email(customerRequestDto.getEmail())
                .password(passwordEncoder.encode(customerRequestDto.getPassword()))
                .role(Role.USER)    // defining USER as a default
                .build();

        customerRepository.save(customer);

        var jwtToken = jwtService.generateToken(customer);

        return AuthenticationResponseDto.builder()
                .token(jwtToken)
                .build();
    }

    @Override
    public AuthenticationResponseDto authenticate(@NotNull CustomerRequestDto customerRequestDto) {

        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                customerRequestDto.getEmail(),
                customerRequestDto.getPassword())
        );

        var customer = customerRepository.findByEmail(customerRequestDto.getEmail());
          

        var jwtToken = jwtService.generateToken(customer);

        return AuthenticationResponseDto.builder()
                .token(jwtToken)
                .build();
    }
}
