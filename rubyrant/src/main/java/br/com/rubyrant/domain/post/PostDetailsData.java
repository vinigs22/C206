package br.com.rubyrant.domain.post;

import java.math.BigInteger;

public record PostDetailsData(
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

    public PostDetailsData (Post post){

        this(
                post.getId(),
                post.getUser_id(),
                post.getCommunity_id(),
                post.getTitle(),
                post.getText(),
                post.getMidia(),
                post.getLike_count(),
                post.getDislike_count(),
                post.getComments_count()

        );

    }

}
