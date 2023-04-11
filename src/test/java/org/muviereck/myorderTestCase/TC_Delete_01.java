package org.muviereck.myorderTestCase;

import org.muviereck.yetlodigitalcard.PageObject.MyOrders;
import org.muviereck.yetlodigitalcards.TestCase.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_Delete_01 extends BaseClass {
	@Test(priority=0)
	public void deletetest() throws InterruptedException
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
		cc.clickdelte();
		Thread.sleep(2000);
		cc.clickdeletecancel();
	}
	@Test(priority=1)
	public void deletetestcon() throws InterruptedException
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
		cc.clickdelte();
		Thread.sleep(2000);
		cc.clickdeletecon();
	}
	@Test(priority=2)
	public void deletetestconmyorder() throws InterruptedException
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
		cc.clickdeletemyorder();
		cc.clickdeleteconmyorder();
	}
	@Test(priority=3)
	public void deletetestconmyordercancel() throws InterruptedException
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
		cc.clickdeletemyorder();
		cc.clickdelcancelmyorder();
	}

}
