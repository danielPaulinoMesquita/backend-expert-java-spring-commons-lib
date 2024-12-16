package br.com.userservice.commonslib.model.responses;

import lombok.Builder;
import lombok.With;

@Builder
@With
public record AuthenticateResponse(
        String token,
        String refreshToken,
        String type
) {
}
