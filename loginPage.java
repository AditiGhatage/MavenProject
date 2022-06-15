package com.PageFactory;
import org.openqa.selenium.By;
import org.testng.Assert;

import com.generic.Pojo;

public class loginPage {

	private Pojo objPojo;

	public loginPage(Pojo pojo) {
		this.objPojo = pojo;
	}

	By loc_inpUserName=By.xpath("//input[@id='UserName']");
	By loc_inpPassword=By.xpath("//input[@id='Password']");
	By loc_btnGetStarted=By.xpath("//button[text()='Get Started']");



	public void setUserName(String strUsername) {
		//objPojo.getDriver().findElement(loc_inpUserName).sendKeys(strUsername);
		Assert.assertTrue(objPojo.getObjSeleniumWrapper().setText(loc_inpUserName, strUsername));
	}

	public void setPassword(String setPassword) {
		//objPojo.getDriver().findElement(loc_inpPassword).sendKeys(setPassword);
		Assert.assertTrue(objPojo.getObjSeleniumWrapper().setText(loc_inpPassword, setPassword));
	}

	public void clickGetStarted() {
		objPojo.getDriver().findElement(loc_btnGetStarted).click();
		//Assert.assertTrue(objPojo.getObjSeleniumWrapper().setText(loc_btnGetStarted, null));
	}
	
	public void getRandomMobile()
	{
		System.out.println("Random mobile number is: "+objPojo.getObjUtilities().getRandomMobile(8));
	}
	
}

