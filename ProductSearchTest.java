package com.scripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.PageFactory.ProductSearchPage;
import com.generic.BaseTest;

public class ProductSearchTest  extends BaseTest {
	private ProductSearchPage objProductSearchPage;
	
	public void initializeWebPages() {
		objProductSearchPage = new ProductSearchPage(this);
	}
	
	@Parameters("strKeywordToSearch")
	@Test(priority = 5, groups = {"Regression", "Functional"})
	public void TCID_001_VerifySearchList() {
		
		String strKeywordToSearch = null;
		objProductSearchPage.openProductSearch();
		objProductSearchPage.typeInSearchBoxOnProductSearchBox(strKeywordToSearch);
		objProductSearchPage.clickOnSearchButtonOnProductSearchPage();
	}
	
}