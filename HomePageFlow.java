package com.flows;

import com.generic.Pojo;

public class HomePageFlow 
{
private Pojo objPojo;
	
	public HomePageFlow(Pojo pojo) {
		this.objPojo = pojo;
	}
	
	public String getCurrentPageUrl() {
		String strCurrentUrl = objPojo.getDriver().getCurrentUrl();
		return strCurrentUrl;
	}

}
