create table community(

        id BIGINT not null AUTO_INCREMENT,
        communityname varchar(50) not null unique,
        name varchar(30) not null unique,
        bio varchar(300) not null,
        hiperlink varchar(120),
        memberscount BIGINT,
        postcount BIGINT,
        author varchar(80),
        creation_date date,
        profile_image BLOB,
        banner_image BLOB,

        primary key(id)
);