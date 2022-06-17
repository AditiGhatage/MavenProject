package com.PageFactory;

import org.openqa.selenium.By;

import com.generic.BaseTest;

public class DesignPage extends BaseTest
{
	By loc_icnDesign = By.xpath("//a[@id='design']");
	By loc_txtFolder = By.xpath("//a[text() = 'Folder']");
	By loc_txtDesignCompile = By.xpath("//a[text() = 'Design Compile']");
	By loc_txtDesignMaintenance = By.xpath("//a[text() = 'Design Maintenance']");
	
	public void getDesignPage()
	{
		driver.findElement(loc_icnDesign).click();
		waitFor(2);
		driver.findElement(loc_txtDesignCompile);
		waitFor(2);
		driver.findElement(loc_txtFolder);
		waitFor(2);
		driver.findElement(loc_txtDesignMaintenance);
		waitFor(2);
	}

}
