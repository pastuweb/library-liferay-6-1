# library-liferay-6-1
Automatically exported from code.google.com/p/library-liferay-6-1

With this portlet you can share the books you've read, you're reading.
For every book you can enter: Title, Description, Author, More Info, Notes, Read Status.

I have integrated PDF API: iText jar to export database entries.
 
Data is stored on a MySQL database; the structure is very simple:
service.xml
  <entity name = "MyLibrary" local-service = "true" remote-service = "true">
 
     <! - PK Fields ->
     <column name = "id_book" type = "long" primary = "true" />
 
     <! - Other Fields ->
     <column name = "title" type = "String" />
     <column name = "description" type = "String" />
     <column name = "authors" type = "String" />
     <column name = "status" type = "String" /> <! - In Progress || || bed Not Finished ->
     <column name = "link_more_info" type = "String" />
     <column name = "note" type = "String" />
    
    
     <order by = "desc">
       <order-column name = "id_book" />
     </ order>
 
     <! - Finder Methods ->
     <finder name = "Title" return-type = "Collection">
       <finder-column name = "title" />
     </ finder>
     <finder name = "Authors" return-type = "Collection">
       <finder-column name = "author" />
     </ finder>
     <finder name = "State" return-type = "Collection">
       <finder-column name = "status" />
     </ finder>
    
</ entity>
