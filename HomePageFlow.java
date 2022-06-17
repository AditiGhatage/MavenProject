package com.flows;

import org.testng.Assert;

import com.PageFactory.HomePage;
import com.generic.Pojo;

public class HomePageFlow 
{
	private Pojo objPojo;
	private HomePage objHome;
	
	public HomePageFlow(Pojo pojo) {
		this.objPojo = pojo;
		objHome = new HomePage(objPojo);
	}
	
	public String getCurrentPageUrl() {
		String strCurrentUrl = objPojo.getDriver().getCurrentUrl();
		return strCurrentUrl;
	}
	
	public void verifyHomePage() {
		//	objHomePage.getHomeTextOnHomePage();
	        objHome.verifyHomeTextIsDisplayedInHomePage();
	}
	
	public void verifyPortfolioProductsPageUrl() {
		String strExpectedUrl = "https://ebs4-qa2.simplifyhealthcare.com/ConsumerAccount/PortfolioSearch";
		Assert.assertEquals(strExpectedUrl, this.getCurrentPageUrl());
	}
	
	public void verifyQuotesPageUrl() {
		String strExpectedUrl = "https://ebs4-qa2.simplifyhealthcare.com/ConsumerAccount/QuoteFolder";
		Assert.assertEquals(strExpectedUrl, this.getCurrentPageUrl());
	}


}
