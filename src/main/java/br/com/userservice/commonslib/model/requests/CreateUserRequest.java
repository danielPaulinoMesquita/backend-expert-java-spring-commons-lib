package br.com.userservice.commonslib.model.requests;

import br.com.userservice.commonslib.model.enums.ProfileEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.With;

import java.util.Set;

@With
public record CreateUserRequest(
        @Schema(description = "User name", example = "Daniel Paulino")
        @NotEmpty(message = "Name cannot be empty")
        @Size(min = 3, max = 50, message = "Name must contain between 3 and 50 characters")
        String name,

        @Schema(description = "User email", example = "daniel@gmail.com")
        @Email(message = "Invalid email")
        @Size(min = 6, max = 50, message = "Email must contain between 3 and 50 characters")
        String email,


        @Schema(description = "User password", example = "123@teste")
        @Size(min = 6, max = 50, message = "Password must contain between 3 and 50 characters")
        @NotBlank(message = "Password cannot be empty")
        String password,

        @Schema(description = "User profiles", example = "[ROLE_ADMIN, ROLE_CUSTOMER]")
        Set<ProfileEnum> profiles
) {}