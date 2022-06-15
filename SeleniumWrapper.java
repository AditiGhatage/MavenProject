package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeleniumWrapper 
{
	private Pojo objPojo;

	public SeleniumWrapper(Pojo pojo) 
	{
		this.objPojo = pojo;
	}

	// TextBox
	public boolean setText(By locator, String inputValue) 
	{
		try {
			objPojo.getDriver().findElement(locator).sendKeys(inputValue);
			return true;
		} catch (Exception exception) {
			System.out.println("Set text exception. " + exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}
	
	public boolean mouseHover(By locator) 
	{
		try 
		{
			WebElement objWebElement = objPojo.getDriver().findElement(locator);
			Actions objActions = new Actions(objPojo.getDriver());
			objActions.moveToElement(objWebElement).perform();
			return true;
		} catch (Exception exception) {
			System.out.println("Mouseover Exception : " + exception.getMessage());
			exception.printStackTrace();
			return false;
			}
	}
	
	
	public boolean clickText(By locator) 
	{
		try {
			objPojo.getDriver().findElement(locator).click();
			return true;
			} catch (Exception exception) {
				System.out.println("There is an exception." + exception.getMessage());
				exception.printStackTrace();
				return false;
			}
	}
	
	

}
