package br.com.userservice.commonslib.model.requests;

import br.com.userservice.commonslib.model.enums.ProfileEnum;
import lombok.With;

import java.util.Set;

@With
public record CreateUserRequest(
        String name,
        String email,
        String password,
        Set<ProfileEnum> profiles
) {}