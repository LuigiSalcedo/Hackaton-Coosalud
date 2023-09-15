
create table coouserservice(

    service integer,
    coouser    integer,
    date timestamp,

    foreign key(coouser) references coouser(id),
    foreign key(service) references service(id)
);