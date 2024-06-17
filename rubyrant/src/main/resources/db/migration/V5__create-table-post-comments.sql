create table post (
    id BIGINT AUTO_INCREMENT primary key,
    user_id BIGINT,
    community_id BIGINT,
    title varchar(255) not null,
    text TEXT not null,
    midia BLOB,
    like_count int default 0,
    dislike_count int default 0,
    comments_count int default 0,
    foreign key (user_id) references users(id),
    foreign key (community_id) references community(id),
    check (user_id is not null or community_id is not null)
);

create table comments (
    id BIGINT AUTO_INCREMENT primary key,
    post_id BIGINT not null,
    user_id BIGINT not null,
    text TEXT not null,
    image BLOB,
    created_at timestamp default current_timestamp,
    foreign key (post_id) references post(id), -- Correção aqui
    foreign key (user_id) references users(id)
);
