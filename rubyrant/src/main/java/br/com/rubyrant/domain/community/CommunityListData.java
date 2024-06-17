package br.com.rubyrant.domain.community;

import java.math.BigInteger;
import java.util.Date;

public record CommunityListData(
        Long Id,
        String communityname,
        String name,
        String bio,
        String hiperlink,
        BigInteger memberscount,
        BigInteger postcount,
        String author,
        Date creationDate,
        byte[] profileImage,
        byte[] bannerImage

) {

    public CommunityListData(Community community){
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
