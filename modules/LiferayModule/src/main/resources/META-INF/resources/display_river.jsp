<%@page import="javax.portlet.PortletSession"%>
<%@ include file="/init.jsp" %>

<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<portlet:defineObjects />

<%@ include file="/header.jsp" %>

<% String Table = (String)request.getAttribute("Details"); %>

<h1 style="text-align:center; margin: 0 auto;">Details River</h1>
<br><br>
	<div>
	<%= Table %>
	</div>