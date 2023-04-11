package org.muviereck.myorderTestCase;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.muviereck.yetlodigitalcard.PageObject.MyOrders;
import org.muviereck.yetlodigitalcards.TestCase.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_Edit_01 extends BaseClass{
//	@Test(priority=0)
//	public void edittest() throws InterruptedException
//	{
//		driver.get(BaseURl);
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		MyOrders cc = new MyOrders(driver);
//		cc.Setemail();
//		cc.Setpassword();
//		cc.clicklogin();
//		Thread.sleep(2000);
//		cc.clickmyorder();
//		Thread.sleep(2000);
//		cc.clickeye();
//		Thread.sleep(2000);
//		cc.clickeditvist();
//		Thread.sleep(2000);
//		cc.clickcardedit();
//		cc.editimgset();
//		Thread.sleep(2000);
//		cc.viststatus();
//		cc.vistupd();
//		Thread.sleep(2000);
//	}
//	@Test(priority=1)
//	public void edittestneg() throws InterruptedException
//	{
//		driver.get(BaseURl);
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		MyOrders cc = new MyOrders(driver);
//		cc.Setemail();
//		cc.Setpassword();
//		cc.clicklogin();
//		Thread.sleep(2000);
//		cc.clickmyorder();
//		Thread.sleep(2000);
//		cc.clickeye();
//		Thread.sleep(2000);
//		cc.clickeditvist();
//		Thread.sleep(2000);
//		cc.clickcardeditnum();
//		cc.editpdfset();
//		cc.vistupd();
//		Thread.sleep(2000);
//	}
//	@Test(priority=2)
//	public void edittestnegspc() throws InterruptedException
//	{
//		driver.get(BaseURl);
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		MyOrders cc = new MyOrders(driver);
//		cc.Setemail();
//		cc.Setpassword();
//		cc.clicklogin();
//		Thread.sleep(2000);
//		cc.clickmyorder();
//		Thread.sleep(2000);
//		cc.clickeye();
//		Thread.sleep(2000);
//		cc.clickeditvist();
//		Thread.sleep(2000);
//		cc.clickcardeditspc();
//		cc.editpdfset();
//		cc.vistupd();
//		Thread.sleep(2000);
//	}
//	@Test(priority=3)
//	public void edittestalp() throws InterruptedException
//	{
//		driver.get(BaseURl);
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		MyOrders cc = new MyOrders(driver);
//		cc.Setemail();
//		cc.Setpassword();
//		cc.clicklogin();
//		Thread.sleep(2000);
//		cc.clickmyorder();
//		Thread.sleep(2000);
//		cc.clickeye();
//		Thread.sleep(2000);
//		cc.clickeditvist();
//		Thread.sleep(2000);
//		cc.clickcardeditalp();
//		cc.editpdfset();
//		cc.vistupd();
//	}
//	@Test(priority=3)
//	public void edittestmyorder() throws InterruptedException
//	{
//		driver.get(BaseURl);
//		
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		MyOrders cc = new MyOrders(driver);
//		cc.Setemail();
//		cc.Setpassword();
//		cc.clicklogin();
//		Thread.sleep(2000);
//		cc.clickmyorder();
//		Thread.sleep(2000);
//		cc.clickedit();
//		Thread.sleep(3000);
//        cc.clickusername("deepika");
//		cc.clickphonenum("9952457188");
//		cc.clickeditorderstatus("shipped");
//		cc.clickpaymentmode("Razorpay");
//		Thread.sleep(3000);
//		cc.paymentstatus("pending");
//		js.executeScript("window.scrollBy(0,80000)");
//		Thread.sleep(5000);
//		cc.clickdate("29.7.2001");
//		cc.clickeditamount("8000");
//		js.executeScript("window.scrollBy(0,80000)");
//		Thread.sleep(2000);
//		cc.clickcardstatus("active");
//		//cc.clickcardstatus1();
//		Thread.sleep(2000);
//     	cc.clickpartner("jack");
//		Thread.sleep(2000);
//		cc.clicktrackid("001dd");
//		Thread.sleep(2000);
//		cc.clicktrackurl("hhtp://www.track");
//		js.executeScript("window.scrollBy(0,80000)");
//		Thread.sleep(10000);
//		cc.clickupdate();
//	}
	@Test(priority=4)
	public void edittestmyordercancel() throws InterruptedException
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
		cc.clickedit();
		Thread.sleep(3000);
        cc.clickusername("deepika");
		cc.clickphonenum("0000000000");
		cc.clickeditorderstatus("cancel");
		cc.clickpaymentmode("manual");
		Thread.sleep(3000);
		cc.paymentstatus("success");
		cc.clickdate("jyhgft");
		js.executeScript("window.scrollBy(0,80000)");
		Thread.sleep(3000);
		cc.clickeditamount("5000");
		cc.clickcardstatus("active");
        js.executeScript("window.scrollBy(0,80000)");
        cc.cancelres("[];'./,");
		Thread.sleep(5000);
		 cc.clickupdate();
	}

}
