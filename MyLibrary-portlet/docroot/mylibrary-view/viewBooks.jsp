<%@include file="/init.jsp" %>
<%@include file="/mylibrary-common/header.jsp" %>
	
	
	<div style="text-align:center;margin:auto;width:400px">
	
	
		<div style="float:left;text-align:center;">
		<img 
			src="<%=request.getContextPath() %>/images/MyLibrary.png" 
			style="width:80px;" alt="MyLibrary logo" title="MyLibrary"/>
		</div>
		<div style="float:left;">
			<h2 style="color:#FF0000;margin-left:20px;">
				Books in My Library
			</h2>
		</div>
		<div style="clear:left;"></div>
	</div>
	
	<br>
		
	<portlet:resourceURL var="submitFormDetailsResourceURL" escapeXml="false"/>
	<p style="text-align:right;">
	    <a style="font-size:16px;" href="<%=submitFormDetailsResourceURL%>" target="_blank">
	    	Download <strong>PDF</strong>
	    </a>
    </p>
    
	<br/>
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
			
			
			
			    </liferay-ui:search-container-row>
			
			    <liferay-ui:search-iterator />
			
			 </liferay-ui:search-container>


 <%@include file="/mylibrary-common/footer.jsp" %> 