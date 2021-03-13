create table trackpoints(id bigint auto_increment, trackpoint_time datetime, lat double, lon double, activity_id BIGINT,
constraint pk_trackpoints primary key(id),
constraint fk_trackpoints foreign key(activity_id) references activities(id));