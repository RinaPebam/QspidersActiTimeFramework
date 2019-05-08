package com.acttime.customertest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.acttime.genericlib.BaseClass;
import com.acttime.genericlib.FileLib;
import com.acttime.objectrepositorylib.CreateCustomer;
import com.acttime.objectrepositorylib.Home;
import com.acttime.objectrepositorylib.OpenTask;
import com.acttime.objectrepositorylib.PRojectAndCustomer;
/**
 * 
 * @author Deepak
 *
 */
@Listeners(com.acttime.genericlib.ListenerImpClass.class)
public class CustomerTest extends BaseClass{
	@Test
	public void createCustomerTest() throws Throwable {
		/* read data from Excel */
		String customerNAme = flib.getExcelData("Sheet1", 1, 2);

		/* step 3 : navigate to Task Page  */
		  Home hp = PageFactory.initElements(driver, Home.class);
		  hp.clikcOnTaskImage();
		/* step 4 : navigate to ProjectAnd Customer Page  */
		  OpenTask op = PageFactory.initElements(driver, OpenTask.class);
		  op.clickONProjectAndCustomerLnk();
		/* step 5 : navigate create Customer Page  */
		  PRojectAndCustomer pac = PageFactory.initElements(driver, PRojectAndCustomer.class);
		  pac.clickOnCreateCustomerBtn();
		/* step 6 : create Customer  */
		  CreateCustomer cp = PageFactory.initElements(driver, CreateCustomer.class);
		  cp.createCustomer(customerNAme);
		/* step 7 : verify*/
		  String actsussMsg = pac.getSuccessMsg().getText();
		  boolean status = actsussMsg.contains("successfully created");
		  Assert.assertTrue(status);	
	}
	
	@Test
	public void createCustomerWithDescTest() throws Throwable {
		/* read data from excel */
		String customerName = flib.getExcelData("sheet1", 4, 2);
		String customerDesc = flib.getExcelData("sheet1", 4, 3);
		/* step 3 : navigate to Task Page  */
		  Home hp = PageFactory.initElements(driver, Home.class);
		  hp.clikcOnTaskImage();
		/* step 4 : navigate to ProjectAnd Customer Page  */
		  OpenTask op = PageFactory.initElements(driver, OpenTask.class);
		  op.clickONProjectAndCustomerLnk();
		/* step 5 : navigate create Customer Page  */
		  PRojectAndCustomer pac = PageFactory.initElements(driver, PRojectAndCustomer.class);
		  pac.clickOnCreateCustomerBtn();
		/* step 6 : create Customer  with description */
		  CreateCustomer cp = PageFactory.initElements(driver, CreateCustomer.class);
		  cp.createCustomer(customerName, customerDesc);
			/* step 7 : verify*/
		  String actsussMsg = pac.getSuccessMsg().getText();
		  boolean status = actsussMsg.contains("successfully created");
		  Assert.assertTrue(status);
	 }      
   }
















