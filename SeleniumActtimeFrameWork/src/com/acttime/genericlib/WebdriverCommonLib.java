package com.acttime.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * 
 * @author Deepak
 *
 */
public class WebdriverCommonLib {
	/**
	 * 
	 * @param driver
	 */
   public void waitForPageToLoad(WebDriver driver) {
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   }
   /**
    * 
    * @param driver
    * @param elemnet
    */
   public void waitForElemnetPResent(WebDriver driver ,WebElement elemnet) {
	   WebDriverWait wait = new WebDriverWait(driver, 20);
	   wait.until(ExpectedConditions.visibilityOf(elemnet));
	   
   }
   /**
    * 
    * @param elemnet
    * @param option
    */
   public void select(WebElement elemnet,String option) {
	   Select sel = new Select(elemnet);
	   sel.selectByVisibleText(option);
   }
   
   public void select(WebElement elemnet,int index) {
	   Select sel = new Select(elemnet);
	   sel.selectByIndex(index);
   }
   public void waitAndClick(WebElement element) {
	   while(true) {
		   try {
			   element.click();
			   break;
		   }catch (Exception e) {
			// TODO: handle exception
		}
	   }
   }

}





