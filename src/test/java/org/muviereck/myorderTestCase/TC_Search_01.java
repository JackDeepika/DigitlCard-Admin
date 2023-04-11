package org.muviereck.myorderTestCase;

import org.muviereck.yetlodigitalcard.PageObject.MyOrders;
import org.muviereck.yetlodigitalcards.TestCase.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_Search_01 extends BaseClass {
	@Test(priority=0)
	public void searchTest() throws InterruptedException
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
		cc.clicksrchdigitalid();
		cc.clicksrchdigitalname();
		cc.clicksrchvisitingname();
		cc.clicksrchorderstatus();
		Thread.sleep(2000);
	}
	@Test(priority=1)
	public void searchTestnegative() throws InterruptedException
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
		cc.clicksrchnegdigid();
		cc.clicksrchnegdigname();
		cc.clicksrchnegvisname();
		cc.clicksrchnegorderstatus();
	}
	@Test(priority=2)
	public void searchTestboth() throws InterruptedException
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
		cc.clicksrchdigitalid();
		cc.clicksrchdigitalname();
		cc.clicksrchnegvisname();
		cc.clicksrchnegorderstatus();
	}
//	@Test(priority=3)
//	public void searchTestvisitingcard() throws InterruptedException
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
//		cc.setsearch();
//		Thread.sleep(2000);
//	}
//	@Test(priority=4)
//	public void searchTestvisitingcardnum() throws InterruptedException
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
//		cc.setsearchnum();
//		Thread.sleep(2000);
//	}
//	@Test(priority=5)
//	public void searchTestvisitingcardneg() throws InterruptedException
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
//		cc.setsearchneg();
//		Thread.sleep(2000);
//	}
//	@Test(priority=6)
//	public void searchTestvisitingcardnumneg() throws InterruptedException
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
//		cc.setsearchnumneg();
//		Thread.sleep(2000);
//	}
	
	

}
