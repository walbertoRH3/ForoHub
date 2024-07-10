create table topicos(
    id bigint not null auto_increment,
    titulo varchar(100) not null,
    mensaje varchar(300) not null,
    fecha varchar(50) not null,
    estatus tinyint not null,
    autor int(3) not null,
    curso varchar(100) not null,

    primary key(id)
);