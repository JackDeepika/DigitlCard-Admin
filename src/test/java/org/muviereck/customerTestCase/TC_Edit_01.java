package org.muviereck.customerTestCase;

import java.io.File;
import java.io.IOException;

import org.muviereck.yetlodigitalcard.PageObject.Customer;
import org.muviereck.yetlodigitalcards.TestCase.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TC_Edit_01 extends BaseClass{
	@Test(priority=0)
	public void edittest() throws InterruptedException, IOException
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
		cc.clickedit();
		Thread.sleep(2000);
		TakesScreenshot sc2=(TakesScreenshot) driver;
		File source2=sc2.getScreenshotAs(OutputType.FILE);
		File store2=new File(".\\ScreenShot\\EditCustomer.png");
		FileHandler.copy(source2, store2);
		Thread.sleep(1000);
		
		//Thread.sleep(2000);
		Thread.sleep(2000);
		cc.setusername();
		cc.setphnnumber();
		cc.seteditemail();
		Thread.sleep(2000);
		cc.orderstatus();
		cc.setupdate();
	}
	@Test(priority=1)
	public void edittestcancel() throws InterruptedException
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
		cc.clickedit();
		Thread.sleep(2000);
		cc.setusername();
		cc.setphnnumber();
		cc.seteditemail();
		Thread.sleep(2000);
		cc.orderstatus();
		cc.clickupdatecancel();
	}
	@Test(priority=2)
	public void edittestclear() throws InterruptedException
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
		cc.clickedit();
		Thread.sleep(2000);
		cc.usernameclear();
		cc.phnnumberclear();
		cc.emailclear();
		//cc.orderstatus();
		cc.setupdate();
	}
	@Test(priority=3)
	public void edittestnegative() throws InterruptedException
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
		cc.clickedit();
		Thread.sleep(2000);
		cc.phnnumberwords();
		cc.usernamenumber();
		cc.emailnumber();
		cc.setupdate();
	}

}
