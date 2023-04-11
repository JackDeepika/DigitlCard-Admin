package org.muviereck.myorderTestCase;

import org.muviereck.yetlodigitalcard.PageObject.MyOrders;
import org.muviereck.yetlodigitalcards.TestCase.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_ContainsOrder_01 extends BaseClass{
	@Test(priority=0)
	public void containstest() throws InterruptedException
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
		cc.clickperiod();
		cc.clickselectdate();
		cc.clickdigitalidcontain();
		cc.clickdigitalnamecontain();
		cc.clickvisitincontain();
		cc.clickordercontain();
		cc.clickstatuscontain();
		
	}
	@Test(priority=1)
	public void containstestcrt() throws InterruptedException
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
		cc.clickperiod();
		cc.clickselectcrtdate();
		cc.clickdigitalidcrtcontain();
		cc.clickdigitalnamecrtcontain();
		cc.clickvisitincrtcontain();
		cc.clickordercrtcontain();
		cc.clickstatuscrtcontain();
	}

}
