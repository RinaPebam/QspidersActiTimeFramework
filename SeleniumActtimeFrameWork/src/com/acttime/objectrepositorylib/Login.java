package com.acttime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.genericlib.FileLib;

public class Login {    //Rule-1 : create a separate Java class for every page
	
	@FindBy(name="username")  //rule 2 : identify elements using @findBy annotaion
	private WebElement usernameEdt;  
	
	@FindBy(name="pwd")
	private WebElement passwordEdt;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;

	//Rule 3 : IDentify reusable business libraries , which can be used in Login Class
	public void loginToAPP() throws Throwable {
		FileLib fLib = new FileLib();
		usernameEdt.sendKeys(fLib.getPropertyKeyValue("username"));
		passwordEdt.sendKeys(fLib.getPropertyKeyValue("password"));
		loginButton.click();
	}
	
	
}




