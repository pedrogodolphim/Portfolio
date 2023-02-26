create database mg;

use mg;

create table reserva(
	id 				integer auto_increment primary key,
    nome 			varchar(100) not null,
    email			varchar(200) not null unique,
    telefone		varchar(15) not null,
    data_reserva	date not null,
    evento			varchar(50) not null
    );

select * from reserva;
