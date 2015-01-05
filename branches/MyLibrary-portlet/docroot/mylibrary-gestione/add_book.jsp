<%@include file="/init.jsp" %>
<%@include file="/mylibrary-common/header.jsp" %>



<%
MyLibrary bookTemp = null;
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
	
	
	<portlet:actionURL name="addBook" var="addBookURL"/>
	<portlet:renderURL var="indietrolURL">
	  <portlet:param name="jspPage" value="/mylibrary-gestione/mylibrary.jsp" />
	</portlet:renderURL>
	
	<p style="text-align:center;">
		<h2 style="color:#FF0000;">
			Compila i campi per il Nuovo Book
		</h2>
	</p>

	
	<aui:form action="<%= addBookURL.toString() %>" method="post">

		<aui:fieldset>
			
			
			
			<%
			if(request.getAttribute("book") != null){
				bookTemp = (MyLibrary)request.getAttribute("book");
			%>
				<aui:input name="titolo" size="75" value="<%=bookTemp.getTitolo()%>"/>
				<aui:input type="textarea"  name="descrizione" cols="100" rows="8" value="<%=bookTemp.getDescrizione()%>"/>
				<aui:input name="autori"  size="75" value="<%=bookTemp.getAutori()%>"/>
				<aui:input name="link_more_info" size="75" value="<%=bookTemp.getLink_more_info()%>"/>
				<aui:input type="textarea" name="note" cols="100" rows="8" value="<%=bookTemp.getNote()%>"/>
				
				
				
			<%}else{ %>
				<aui:input name="titolo" size="75" value=""/>
				<aui:input type="textarea" name="descrizione" cols="100" rows="8" value=""/>
				<aui:input name="autori"  size="75" value=""/>
				<aui:input name="link_more_info" size="75"  value="http://"/>
				<aui:input type="textarea" name="note" cols="100" rows="8" value=""/>
				
			<%} %>
			
			<aui:select name="stato">
				<aui:option value="In Lettura" selected="selected" >In Lettura</aui:option>
				<aui:option value="Letto">Letto</aui:option>
				<aui:option value="Non Finito">Non Finito</aui:option>
			</aui:select>
			
			<aui:button-row>
				<aui:button type="submit" />
				<aui:button type="cancel" value="Indietro" onClick="<%= indietrolURL.toString() %>" />
			</aui:button-row>
		</aui:fieldset>
	</aui:form>
 
 <%@include file="/mylibrary-common/footer.jsp" %> 