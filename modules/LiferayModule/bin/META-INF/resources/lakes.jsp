


<%@page import="javax.portlet.PortletSession"%>
<%@ include file="/init.jsp" %>
<%@page import="com.lake.model.lakes"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<portlet:defineObjects />

<%@ include file="/header.jsp" %>
<%@page import="java.util.List"%>

<liferay-portlet:renderURL varImpl="iteratorURL">
<portlet:param name="mvcPath" value="/lakes.jsp" />
</liferay-portlet:renderURL>

<h1>Welcome to the lakes page</h1>

<%
	
	
		
		
			final HttpSession _session = request.getSession(true);
			List<lakes> lakeslist;
			if( (List<lakes>)request.getAttribute("Lakes")== null){
				 lakeslist = (List<lakes>)_session.getAttribute("Lakeslist");
				
			}
			else{
				 lakeslist = (List<lakes>)request.getAttribute("Lakes");
			}
			
			_session.setAttribute("Lakeslist", lakeslist);
			int size = lakeslist.size();
			System.out.println("Size"+size);
			%>
			
			
			<liferay-ui:search-container
				emptyResultsMessage="there-are-no-lakes"
				headerNames="Lakeid,Name"
				iteratorURL="<%= iteratorURL %>"
				delta="4"
				deltaConfigurable="true">
				<liferay-ui:search-container-results>
				<%
				
					total = size;
					results= lakeslist.subList(searchContainer.getStart(), searchContainer.getEnd());
					searchContainer.setTotal(total);
					searchContainer.setResults(results);
				%>
				</liferay-ui:search-container-results>
	
				<liferay-ui:search-container-row
					className="com.lake.model.lakes"
					modelVar="alakes"
				>
				
				<portlet:actionURL name="LakesCrawlerAction" var="lakesCrawlerURL" >
					<portlet:param name="lakeId" value="<%= String.valueOf(alakes.getLakeid()) %>" />
					<portlet:param name="lakeUrl" value="<%= String.valueOf(alakes.getUrl()) %>" />
				</portlet:actionURL>
				
				<liferay-ui:search-container-row-parameter
				name="lakesCrawlerURL"
				value="<%= lakesCrawlerURL.toString() %>"/>
				
				<liferay-ui:search-container-column-text
				name="Lakeid" property="lakeid" />
				
				<liferay-ui:search-container-column-text
				href="<%= lakesCrawlerURL %>" name="Name" property="name" />
		
				</liferay-ui:search-container-row>
			
				<liferay-ui:search-iterator />
			</liferay-ui:search-container>
			
			
			
		





  
  