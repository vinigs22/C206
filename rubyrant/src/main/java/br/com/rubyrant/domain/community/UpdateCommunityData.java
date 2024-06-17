package br.com.rubyrant.domain.community;

import jakarta.validation.constraints.NotNull;

public record UpdateCommunityData(
        @NotNull
        Long id,
        String communityname,
        String bio,
        String hiperlink,
        byte[] profileImage,
        byte[] profileBanner
) {
}
