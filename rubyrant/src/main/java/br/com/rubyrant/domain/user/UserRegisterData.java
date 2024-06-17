package br.com.rubyrant.domain.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


import java.util.Date;

public record UserRegisterData(
        @NotBlank
        String username,

        @NotBlank
        String password,

        @NotBlank
        @Email
        String email,

        @NotBlank
        String name,

        @NotBlank
        String telephone,

        @NotNull
        @JsonFormat(pattern = "yyyy-MM-dd")
        Date birthdate,

        String state,

        @NotBlank
        String country
){
}
