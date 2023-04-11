package org.muviereck.myorderTestCase;

import java.awt.AWTException;

import org.muviereck.yetlodigitalcard.PageObject.MyOrders;
import org.muviereck.yetlodigitalcards.TestCase.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_Action_01 extends BaseClass{
	@Test(priority=0)
	public void actiontest() throws InterruptedException, AWTException 
	{
		driver.get(BaseURl);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		MyOrders cc = new MyOrders(driver);
		cc.Setemail();
		cc.Setpassword();
		cc.clicklogin();
		Thread.sleep(2000);
		cc.clickmyorder();
		Thread.sleep(2000);
		cc.clickeye();
		Thread.sleep(2000);
		cc.clickaddposter();
		Thread.sleep(2000);
		cc.setcardname();
		Thread.sleep(5000);
		cc.setimage();
		cc.setstatus();
		js.executeScript("window.scrollBy(0,8000)");
		Thread.sleep(3000);
		cc.setadd();
		Thread.sleep(2000);
	}
	@Test(priority=1)
	public void actiontestclear() throws InterruptedException, AWTException 
	{
		driver.get(BaseURl);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		MyOrders cc = new MyOrders(driver);
		cc.Setemail();
		cc.Setpassword();
		cc.clicklogin();
		Thread.sleep(2000);
		cc.clickmyorder();
		Thread.sleep(2000);
		cc.clickeye();
		Thread.sleep(2000);
		cc.clickaddposter();
		Thread.sleep(2000);
		cc.setcardname();
		Thread.sleep(5000);
		cc.setimage();
		cc.setstatus();
		Thread.sleep(3000);
		cc.setclear();
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void actiontestmandatory() throws InterruptedException, AWTException 
	{
		driver.get(BaseURl);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		MyOrders cc = new MyOrders(driver);
		cc.Setemail();
		cc.Setpassword();
		cc.clicklogin();
		Thread.sleep(2000);
		cc.clickmyorder();
		Thread.sleep(2000);
		cc.clickeye();
		Thread.sleep(2000);
		cc.clickaddposter();
		Thread.sleep(2000);
		cc.setadd();
	}
	@Test(priority=3)
	public void actiontestnegative() throws InterruptedException, AWTException 
	{
		driver.get(BaseURl);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		MyOrders cc = new MyOrders(driver);
		cc.Setemail();
		cc.Setpassword();
		cc.clicklogin();
		Thread.sleep(2000);
		cc.clickmyorder();
		Thread.sleep(2000);
		cc.clickeye();
		Thread.sleep(2000);
		cc.clickaddposter();
		Thread.sleep(2000);
		cc.setcardnameneg();
		cc.setpdf();
		cc.setstatus1();
		js.executeScript("window.scrollBy(0,8000)");
		Thread.sleep(2000);
		cc.setadd();
	}

}
