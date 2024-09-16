package br.com.userservice.commonslib.model.requests;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;

import java.io.Serial;
import java.io.Serializable;

@Builder
public record AuthenticateRequest(
        @Schema(description = "User email", example = "daniel@gmail.com")
        @Email(message = "Invalid email")
        @NotBlank(message = "Email cannot be empty")
        @Size(min = 6, max = 50, message = "Email must contain between 3 and 50 characters")
        String email,

        @Schema(description = "User password", example = "1234")
        @NotBlank(message = "Password cannot be empty")
        String password) implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
}
