<%@include file="/init.jsp" %>
<%@include file="/mylibrary-common/header.jsp" %>
	
	<liferay-ui:success key="book-salvato" message="book-salvato" />
	<liferay-ui:success key="book-aggiornato" message="book-aggiornato" />
	<liferay-ui:success key="book-eliminato" message="book-eliminato" />
	<liferay-ui:success key="errore-aggiornamento" message="errore-aggiornamento" />
	<liferay-ui:success key="errore-eliminazione" message="errore-eliminazione" />
	
	<portlet:actionURL name="newBook" var="newBookURL" windowState="maximized" />
	
	<div style="text-align:center;margin:auto;width:400px">
	
		<div style="float:left;text-align:center;">
		<img 
			src="<%=request.getContextPath() %>/images/MyLibrary.png" 
			style="width:80px;" alt="MyLibrary logo" title="MyLibrary"/>
		</div>
		<div style="float:left;">
			<h2 style="color:#FF0000;">
				Books in My Library
			</h2>
		</div>
		<div style="clear:left;"></div>
	</div>
	
	
	<br>
	<form action="<%= newBookURL.toString() %>" id="newBookForm" method="post">
	    <input type="submit" value="<liferay-ui:message key="book-nuovo" />" name="newBookButton" />
	</form>
	<br>
	
	<liferay-ui:search-container emptyResultsMessage="books-non-presenti" delta="10">
	
	    <liferay-ui:search-container-results>
	    <%
	    List<MyLibrary> tempResults = ActionUtil.getBooks(renderRequest);
	
	    results = ListUtil.subList(tempResults, searchContainer.getStart(), searchContainer.getEnd());
	    total = tempResults.size();
	
	    pageContext.setAttribute("results", results);
	    pageContext.setAttribute("total", total);
	    %>
	    </liferay-ui:search-container-results>
	
	    <liferay-ui:search-container-row
	        className="com.appuntivari.mylibrary.model.MyLibrary"
	        keyProperty="id_book"
	        modelVar="book">
	

	      <liferay-ui:search-container-column-text
	          name="titolo"
	          property="titolo" />
	      <liferay-ui:search-container-column-text
	          name="descrizione"
	          property="descrizione" />
	      <liferay-ui:search-container-column-text
	          name="autori"
	          property="autori" />
	      <liferay-ui:search-container-column-text
	          name="stato"
	          property="stato" />
	      <liferay-ui:search-container-column-text
	          name="link_more_info" 
	          value="<%=ActionUtil.createHtmlURL(book.getLink_more_info()) %>" />
	      <liferay-ui:search-container-column-text
	          name="note"
	          property="note" />
	      <liferay-ui:search-container-column-jsp
	          path="/mylibrary-gestione/books_mylibrary_actions.jsp"
	          align="right" />
	
	
	    </liferay-ui:search-container-row>
	
	    <liferay-ui:search-iterator />
	
	  </liferay-ui:search-container>
 
 	<br>
	
 
 
 <%@include file="/mylibrary-common/footer.jsp" %> 