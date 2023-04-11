package org.muviereck.customerTestCase;

import java.io.File;
import java.io.IOException;

import org.muviereck.yetlodigitalcard.PageObject.Customer;
import org.muviereck.yetlodigitalcards.TestCase.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TC_CustomerContains_01 extends BaseClass{
	@Test(priority=0)
	public void customercontain() throws InterruptedException
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
		cc.clicknamecontain("startwith");
		Thread.sleep(2000);
		cc.clickphncontain("is not empty");
		Thread.sleep(2000);
		cc.clickemailcontain("is not null");
		Thread.sleep(2000);
		cc.clicktypecontain("is blank");
		Thread.sleep(2000);
	}
	@Test(priority=1)
	public void customercontainneg() throws InterruptedException, IOException
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
		cc.clicknamecontain("startwith");
		Thread.sleep(2000);
		cc.clickphncontain("is empty");
		Thread.sleep(2000);
		cc.clickemailcontain("is not null");
		Thread.sleep(2000);
		cc.clicktypecontain("is not blank");
		Thread.sleep(2000);
		TakesScreenshot sc2=(TakesScreenshot) driver;
		File source2=sc2.getScreenshotAs(OutputType.FILE);
		File store2=new File(".\\ScreenShot\\ContainsCustomer.png");
		FileHandler.copy(source2, store2);
		Thread.sleep(1000);
	}

}
