package com.PageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.generic.BaseTest;
import com.generic.Pojo;

public class ProductSearchPage extends BaseTest
{

	private Pojo objPojo;
	
	public ProductSearchPage(Pojo pojo) {
		this.objPojo=pojo;
	}
	
	By loc_clkProductSearch = By.xpath("//a[@id='advancesearch']");
	By loc_txtSearchBox = By.className("search-field");
	By loc_btnSearch = By.id("btnAddCriteriaToProductSearch");
	
	public void openProductSearch() 
	{	
		Assert.assertTrue(objPojo.getObjSeleniumWrapper().clickEvent(loc_clkProductSearch));
	}
	
	public void typeInSearchBoxOnProductSearchBox(String strKeywordToSearch) {
	
		Assert.assertTrue(objPojo.getObjSeleniumWrapper().setText(loc_txtSearchBox, strKeywordToSearch));
	}

	public void clickOnSearchButtonOnProductSearchPage() {
		
		Assert.assertTrue(objPojo.getObjSeleniumWrapper().clickEvent(loc_btnSearch));
	}

}
