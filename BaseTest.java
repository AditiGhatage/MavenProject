package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseTest extends Pojo 
{

	private WebDriver driver;
	private String strBaseURL;
	private SeleniumWrapper objSeleniumWrapper;
	
	public void intializationWebEnv() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		strBaseURL ="https://ebs4-qa2.simplifyhealthcare.com";
		this.setBaseURL(strBaseURL);
		driver.get(this.getBaseURL());
		this.setDriver(driver);
		setObjUtilities(new Utilities());
		this.setObjUtilities(getObjUtilities());
		objSeleniumWrapper = new SeleniumWrapper(this);
		this.setObjSeleniumWrapper(objSeleniumWrapper);
		driver.manage().window().maximize();
	}

	public void tearDown() {
		driver.quit();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}



}
