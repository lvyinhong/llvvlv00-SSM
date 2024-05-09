create database SSM;
use SSM;
create table SSM.User(
    id       int unsigned auto_increment primary key,
    username varchar(20) null,
    password varchar(20) null,
    age      int         null,
    gender   char        null,
    email    varchar(50) null
)charset = utf8mb4;

