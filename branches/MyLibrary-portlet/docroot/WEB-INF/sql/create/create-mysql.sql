drop database if exists lportal;
create database lportal character set utf8;
use lportal;

create table AV_MyLibrary (
	id_book bigint not null primary key,
	titolo varchar(75) null,
	descrizione varchar(75) null,
	autori varchar(75) null,
	stato varchar(75) null,
	link_more_info varchar(75) null,
	note varchar(75) null
) engine InnoDB;


create index IX_C624F365 on AV_MyLibrary (autori);
create index IX_16ACC5E0 on AV_MyLibrary (stato);
create index IX_10DDD32 on AV_MyLibrary (titolo);


