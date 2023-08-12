package com.laman.paydaytradesystem.model.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AuthenticationResponseDto {
    @JsonProperty("access_tokennn")
    String accessToken;

    @JsonProperty("refresh_token")
    String refreshToken;

    @JsonProperty("exp")
    LocalDateTime expiration;
}