create table users(

    id bigint not null auto_increment,
    username varchar(30) not null unique,
    password varchar(255),
    email varchar(100) not null unique,
    name varchar(120) not null,
    telephone varchar(20) not null unique,
    birthdate date not null,
    state varchar(30),
    country varchar(30) not null,

    primary key(id)
);