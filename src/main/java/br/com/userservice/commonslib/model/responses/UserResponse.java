package br.com.userservice.commonslib.model.responses;

import br.com.userservice.commonslib.model.enums.ProfileEnum;

import java.io.Serializable;
import java.util.Set;

public record UserResponse(
        String id,
        String name,
        String email,
        String password,
        Set<ProfileEnum> profiles
) implements Serializable {
    private static final long serialVersionUID = 1L;
}
