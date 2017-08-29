


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
<script>
    define._amd = define.amd;
    define.amd = false;
</script>


<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDfsyZmeqv9DbWoPIxSjR7zAvVKxrtGtaI" async defer></script>
<link rel="stylesheet" href="https://unpkg.com/leaflet@1.2.0/dist/leaflet.css"
   integrity="sha512-M2wvCLH6DSRazYeZRIm1JnYyh22purTM+FDB5CsyxtQJYeKq83arPe5wgbNmcFXGqiSH2XR8dT/fJISVA1r/zQ=="
   crossorigin=""/>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js">
</script>
<!-- Make sure you put this AFTER Leaflet's CSS -->
 <script src="https://unpkg.com/leaflet@1.2.0/dist/leaflet.js"
   integrity="sha512-lInM/apFSqyy1o6s89K4iQUKg6ppXEgsVxT35HbzUupEVRh2Eu9Wdl4tHj7dZO0s1uvplcYGmt3498TtHq+log=="
   crossorigin=""></script>
<script src='https://unpkg.com/leaflet.gridlayer.googlemutant@latest/Leaflet.GoogleMutant.js'></script>
<script type="text/javascript" src="<%=renderRequest.getContextPath()%>/js/leaflet.ajax.js">
</script>

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
			
<style>
#mapid { height: 500px; }
</style>
<div class="form-group">
  <label for="sel">Select list:</label>
  <select class="form-control" id="sel">
    <option value='1'>Upper Lake</option>
    <option value='2'>Halali Reservoir</option>
    <option value='3'>Lower Lake, Bhopal</option>
    <option value='4'>Tawa Reservoir</option>
  </select>
</div>
<div id="mapid"></div>	
<canvas id="canvas"></canvas>
<script>
jQuery(document).on('change','#sel',function(){
    console.log(jQuery(this).val());
    if(jQuery(this).val() == '2'){
    	mymap.setView([23.497097537734305,77.45498657226562], 12);
    }
});
var mymap = L.map('mapid').setView([23.256645151076572,77.36795425415039], 12);
var roads = L.gridLayer.googleMutant({
    type: 'roadmap' // valid values are 'roadmap', 'satellite', 'terrain' and 'hybrid'
}).addTo(mymap);
var myLayer = L.geoJSON().addTo(mymap);
// var polygon2 = L.polygon(, {color: 'green'}).addTo(mymap);
// var polygon = L.polygon(, {color: 'red'}).addTo(mymap);
function getColor(v) {
    return v > 1000 ? 'green' :
           v > 500  ? 'yellow' : 'red';
}
function style(feature) {
    return {
        fillColor: getColor(feature.properties.volume),
        weight: 2,
        opacity: 1,
        color: 'white',
        dashArray: '3',
        fillOpacity: 0.7
    };
}

function styleMP(feature) {
    return {
        color: 'blue',
        weight: 2,
        stroke: true,
        opacity: 0.2,
        fill: false
    };
}

function onEach(feature, layer) {
    // does this feature have a property named popupContent?
    if (feature.properties && feature.properties.volume) {
        layer.bindPopup("Name: "+ feature.properties.name +"\n Volume: "+feature.properties.volume);
    	
    	
    	L.geoJSON(feature, {
		    style: style
		}).addTo(mymap);
    	// Get bounds of polygon
        var bounds = layer.getBounds();
        // Get center of bounds
        var center = bounds.getCenter();
        // Use center to put marker on map
        var marker = L.marker(center,{title: feature.properties.name}).addTo(mymap);
    	//myLayer.addData(feature);
    }
}


function onEachDistrict(feature, layer) {
    // does this feature have a property named popupContent?
    if (feature.properties && feature.properties.volume) {
    	
    	
    	L.geoJSON(feature, {
		    style: styleMP
		}).addTo(mymap);
    	
    }
}
var geojsonLayerMP = new L.GeoJSON.AJAX("<%=renderRequest.getContextPath()%>/geojson/MadhyaPradesh.geojson",{onEachFeature:onEachDistrict}).addTo(mymap);

var geojsonLayer = new L.GeoJSON.AJAX("<%=renderRequest.getContextPath()%>/geojson/waterResources.geojson",{onEachFeature:onEach}).addTo(mymap);


// mymap.fitBounds(polygon.getBounds());
jQuery(document).ready(function(){
	

	// L.geoJSON(geojsonLayer).addTo(mymap);
    var MONTHS = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];
    var config = {
        type: 'line',
        data: {
            labels: ["January", "February", "March", "April", "May", "June", "July","August","September","October","November","December"],
            datasets: []
        },
        options: {
            responsive: true,
            title:{
                display:true,
                text:'Lakes Depth Chart'
            },
            tooltips: {
                mode: 'index',
                intersect: false,
            },
            hover: {
                mode: 'nearest',
                intersect: true
            },
            scales: {
                xAxes: [{
                    display: true,
                    scaleLabel: {
                        display: true,
                        labelString: 'Month'
                    }
                }],
                yAxes: [{
                    display: true,
                    scaleLabel: {
                        display: true,
                        labelString: 'Depth Value'
                    }
                }]
            }
        }
    };

    
    var ctx = document.getElementById("canvas").getContext("2d");
    window.myLine = new Chart(ctx, config);
    
    window.chartColors = {
    		red: 'rgb(255, 99, 132)',
    		orange: 'rgb(255, 159, 64)',
    		yellow: 'rgb(255, 205, 86)',
    		green: 'rgb(75, 192, 192)',
    		blue: 'rgb(54, 162, 235)',
    		purple: 'rgb(153, 102, 255)',
    		grey: 'rgb(201, 203, 207)'
    	};
    var colorNames = Object.keys(window.chartColors);
    // Add dataset start
    
    <%
    	for(lakes lake : lakeslist){
	
			System.out.println(lake.getLakeid());
			System.out.println(lake.getJan());
			%>
			
			var colorName = colorNames[config.data.datasets.length % colorNames.length];
	        var newColor = window.chartColors[colorName];
	        var newDataset = {
	            label: '<%= lake.getName() %>',
	            backgroundColor: newColor,
	            borderColor: newColor,
	            data: [<%= lake.getJan() %>,<%= lake.getFeb() %>,<%= lake.getMar() %>,<%= lake.getApr() %>,<%= lake.getMay() %>,<%= lake.getJune() %>,<%= lake.getJuly() %>,<%= lake.getAug() %>,<%= lake.getSep() %>,<%= lake.getOct() %>,<%= lake.getNov() %>,<%= lake.getDec_() %>],
	            fill: false
	        };

	        config.data.datasets.push(newDataset);
	        window.myLine.update();
	        
			<%
		}
    %>
    
    //Add dataset over

});

</script>




<script>
    define.amd = define._amd;
</script>

  
  