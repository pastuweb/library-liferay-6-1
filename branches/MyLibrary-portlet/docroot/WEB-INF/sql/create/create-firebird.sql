create database 'lportal.gdb' page_size 8192 user 'sysdba' password 'masterkey';
connect 'lportal.gdb' user 'sysdba' password 'masterkey';
create table AV_MyLibrary (id_book int64 not null primary key,titolo varchar(75),descrizione varchar(75),autori varchar(75),stato varchar(75),link_more_info varchar(75),note varchar(75));
