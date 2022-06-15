package com.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PageFactory.HomePage;
import com.PageFactory.loginPage;
import com.flows.LoginLogoutFlow;
import com.generic.BaseTest;

public class LoginLogoutTest extends BaseTest 
{
	private LoginLogoutFlow objLoginLogoutFlow;
	private HomePage objHomePage;


	public void initializeWebPage() 
	{
		new loginPage(this);
		objLoginLogoutFlow = new LoginLogoutFlow(this);
		objHomePage = new HomePage(this);
	}

	@BeforeClass
	public void initializeWebEnv() {
		this.initializeWebPage();
		this.intializationWebEnv();
	}

	@AfterClass
	public void tearDownEnv() {
		this.tearDown();
	}
	
	@Test
	public void TC_01_verifyLogin()
	{
		objLoginLogoutFlow.doLogin();
		objLoginLogoutFlow.getmobile();
	}

	@Test
	public void TC_02_verifyHomePageDisplay() 
	{
		objHomePage.verfiyHomeTextDisplayed();
	}
}
