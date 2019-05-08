package com.acttime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
	
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement taskImg;
	
	@FindBy(xpath="//div[text()='USER']")
	private WebElement userImg;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutlnk;
	
	public void clikcOnTaskImage() {
		taskImg.click();
	}
	
	public void clikcOnUSERImage() {
		userImg.click();
	}
	
	public void logout() {
		logoutlnk.click();
	}

}




