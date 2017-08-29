
<portlet:actionURL name="RiversAction" var="riversRetrieveURL" >
</portlet:actionURL>
<portlet:actionURL name="LakesAction" var="lakesRetrieveURL" >
</portlet:actionURL>


<div style="text-align:center;" class="portlet-layout row">
			<div class="col-md-2 portlet-column"></div>
			<div class="col-md-8 portlet-column">
				<div style="font-weight:bold; margin-bottom:20px;" class="portlet-layout row">
					<div  class="col-md-12 portlet-column">
						<h1 >Welcome to the Waterbodies info Portal</h1>
						
						<h2 >Waterbodies</h2>
					</div>
				</div>
				<div style="font-size: 24px;" class="portlet-layout row" >
						<div  class="col-md-3 portlet-column">
						<a style="text-decoration: none; margin-bottom: 20px;" href="<%= riversRetrieveURL %>" >
							<img style=" margin-top: 8px; margin-bottom: 8px; width:100%; height: 200px;" src="<%=renderRequest.getContextPath()%>/images/River.gif" ><div class="col-md-12" style="margin: 0 auto;">Rivers</div>
						</a>
						</div>
						<div class="col-md-3 portlet-column">
						<a style="text-decoration: none; margin-bottom: 20px;" href="<%= lakesRetrieveURL %>" >
							<img style=" margin-top: 8px; margin-bottom: 8px; width:100%; height: 200px;" src="<%=renderRequest.getContextPath()%>/images/Lake.gif" ><div class="col-md-12" style="margin: 0 auto;">Lakes</div>
						</a>
						</div>
						<div class="col-md-3 portlet-column">
						<a style="text-decoration: none; margin-bottom: 20px;" href="<%= lakesRetrieveURL %>" >
							<img style=" margin-top: 8px; margin-bottom: 8px; width:100%; height: 200px;" src="<%=renderRequest.getContextPath()%>/images/Waterfall.gif" ><div class="col-md-12" style="margin: 0 auto;">WaterFalls</div>
						</a>
						</div>
						<div class="col-md-3 portlet-column">
						<a style="text-decoration: none; margin-bottom: 20px;" href="<%= lakesRetrieveURL %>" >
							<img style=" margin-top: 8px; margin-bottom: 8px; width:100%; height: 200px;" src="<%=renderRequest.getContextPath()%>/images/Dam.gif" ><div class="col-md-12" style="margin: 0 auto;">Dams</div>
						</a>
						</div>
						
				</div>
			</div>
			<div class="col-md-2 portlet-column"></div>
</div>