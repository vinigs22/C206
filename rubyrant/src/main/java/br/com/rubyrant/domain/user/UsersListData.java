package br.com.rubyrant.domain.user;

import java.util.Date;

public record UsersListData(
        Long id,
        String username,
        String password,
        String email,
        String name,
        String telephone,
        Date birthdate,
        String state,
        String country
) {

    public UsersListData(User user){
        this(
                user.getId(),
                user.getUsername(),
                user.getPassword(),
                user.getEmail(),
                user.getName(),
                user.getTelephone(),
                user.getBirthdate(),
                user.getState(),
                user.getCountry()
        );
    }

}
