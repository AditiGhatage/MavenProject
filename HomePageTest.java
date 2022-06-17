package com.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PageFactory.HomePage;
import com.flows.LoginLogoutFlow;
import com.generic.BaseTest;

public class HomePageTest extends BaseTest
{
	
	private HomePage objHomePage;
	private LoginLogoutFlow objLoginLogoutFlow;
	
	public void initializeWebPage() 
	{
		objHomePage = new HomePage(this);
		objLoginLogoutFlow = new LoginLogoutFlow(this);
	}
/*	@BeforeClass
	public void initializeWebEnv() {
		this.initializeWebPage();
		this.intializationWebEnv();
	}

	@AfterClass
	public void tearDownEnv() {
		this.tearDown();
	}
*/
	
	@Test(priority = 2, groups="functional")
	public void TC_001_verifyHomePageDisplay() 
	{
		objLoginLogoutFlow.doLogin(); 
		this.waitFor(3);
		objHomePage.verifyHomeTextIsDisplayedInHomePage();
	}
	
	@Test
	public void TC_002_verifyclickOnDashboard()
	{
		objHomePage.clickOnDashboardIcon();
	}
	
	@Test (priority = 3, groups="functional")
	public void TC_003_verifyPortfolioEvent()
	{
		objHomePage.clickOnPortfolioProducts();
	}


}
