package org.muviereck.customerTestCase;

import org.muviereck.yetlodigitalcard.PageObject.Customer;
import org.muviereck.yetlodigitalcards.TestCase.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_Delete_01 extends BaseClass{
	@Test(priority=0)
	public void deletetest() throws InterruptedException
	{
		driver.get(BaseURl);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Customer cc = new Customer(driver);
		cc.Setemail();
		cc.Setpassword();
		cc.clicklogin();
		Thread.sleep(2000);
		cc.Clickcustomer();
		Thread.sleep(2000);
		cc.clickdelete();
		Thread.sleep(2000);
		cc.clickdeletecancel();
	}
	@Test(priority=1)
	public void deletetestconfirm() throws InterruptedException
	{
		driver.get(BaseURl);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Customer cc = new Customer(driver);
		cc.Setemail();
		cc.Setpassword();
		cc.clicklogin();
		Thread.sleep(2000);
		cc.Clickcustomer();
		Thread.sleep(2000);
		cc.clickdelete();
		Thread.sleep(2000);
		cc.clickdeleteconfirm();
	}

}
