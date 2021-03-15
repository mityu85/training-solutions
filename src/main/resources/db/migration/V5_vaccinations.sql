create table vaccinations(
    vaccination_id bigint auto_increment not null,
    citizen_id bigint not null,
    vaccination_date datetime not null,
    status varchar(10),
    note varchar(200),
    vaccination_type varchar(20),
    constraint pk_vaccinations primary key(vaccination_id),
    constraint fk_citizens foreign key(citizen_id) references citizens(citizen_id));