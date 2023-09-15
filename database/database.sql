create table coouser(

    id integer primary key,
    name text,
    email text,
    password text

);

create table service(
    
    id integer primary key,
    code integer,
    description text 
);

create table coouserservice(

    service integer,
    coouser    integer,
    "date" timestamp,

    foreign key(coouser) references coouser(id),
    foreign key(service) references service(id)
);