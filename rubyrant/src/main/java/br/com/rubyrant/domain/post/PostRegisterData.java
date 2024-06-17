package br.com.rubyrant.domain.post;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigInteger;

public record PostRegisterData(

        BigInteger user_id,

        BigInteger community_id,

        @NotBlank
        String title,

        @NotNull
        String text,

        byte[] midia,

        @PositiveOrZero
        BigInteger likeCount,

        @PositiveOrZero
        BigInteger dislikeCount,

        @PositiveOrZero
        BigInteger commentsCount

){

}
