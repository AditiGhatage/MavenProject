package com.PageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.generic.BaseTest;
import com.generic.Pojo;

public class HomePage extends BaseTest
{
		private Pojo objPojo;

		public HomePage(Pojo pojo) {
			this.objPojo = pojo;
		}
		
		By loc_txtPortfolioProducts = By.xpath("//div[text()='Portfolio Products']");
		By loc_icnDashboardReports = By.xpath("//a[@id='executivedashBoard']");
		By loc_tabWorkQueue = By.xpath("(//a[@href='#workQueueTab'])[1]");
		By loc_tabWatchList = By.xpath("(//a[@href='#watchListTab'])[1]");
		By loc_btnNextModulesArrow = By.xpath("(//span[@class='glyphicon glyphicon-chevron-right icons-rightarrow'])[1]");
		By loc_txtQuotes = By.xpath("(//div[text()='Quotes'])[1]");
		By loc_imgUser = By.xpath("//div[@class='pull-right dropdownclick']");
		By loc_txtLogOffLink = By.xpath("//a[@id='confirm']/span");
		By loc_btnConfirmLogOffYes = By.xpath("(//button[text()='Yes'])[1]");
		

		public String getHomeTextOnHomePage() {
		String strHomeText = objPojo.getDriver().findElement(loc_txtHome).getText();
		return strHomeText;
		}
		public void verifyHomeTextIsDisplayedInHomePage() {
			Assert.assertEquals(this.getHomeTextOnHomePage(),"Home");
		}
		
		
		public void clickOnPortfolioProducts() {
			Assert.assertTrue(objPojo.getObjSeleniumWrapper().getText(loc_txtPortfolioProducts));
		}
		
		public void clickOnDashboardReports() {
			Assert.assertTrue(objPojo.getObjSeleniumWrapper().getText(loc_icnDashboardReports));
		}
		
		public void clickOnNextModulesArrow() {
			Assert.assertTrue(objPojo.getObjSeleniumWrapper().getText(loc_btnNextModulesArrow));
		}
		
		public void clickOnQuotesText() {
			Assert.assertTrue(objPojo.getObjSeleniumWrapper().getText(loc_txtQuotes));
		}
		
		public void clickOnWatchListTab() {
			Assert.assertTrue(objPojo.getObjSeleniumWrapper().getText(loc_tabWatchList));
		}
		
		public void clickOnWorkQueueTab() {
			Assert.assertTrue(objPojo.getObjSeleniumWrapper().getText(loc_tabWorkQueue));
		}
		
		public void clickOnDashboardIcon() {
			Assert.assertTrue(objPojo.getObjSeleniumWrapper().getText(loc_icnDashboardReports));
		}
		
		public void clickOnUserImage() {
			Assert.assertTrue(objPojo.getObjSeleniumWrapper().getText(loc_imgUser));
		}
		
		public void clickOnLogOffLink() {
			Assert.assertTrue(objPojo.getObjSeleniumWrapper().getText(loc_txtLogOffLink));
		}
		
		public void clickYesOnConfirmLogOffWindow() {
			Assert.assertTrue(objPojo.getObjSeleniumWrapper().getText(loc_btnConfirmLogOffYes));
		}

		By loc_txtHome = By.xpath("//div[text()='Home']");

		/*
		 * public void verifyHomeTextisDisplayed() {
		 * 
		 * if (this.getHomeTextOnHomePage().equals("Home")) {
		 * System.out.println("Text HOME is Displayed"); } else {
		 * System.out.println("Text HOME is Not Displayed"); }
		 * 
		 * }
		 */
		
		public boolean verfiyHomeTextDisplayed() 
		{
			String ActualTitle = objPojo.getDriver().findElement(loc_txtHome).getText();
			String ExpectedTitle = "Home";
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			return true;
			
			
		}

}
