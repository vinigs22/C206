package br.com.rubyrant.domain.post;

import br.com.rubyrant.domain.user.UpdateUserData;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;

@Table(name = "post")
@Entity(name = "Post")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private BigInteger user_id;
    private BigInteger community_id;
    private String title;
    private String text;
    @Lob
    private byte[] midia;
    private BigInteger like_count;
    private BigInteger dislike_count;
    private BigInteger comments_count;

    private Boolean active;


    public Post (PostRegisterData data){
        this.active = true;
        this.user_id = data.user_id();
        this.community_id = data.community_id();
        this.title = data.title();
        this.text = data.text();
        this.midia = data.midia();
        this.like_count = data.likeCount();
        this.dislike_count = data.dislikeCount();
        this.comments_count = data.commentsCount();
    }


    public void updateInfo(UpdatePostData data){
        if(data.title() != null){
            this.title = data.title();
        }
        if(data.text() != null){
            this.text = data.text();
        }
    }

    public void delete() {
        this.active = false;
    }


}
