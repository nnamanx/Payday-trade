package com.laman.paydaytradesystem.service.impl;

import com.laman.paydaytradesystem.service.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class JwtServiceImpl implements JwtService {
    
    @Override
    public String extractUserEmail(String jwtToken) {
        return null;
    }
}
