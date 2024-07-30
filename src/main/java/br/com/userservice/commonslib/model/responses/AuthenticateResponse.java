package br.com.userservice.commonslib.model.responses;

import lombok.Builder;

@Builder
public record AuthenticateResponse(
        String token,
        String type
) {
}
