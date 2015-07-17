With this portlet you can share the books you've read, you're reading.
For every book you can enter: Title, Description, Author, More Info, Notes, Read Status.

I have integrated PDF API: iText jar to export database entries.

Data is stored on a MySQL database; the structure is very simple:
service.xml
> 

&lt;entity name = "MyLibrary" local-service = "true" remote-service = "true"&gt;



> <! - PK Fields ->
> 

&lt;column name = "id\_book" type = "long" primary = "true" /&gt;



> <! - Other Fields ->
> 

&lt;column name = "title" type = "String" /&gt;


> 

&lt;column name = "description" type = "String" /&gt;


> 

&lt;column name = "authors" type = "String" /&gt;


> 

&lt;column name = "status" type = "String" /&gt;

 <! - In Progress | || bed Not Finished ->|
|:|
> 

&lt;column name = "link\_more\_info" type = "String" /&gt;


> 

&lt;column name = "note" type = "String" /&gt;




> 

&lt;order by = "desc"&gt;


> > 

&lt;order-column name = "id\_book" /&gt;



> </ order>

> <! - Finder Methods ->
> 

&lt;finder name = "Title" return-type = "Collection"&gt;


> > 

&lt;finder-column name = "title" /&gt;



> </ finder>
> 

&lt;finder name = "Authors" return-type = "Collection"&gt;


> > 

&lt;finder-column name = "author" /&gt;



> </ finder>
> 

&lt;finder name = "State" return-type = "Collection"&gt;


> > 

&lt;finder-column name = "status" /&gt;



> </ finder>

</ entity>