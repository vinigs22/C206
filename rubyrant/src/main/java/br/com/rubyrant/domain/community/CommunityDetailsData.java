package br.com.rubyrant.domain.community;

import java.math.BigInteger;
import java.util.Date;

public record CommunityDetailsData(
         Long Id,
         String communityname,
         String name,
         String bio,
         String hiperlink,
         BigInteger membersCount,
         BigInteger postsCount,
         String author,
         Date creationDate,
         byte[] profileImage,
         byte[] profileBanner

) {

    public CommunityDetailsData (Community community){

        this(
                community.getId(),
                community.getCommunityname(),
                community.getName(),
                community.getBio(),
                community.getHiperlink(),
                community.getMemberscount(),
                community.getPostcount(),
                community.getAuthor(),
                community.getCreationDate(),
                community.getProfileImage(),
                community.getBannerImage()
        );

    }
}
