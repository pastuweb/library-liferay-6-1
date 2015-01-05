drop user &1 cascade;
create user &1 identified by &2;
grant connect,resource to &1;
connect &1/&2;
set define off;

create table AV_MyLibrary (
	id_book number(30,0) not null primary key,
	titolo VARCHAR2(75 CHAR) null,
	descrizione VARCHAR2(75 CHAR) null,
	autori VARCHAR2(75 CHAR) null,
	stato VARCHAR2(75 CHAR) null,
	link_more_info VARCHAR2(75 CHAR) null,
	note VARCHAR2(75 CHAR) null
);


create index IX_C624F365 on AV_MyLibrary (autori);
create index IX_16ACC5E0 on AV_MyLibrary (stato);
create index IX_10DDD32 on AV_MyLibrary (titolo);



quit