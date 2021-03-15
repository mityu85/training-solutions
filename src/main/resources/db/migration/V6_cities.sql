create table cities(
    city_id bigint auto_increment not null,
    zip char(4) not null,
    city varchar(40) not null,
    constraint pk_cities primary key(city_id));