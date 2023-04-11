package org.muviereck.customerTestCase;


import java.io.File;
import java.io.IOException;

import org.muviereck.yetlodigitalcard.PageObject.Customer;
import org.muviereck.yetlodigitalcards.TestCase.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TC_CustomerSort_01 extends BaseClass {
	@Test
	public void Customertest() throws InterruptedException, IOException
	{
		
		driver.get(BaseURl);
		Customer cd;
		cd=new Customer(driver);
		Thread.sleep(2000);
		cd.Setemail();
		cd.Setpassword();
		Thread.sleep(2000);
		cd.clicklogin();
		Thread.sleep(2000);
		cd.Clickmenu();
		Thread.sleep(2000);
		cd.Clickcustomer();
		Thread.sleep(2000);
		cd.clickSortname();
		cd.clicksortphn();
		cd.clicksortemail();
		Thread.sleep(5000);
		TakesScreenshot sc2=(TakesScreenshot) driver;
		File source2=sc2.getScreenshotAs(OutputType.FILE);
		File store2=new File(".\\ScreenShot\\SortCustomer.png");
		FileHandler.copy(source2, store2);
		Thread.sleep(1000);
		cd.clicksorttype();
		Thread.sleep(2000);
		
		
	}

}
