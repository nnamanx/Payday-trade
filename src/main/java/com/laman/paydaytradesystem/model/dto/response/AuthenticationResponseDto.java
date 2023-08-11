package com.laman.paydaytradesystem.model.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class AuthenticationResponseDto {
    @JsonProperty("access_tokennn")
    String accessToken;

    @JsonProperty("refresh_token")
    String refreshToken;

    @JsonProperty("exp")
    LocalDateTime expiration;
}