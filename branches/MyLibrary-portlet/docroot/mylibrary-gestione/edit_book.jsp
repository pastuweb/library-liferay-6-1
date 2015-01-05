<%@include file="/init.jsp" %>
<%@include file="/mylibrary-common/header.jsp" %>

<%
MyLibrary book = (MyLibrary) request.getAttribute("book");
%>

	

	<liferay-ui:error key="book-titolo-richiesto" message="book-titolo-richiesto" />
	<liferay-ui:error key="book-descrizione-richiesto" message="book-descrizione-richiesto" />
	<liferay-ui:error key="book-stato-richiesto" message="book-stato-richiesto" />
	<liferay-ui:error key="campi-richiesti" message="campi-richiesti" />
	
	<liferay-ui:error key="book-titolo-magg-75" message="book-titolo-magg-75" />
	<liferay-ui:error key="book-descrizione-magg-75" message="book-descrizione-magg-75" />
	<liferay-ui:error key="book-link-magg-75" message="book-link-magg-75" />
	<liferay-ui:error key="book-autori-magg-75" message="book-autori-magg-75" />
	<liferay-ui:error key="book-note-magg-75" message="book-note-magg-75" />
	
	<portlet:actionURL name="updateBook" var="updateBookURL" />


	<portlet:renderURL var="indietrolURL">
	  <portlet:param name="jspPage" value="/mylibrary-gestione/mylibrary.jsp" />
	</portlet:renderURL>
	
	<p style="text-align:center;">
		<h2 style="color:#FF0000;">
			Modifica il Libro corrente
		</h2>
	</p>


<aui:form name="fm" action="<%= updateBookURL.toString() %>" method="post">

  <aui:fieldset>

    <aui:input
        name="resourcePrimKey"
        value="<%= book.getId_book() %>"
        type="hidden"
    />


    <aui:input
        name="titolo"
        value="<%= book.getTitolo() %>"
        size="75"
    />
    <aui:input
        name="descrizione"
        type="textarea"
        value="<%= book.getDescrizione() %>"
        cols="100" rows="8"
    />
    <aui:input
        name="autori"
        value="<%= book.getAutori() %>"
        size="75"
    />
    
    <aui:input
        name="link_more_info"
        value="<%= book.getLink_more_info() %>"
        size="75"
    />
    
    <aui:input
    	type="textarea"
    	cols="100" rows="8"
        name="note"
        value="<%= book.getNote() %>"
        
    />
    
    <aui:select name="stato">
			<aui:option value="In Lettura" selected="selected" >In Lettura</aui:option>
			<aui:option value="Letto">Letto</aui:option>
			<aui:option value="Non Finito">Non Finito</aui:option>
		</aui:select>
    
    
    <aui:button-row>
      <aui:button type="submit"/>
      <aui:button type="cancel" value="Indietro" onClick="<%= indietrolURL.toString() %>" />
    </aui:button-row>

  </aui:fieldset>

</aui:form>

 <%@include file="/mylibrary-common/footer.jsp" %> 