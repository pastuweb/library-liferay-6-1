database sysmaster;
drop database lportal;
create database lportal WITH LOG;

create procedure 'lportal'.isnull(test_string varchar)
returning boolean;
IF test_string IS NULL THEN
	RETURN 't';
ELSE
	RETURN 'f';
END IF
end procedure;


create table AV_MyLibrary (
	id_book int8 not null primary key,
	titolo varchar(75),
	descrizione varchar(75),
	autori varchar(75),
	stato varchar(75),
	link_more_info varchar(75),
	note varchar(75)
)
extent size 16 next size 16
lock mode row;


create index IX_C624F365 on AV_MyLibrary (autori);
create index IX_16ACC5E0 on AV_MyLibrary (stato);
create index IX_10DDD32 on AV_MyLibrary (titolo);


