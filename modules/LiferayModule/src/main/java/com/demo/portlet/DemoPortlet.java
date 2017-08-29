package com.demo.portlet;

import com.lake.model.lakes;
import com.lake.service.lakesLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import com.river.model.rivers;
import com.river.service.riversLocalServiceUtil;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=LiferayModule Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class DemoPortlet extends MVCPortlet {

	
	public void RiversAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		System.out.println("Hello process in demo in Rivers");
	
		List<rivers> riverslist = riversLocalServiceUtil.getriverses(0, 10);
		
		for(rivers river : riverslist){
			
			System.out.println(river.getRiverid());
			System.out.println(river.getName());
		}
		
			actionRequest.setAttribute("Rivers", riverslist);
		
			
			actionResponse.setRenderParameter("mvcPath","/rivers.jsp");
			
	
		
	}
	
	public void LakesAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		System.out.println("Hello process in demo in Lakes");
		
		List<lakes> lakeslist = lakesLocalServiceUtil.getlakeses(0, 10);
		
		for(lakes lake : lakeslist){
			
			System.out.println(lake.getLakeid());
			System.out.println(lake.getName());
			System.out.println(lake.getUrl());
			System.out.println(lake.getJan());
		}
		
			actionRequest.setAttribute("Lakes", lakeslist);
		
			
	
		actionResponse.setRenderParameter("mvcPath",
	            "/lakes.jsp");
	}
	
	
	public void LakesCrawlerAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		
		String Url = ParamUtil.getString(actionRequest, "lakeUrl");
		System.out.println("Hello from Crawler");
		Document doc = Jsoup.connect(Url).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36").timeout(0).get();
		Elements Infotable = doc.select("table.infobox");
		String Html = "";
		for(Element table: Infotable){
			Html = table.outerHtml()+Html;
		}
		
		System.out.println(Html);
		String CenterHtml = "<div style='width:30%; margin:0 auto;'>"+Html+"</div>";
		
		actionRequest.setAttribute("Details", CenterHtml );
		
		actionResponse.setRenderParameter("mvcPath",
	            "/display_lake.jsp");
	}
	
	public void RiversCrawlerAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		
		String Url = ParamUtil.getString(actionRequest, "riverUrl");
		System.out.println("Hello from Crawler");
		Document doc = Jsoup.connect(Url).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36").timeout(0).get();
		Elements Infotable = doc.select("table.infobox");
		String Html = "";
		for(Element table: Infotable){
			Html = table.outerHtml()+Html;
		}
		
		System.out.println(Html);
		String CenterHtml = "<div style='width:60%; margin:0 auto;'>"+Html+"</div>";
				
		actionRequest.setAttribute("Details", CenterHtml );
		
		
		
		actionResponse.setRenderParameter("mvcPath",
	            "/display_river.jsp");
	}
	
}