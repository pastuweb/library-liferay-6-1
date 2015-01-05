drop database lportal;
create database lportal pagesize 8192;
connect to lportal;
create table AV_MyLibrary (
	id_book bigint not null primary key,
	titolo varchar(75),
	descrizione varchar(75),
	autori varchar(75),
	stato varchar(75),
	link_more_info varchar(75),
	note varchar(75)
);


create index IX_C624F365 on AV_MyLibrary (autori);
create index IX_16ACC5E0 on AV_MyLibrary (stato);
create index IX_10DDD32 on AV_MyLibrary (titolo);


