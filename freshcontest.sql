create database freshcontest;
use freshcontest;

create table winners(
    id_winner int auto_increment,
    name varchar(50),
    beer_in_body varchar(50),
    constraint pk_id_winner primary key (id_winner)
);