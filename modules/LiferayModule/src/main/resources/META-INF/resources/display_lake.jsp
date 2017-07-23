<%@page import="javax.portlet.PortletSession"%>
<%@ include file="/init.jsp" %>
<%@page import="com.lake.model.lakes"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<portlet:defineObjects />

<%@ include file="/header.jsp" %>
<%@page import="java.util.List"%>
<% String Table = (String)request.getAttribute("Details"); %>
<h1 style="text-align: center;">Details Lake</h1>

<br><br>

	<div>
	<%= Table %>
	</div>