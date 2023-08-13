package com.laman.paydaytradesystem.service;

import io.jsonwebtoken.Claims;
import org.springframework.security.core.userdetails.UserDetails;

import java.security.Key;
import java.util.Date;
import java.util.Map;
import java.util.function.Function;

public interface JwtService {

    String extractUserEmail(String jwtToken);

    Claims extractAllClaims(String jwtToken);

    Key getSignInKey();

    <T> T extractClaim(String jwtToken, Function<Claims, T> claimResolver);

    String generateToken(Map<String, Object> extraClaims, UserDetails userDetails);
    String generateToken(UserDetails userDetails);
    boolean isTokenValid(String jwtToken, UserDetails userDetails);

    boolean isTokenExpired(String jwtToken);
    Date extractExpiration(String jwtToken);
}
