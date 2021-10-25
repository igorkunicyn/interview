drop database if exists cinema;

create database cinema;

drop table if exists films;

create table films(
id int(11) not null primary key auto_increment,
title varchar(255) not null,
duration time
);

insert into films values(1,'Matrix', '01:00:00'),
(2,'Outcast', '01:30:00'),(3,'Miracle', '02:00:00'),(4,'Races', '01:30:00');

select * from films;

drop table if exists sessions;

create table sessions(
id int(11) not null primary key auto_increment,
start_ datetime,
id_film int(11) not null,
price int(11),
foreign key (id_film) references films (id)
);

insert into sessions values
(1, '2021-10-23 09:00:00', 1, 200), (2,'2021-10-23 10:20:00' , 1, 250), 
(3, '2021-10-23 15:00:00', 1, 300), (4,'2021-10-23 18:00:00' , 1, 300), 
(5, '2021-10-23 18:00:00', 1, 350), (6,'2021-10-23 10:30:00' , 2, 250), 
(7, '2021-10-23 13:30:00', 2, 300), (8,'2021-10-23 15:20:00' , 2, 300), 
(9, '2021-10-23 19:30:00', 2, 350), (10,'2021-10-23 22:20:00' , 2, 350), 
(11, '2021-10-23 11:40:00', 3, 350), (12,'2021-10-23 15:00:00' , 3, 350), 
(13, '2021-10-23 17:10:00', 3, 400), (14,'2021-10-23 20:30:00' , 3, 400), 
(15, '2021-10-23 09:40:00', 4, 300), (16,'2021-10-23 12:10:00' , 4, 350), 
(17, '2021-10-23 17:10:00', 4, 350), (18,'2021-10-23 19:30:00' , 4, 350); 

select * from sessions;

drop table if exists tickets;

create table tickets(
id int not null primary key auto_increment,
id_session int not null,
foreign key (id_session) references sessions (id)
);

insert into tickets (id_session) values (1), (1), (1), (2), (2),(3),(3),(3),(3),
(4), (5), (5), (5), (5), (5), (5), (5), (6), (6), (7), (7), (7), (8), (9), (9), (9), 
(11), (11), (12), (12), (13), (14), (14), (14), (14),(15), (15), (15), (16), (16), (17), (17),
(17), (17),(4), (5), (5), (18), (18), (5), (5), (5), (6);

select * from tickets;

