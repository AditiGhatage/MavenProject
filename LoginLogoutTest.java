package com.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

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
		//this.tearDown();
	}
	
	@Test(priority = 1, groups="functional")
	public void TC_01_verifyLogin()
	{
		objLoginLogoutFlow.doLogin();
		//objLoginLogoutFlow.getmobile();
	}
	
	@Test(priority = 2, groups="functional")
	public void TC_02_verifyLogOut() {
		objLoginLogoutFlow.doLogin();
		this.waitFor(2);
		objHomePage.clickOnUserImage();
		objHomePage.clickOnLogOffLink();
		objHomePage.clickYesOnConfirmLogOffWindow();
	
	}

}
