package com.flows;

import org.testng.Assert;

import com.PageFactory.loginPage;
import com.generic.Pojo;

public class LoginLogoutFlow
{

	private Pojo objPojo;
	private loginPage objLoginPage;


	public LoginLogoutFlow(Pojo pojo) {
		this.objPojo= pojo;
		objLoginPage = new loginPage(objPojo);
	}


	public void doLogin() {
		objLoginPage.setUserName("v-khushbut");
		objLoginPage.setPassword("Summer@2018#");
		objLoginPage.clickGetStarted();
	}
	
	public String getCurrentPageUrl() {
		String strCurrentUrl = objPojo.getDriver().getCurrentUrl();
		return strCurrentUrl;
	}
	public void verifySuccessfulLoginUrl() {
		String strExpectedUrl = "https://ebs4-qa2.simplifyhealthcare.com/DashBoard/Index";
		Assert.assertEquals(strExpectedUrl, this.getCurrentPageUrl());
	}
	
	public void getmobile()
	{
		objLoginPage.getRandomMobile();
	}

	public void verifySuccessfulLogOffUrl() {
		String strExpectedUrl = "https://ebs4-qa2.simplifyhealthcare.com/Account/LogOff";
		Assert.assertEquals(strExpectedUrl, this.getCurrentPageUrl());
	}

}
