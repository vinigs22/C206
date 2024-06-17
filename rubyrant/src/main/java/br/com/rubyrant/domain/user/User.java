package br.com.rubyrant.domain.user;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Table(name = "users")
@Entity(name = "Users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;
    private String name;
    private String telephone;
    private Date birthdate;
    private String state;
    private String country;

    private Boolean active;

    public User(UserRegisterData data){
        this.active = true;
        this.username = data.username();
        this.password = data.password();
        this.email = data.email();
        this.name = data.name();
        this.telephone = data.telephone();
        this.birthdate = data.birthdate();
        this.state = data.state();
        this.country = data.country();
    }

    public void updateInfo(UpdateUserData data){
        if(data.name() != null){
            this.name = data.name();
        }
        if(data.telephone() != null){
            this.telephone = data.telephone();
        }
        if(data.state() != null){
            this.state = data.state();
        }
        if(data.country() != null){
            this.country = data.country();
        }
        if(data.password() != null){
            this.password = data.password();
        }
        if(data.email() != null){
            this.email = data.email();
        }


    }

    public void delete() {
        this.active = false;
    }

}
