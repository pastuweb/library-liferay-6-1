create table AV_MyLibrary (
	id_book number(30,0) not null primary key,
	titolo VARCHAR2(75 CHAR) null,
	descrizione VARCHAR2(75 CHAR) null,
	autori VARCHAR2(75 CHAR) null,
	stato VARCHAR2(75 CHAR) null,
	link_more_info VARCHAR2(75 CHAR) null,
	note VARCHAR2(75 CHAR) null
);
