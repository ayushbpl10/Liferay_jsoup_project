
<portlet:actionURL name="RiversAction" var="riversRetrieveURL" >
</portlet:actionURL>
<portlet:actionURL name="LakesAction" var="lakesRetrieveURL" >
</portlet:actionURL>


<div style="margin:0 auto; text-align:center; width: 50%;">
	<h1>Welcome to the Waterbodies info Portal</h1>
	
	<div>Waterbodies</div>
	<p>
		
		<a href="<%= riversRetrieveURL %>" >
			Rivers
		</a>
		<a href="<%= lakesRetrieveURL %>" >
			Lakes
		</a>
		
	</p>
</div>