package br.com.rubyrant.domain.community;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.math.BigInteger;
import java.util.Date;

public record CommunityRegisterData(

        @NotBlank
        String communityname,

        @NotBlank
        String name,

        @NotBlank
        String bio,

        String hiperlink,

        BigInteger membersCount,

        BigInteger postsCount,

        @NotNull
        String author,

        @NotNull
        @JsonFormat(pattern = "yyyy-MM-dd")
        Date creationdate,

        byte[] profileImage,

        byte[] profileBanner

) {

}
