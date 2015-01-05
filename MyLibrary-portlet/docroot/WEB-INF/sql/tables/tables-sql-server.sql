create table AV_MyLibrary (
	id_book bigint not null primary key,
	titolo nvarchar(75) null,
	descrizione nvarchar(75) null,
	autori nvarchar(75) null,
	stato nvarchar(75) null,
	link_more_info nvarchar(75) null,
	note nvarchar(75) null
);
