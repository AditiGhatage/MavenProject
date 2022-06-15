package com.PageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.generic.Pojo;

public class HomePage 
{
		private Pojo objPojo;

		public HomePage(Pojo pojo) {
			this.objPojo = pojo;
		}

		By loc_txtHome = By.xpath("//div[text()='Home']");
		
		public String getHomeTextOnHomePage() {
			String strReturnValue = objPojo.getDriver().findElement(loc_txtHome).getText().trim();
			return strReturnValue;
		}
		
		public String getCurrentPageUrl() {
			String strCurrentUrl = objPojo.getDriver().getCurrentUrl();
			return strCurrentUrl;
		}

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
			return false;
			
			
		}

}
