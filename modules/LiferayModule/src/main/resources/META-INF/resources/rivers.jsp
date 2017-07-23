
<%@ include file="/init.jsp" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<portlet:defineObjects />

<%@ include file="/header.jsp" %>
<%@page import="java.util.List"%>
<%@page import="com.river.model.rivers"%>
<liferay-portlet:renderURL varImpl="iteratorURL">
<portlet:param name="mvcPath" value="/rivers.jsp" />
</liferay-portlet:renderURL>


<h1>Welcome to the rivers page</h1>


<%
	
	
		
		
			final HttpSession _session = request.getSession(true);
			List<rivers> riverslist;
			if( (List<rivers>)request.getAttribute("Rivers")== null){
				 riverslist = (List<rivers>)_session.getAttribute("Riverslist");
				
			}
			else{
				 riverslist = (List<rivers>)request.getAttribute("Rivers");
			}
			
			_session.setAttribute("Riverslist", riverslist);
			int size = riverslist.size();
			System.out.println("Size"+size);
			%>
			
			
			<liferay-ui:search-container
				emptyResultsMessage="there-are-no-rivers"
				headerNames="Riverid,Name"
				iteratorURL="<%= iteratorURL %>"
				delta="4"
				deltaConfigurable="true">
				<liferay-ui:search-container-results>
				<%
				
					total = size;
					results= riverslist.subList(searchContainer.getStart(), searchContainer.getEnd());
					searchContainer.setTotal(total);
					searchContainer.setResults(results);
				%>
				</liferay-ui:search-container-results>
	
				<liferay-ui:search-container-row
					className="com.river.model.rivers"
					modelVar="arivers"
				>
				
				<portlet:actionURL name="RiversCrawlerAction" var="riversCrawlerURL" >
					<portlet:param name="riverId" value="<%= String.valueOf(arivers.getRiverid()) %>" />
					<portlet:param name="riverUrl" value="<%= String.valueOf(arivers.getUrl()) %>" />
				</portlet:actionURL>
				
				<liferay-ui:search-container-row-parameter
				name="riversCrawlerURL"
				value="<%= riversCrawlerURL.toString() %>"/>
				
				<liferay-ui:search-container-column-text
				name="Riverid" property="riverid" />
				
				<liferay-ui:search-container-column-text
				href="<%= riversCrawlerURL %>" name="Name" property="name" />
		
				</liferay-ui:search-container-row>
			
				<liferay-ui:search-iterator />
			</liferay-ui:search-container>
			
			
			
		





  
  