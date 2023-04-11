package org.muviereck.myorderTestCase;


import org.muviereck.yetlodigitalcard.PageObject.MyOrders;
import org.muviereck.yetlodigitalcards.TestCase.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_SortOrder_01 extends BaseClass{
	@Test(priority=0)
	public void sortTest() throws InterruptedException
	{
		driver.get(BaseURl);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		MyOrders cc = new MyOrders(driver);
		cc.Setemail();
		cc.Setpassword();
		cc.clicklogin();
		Thread.sleep(2000);
		cc.clickmyorder();
		Thread.sleep(3000);
		cc.sortorderid();
		Thread.sleep(3000);
		cc.sortuserid();
		Thread.sleep(4000);
       cc.sortusername();
		cc.sortdigitacard();
		cc.sortdigitalname();
		cc.sortvisitingcard();
		Thread.sleep(2000);
		cc.sortorderstatus();
		cc.sortcardstatus();
		Thread.sleep(2000);
		
	}
	@Test(priority=1)
	public void sortTestvisit() throws InterruptedException
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
		cc.vistusersort();
		cc.vistordersort();
		Thread.sleep(2000);
		cc.vistcardsort();
		cc.visitimg();
	}

}
