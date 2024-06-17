package br.com.rubyrant.domain.post;

import jakarta.validation.constraints.NotNull;

import java.math.BigInteger;

public record UpdatePostData(
        @NotNull
        Long id,
        BigInteger user_id,
        BigInteger community_id,
        String title,
        String text,
        byte[] midia,
        BigInteger like_count,
        BigInteger dislike_count,
        BigInteger comments_count
) {
}
