<%@include file="/init.jsp" %>

<%
ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

	MyLibrary myBook = (MyLibrary) row.getObject();
	String name = MyLibrary.class.getName();
	String primKey = String.valueOf(myBook.getPrimaryKey());
%>

<liferay-ui:icon-menu>

    <portlet:actionURL name="editBook" var="editBookURL">
      <portlet:param name="resourcePrimKey" value="<%= primKey %>" />
    </portlet:actionURL>

    <liferay-ui:icon image="edit" message="Edit" url="<%= editBookURL.toString() %>" />

    <portlet:actionURL name="deleteBook" var="deleteBookURL">
      <portlet:param name="resourcePrimKey" value="<%= primKey %>" />
    </portlet:actionURL>

    <liferay-ui:icon-delete url="<%= deleteBookURL.toString() %>" />

    <liferay-security:permissionsURL
        modelResource="<%= MyLibrary.class.getName() %>"
        modelResourceDescription="<%= myBook.getTitolo() %>"
        resourcePrimKey="<%= primKey %>"
        var="permissionsURL" />

    <liferay-ui:icon image="permissions" url="<%= permissionsURL.toString() %>" />

</liferay-ui:icon-menu>

