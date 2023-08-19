package com.laman.paydaytradesystem.service.impl;

import com.laman.paydaytradesystem.service.JwtService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;


@Service
@RequiredArgsConstructor
public class JwtServiceImpl implements JwtService {

    @Value("${application.security.secret-key}")
    String SECRET_KEY;


    @Override
    public String extractUserEmail(String jwtToken) {

        return extractClaim(jwtToken, Claims::getSubject);
    }


    // extracting all claims
    @Override
    public Claims extractAllClaims(String jwtToken) {

        return Jwts.parser()
                .setSigningKey(getSignInKey())
                .parseClaimsJws(jwtToken)
                .getBody();
    }


    // extracting one claim
    @Override
    public <T> T extractClaim(String jwtToken, Function<Claims, T> claimResolver) {

        final Claims claims = extractAllClaims(jwtToken);
        return claimResolver.apply(claims);
    }

    @Override
    public Key getSignInKey() {

        byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
    }

    @Override
    public String generateToken(Map<String, Object> extraClaims, UserDetails userDetails) {

        return Jwts.builder()
                .setClaims(extraClaims)
                .setSubject(userDetails.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 24))
                .signWith(getSignInKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    @Override
    public String generateToken(UserDetails userDetails) {

        return generateToken(new HashMap<>(), userDetails);
    }


    @Override
    public boolean isTokenValid(String jwtToken, UserDetails userDetails) {

        final String username = extractUserEmail(jwtToken);

        return (username.equals(userDetails.getUsername())) && !isTokenExpired(jwtToken);
    }

    @Override
    public boolean isTokenExpired(String jwtToken) {

        return extractExpiration(jwtToken).before(new Date());
    }

    @Override
    public Date extractExpiration(String jwtToken) {

        return extractClaim(jwtToken, Claims::getExpiration);
    }


}
