package com.laman.paydaytradesystem.model.dto.request;

import com.laman.paydaytradesystem.model.enums.Role;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import static com.laman.paydaytradesystem.model.constants.Messages.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomerRequestDto {

    @NotBlank
    String fullName;
    @NotBlank
    @Email(message = INVALID_EMAIL)
    String email;
    @NotBlank(message = INVALID_PASSWORD)
    @Size(min = 6, message = PASSWORD_RULE)
    String password;


}
