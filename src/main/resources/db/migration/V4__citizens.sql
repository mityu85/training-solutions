create table citizens(
    citizen_id bigint auto_increment not null,
    citizen_name varchar(200) not null,
    zip char(4) not null,
    age bigint not null,
    email varchar(200),
    taj varchar(10),
    number_of_vaccination bigint,
    last_vaccination datetime,
    constraint pk_citizens primary key(citizen_id));