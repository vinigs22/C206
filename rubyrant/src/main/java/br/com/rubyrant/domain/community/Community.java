package br.com.rubyrant.domain.community;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigInteger;
import java.util.Date;

@Table(name = "community")
@Entity(name = "Community")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Community {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String communityname;
    private String name;
    private String bio;
    private String hiperlink;
    private BigInteger memberscount;
    private BigInteger postcount;
    private String author;
    private Date creationDate;
    @Lob
    private byte[] profileImage;
    @Lob
    private byte[] bannerImage;

    private Boolean active; //delete var


    public Community(CommunityRegisterData data){
        this.communityname = data.communityname();
        this.name = data.name();
        this.bio = data.bio();
        this.hiperlink = data.hiperlink();
        this.memberscount = BigInteger.ZERO;
        this.postcount = BigInteger.ZERO;
        this.author = data.author();
        this.creationDate = data.creationdate();
        this.profileImage = data.profileImage();
        this.bannerImage = data.profileBanner();
        this.active = true;

    }

    public void updateInfo(UpdateCommunityData data){
        if(data.communityname() != null){
            this.communityname = data.communityname();
        }
        if(data.bio() != null){
            this.bio = data.bio();
        }
        if(data.hiperlink() != null){
            this.hiperlink = data.hiperlink();
        }
        if(data.profileImage() != null){
            this.profileImage = data.profileImage();
        }
        if(data.profileBanner() != null){
            this.bannerImage = data.profileBanner();
        }

    }
    public void delete() {
        this.active = false;
    }
}
