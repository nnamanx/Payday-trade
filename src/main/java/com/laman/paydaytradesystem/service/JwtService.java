package com.laman.paydaytradesystem.service;

public interface JwtService {

    String extractUserEmail(String jwtToken);
}
