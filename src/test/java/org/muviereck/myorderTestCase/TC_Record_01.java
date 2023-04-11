package org.muviereck.myorderTestCase;

import org.muviereck.yetlodigitalcard.PageObject.MyOrders;
import org.muviereck.yetlodigitalcards.TestCase.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_Record_01 extends BaseClass {
	@Test(priority=0)
	public void recordtest() throws InterruptedException
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
		cc.clickrecord();
	}
	@Test(priority=1)
	public void recordtestmyorder() throws InterruptedException
	{
		driver.get(BaseURl);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		MyOrders cc = new MyOrders(driver);
		cc.Setemail();
		cc.Setpassword();
		cc.clicklogin();
		Thread.sleep(2000);
		cc.clickmyorder();
		Thread.sleep(4000);
		cc.clickrecmyorder("All");
	}

}
