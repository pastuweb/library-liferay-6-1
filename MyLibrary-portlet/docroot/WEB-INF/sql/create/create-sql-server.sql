drop database lportal;
create database lportal;

go

use lportal;

create table AV_MyLibrary (
	id_book bigint not null primary key,
	titolo nvarchar(75) null,
	descrizione nvarchar(75) null,
	autori nvarchar(75) null,
	stato nvarchar(75) null,
	link_more_info nvarchar(75) null,
	note nvarchar(75) null
);


create index IX_C624F365 on AV_MyLibrary (autori);
create index IX_16ACC5E0 on AV_MyLibrary (stato);
create index IX_10DDD32 on AV_MyLibrary (titolo);


