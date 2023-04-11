package org.muviereck.customerTestCase;

import java.io.File;
import java.io.IOException;

import org.muviereck.yetlodigitalcard.PageObject.Customer;
import org.muviereck.yetlodigitalcards.TestCase.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TC_CustomerSearch_01 extends BaseClass{
	@Test(priority=0)
	public void customersearch() throws InterruptedException, IOException
	{
		driver.get(BaseURl);
		Customer cc = new Customer(driver);
		cc.Setemail();
		cc.Setpassword();
		cc.clicklogin();
		Thread.sleep(2000);
		cc.Clickmenu();
		Thread.sleep(2000);
		cc.Clickcustomer();
		Thread.sleep(2000);
		cc.setnamesearch();
		cc.setphnsearch();
		cc.setemailsearch();
		cc.settypesearch();
		Thread.sleep(2000);
		TakesScreenshot sc2=(TakesScreenshot) driver;
		File source2=sc2.getScreenshotAs(OutputType.FILE);
		File store2=new File(".\\ScreenShot\\SearchCustomer.png");
		FileHandler.copy(source2, store2);
		Thread.sleep(1000);
	}
	@Test(priority=1)
	public void customersearchNegative() throws InterruptedException
	{
		driver.get(BaseURl);
		Customer cc = new Customer(driver);
		cc.Setemail();
		cc.Setpassword();
		cc.clicklogin();
		Thread.sleep(2000);
		cc.Clickmenu();
		Thread.sleep(2000);
		cc.Clickcustomer();
		Thread.sleep(2000);
		cc.setwrongnamesrc();
		cc.setwrongphnsrc();
		cc.setwrongemailsrc();
		cc.setwrongtypsrc();
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void customersearchemtyneg() throws InterruptedException
	{
		driver.get(BaseURl);
		Customer cc = new Customer(driver);
		cc.Setemail();
		cc.Setpassword();
		cc.clicklogin();
		Thread.sleep(2000);
		cc.Clickmenu();
		Thread.sleep(2000);
		cc.Clickcustomer();
		Thread.sleep(2000);
		cc.setwrongnamesrc();
		cc.setwrongphnsrc();
		cc.setemailsearch();
		cc.settypesearch();
		Thread.sleep(2000);
	}
	@Test(priority=3)
	public void customersearchtypneg() throws InterruptedException
	{
		driver.get(BaseURl);
		Customer cc = new Customer(driver);
		cc.Setemail();
		cc.Setpassword();
		cc.clicklogin();
		Thread.sleep(2000);
		cc.Clickmenu();
		Thread.sleep(2000);
		cc.Clickcustomer();
		Thread.sleep(2000);
		cc.setnamesearch();
		cc.setphnsearch();
		cc.setemailsearch();
		cc.setwrongtypsrc();
		Thread.sleep(2000);
	}

}
