package com.acttime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * 
 * @author user
 *
 */
public class OpenTask {
	
	@FindBy(linkText="Projects & Customers")
	private WebElement proAndCustLnk;
	
	public void clickONProjectAndCustomerLnk() {
		proAndCustLnk.click();
	}

}
