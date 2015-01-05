create table AV_MyLibrary (
	id_book decimal(20,0) not null primary key,
	titolo varchar(75) null,
	descrizione varchar(75) null,
	autori varchar(75) null,
	stato varchar(75) null,
	link_more_info varchar(75) null,
	note varchar(75) null
)
go
