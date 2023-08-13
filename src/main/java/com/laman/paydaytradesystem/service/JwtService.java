package com.laman.paydaytradesystem.service;

import io.jsonwebtoken.Claims;

import java.security.Key;
import java.util.function.Function;

public interface JwtService {

    String extractUserEmail(String jwtToken);

    Claims extractAllClaims(String jwtToken);

    Key getSignInKey();

    <T> T extractClaims(String jwtToken, Function<Claims, T> claimResolver);
}
