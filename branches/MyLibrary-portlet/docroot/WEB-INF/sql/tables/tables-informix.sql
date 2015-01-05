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
