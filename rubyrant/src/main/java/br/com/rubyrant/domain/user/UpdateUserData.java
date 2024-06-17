package br.com.rubyrant.domain.user;

import jakarta.validation.constraints.NotNull;

public record UpdateUserData(
        @NotNull
        Long id,
        String name,
        String telephone,
        String state,
        String country,
        String password,
        String email
) {
}
