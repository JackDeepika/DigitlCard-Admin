package org.muviereck.resellerTestCase;

import org.muviereck.yetlodigitalcard.PageObject.ResellerCommision;
import org.muviereck.yetlodigitalcards.TestCase.BaseClass;
import org.testng.annotations.Test;

public class TC_Edit_01 extends BaseClass{
//	@Test(priority=0)
//	public void edittest() throws InterruptedException
//	{
//		driver.get(BaseURl);
//		ResellerCommision rc = new ResellerCommision(driver);
//		rc.Setemail();
//		rc.Setpassword();
//		rc.clicklogin();
//		Thread.sleep(2000);
//		rc.Clickmenu();
//		Thread.sleep(2000);
//		rc.clickreseller();
//		Thread.sleep(2000);
//		rc.clickedit();
//		Thread.sleep(2000);
//		rc.clickeditname("dd");
//		rc.clickeditcommision("Commision");
//		rc.clickeditprice("2000");
//		rc.clickstatus("inactive");
//		Thread.sleep(2000);
//		rc.clickupdate();
//	}
	@Test(priority=1)
	public void edittestneg() throws InterruptedException
	{
		driver.get(BaseURl);
		ResellerCommision rc = new ResellerCommision(driver);
		rc.Setemail();
		rc.Setpassword();
		rc.clicklogin();
		Thread.sleep(2000);
		rc.Clickmenu();
		Thread.sleep(2000);
		rc.clickreseller();
		Thread.sleep(2000);
		rc.clickedit();
		Thread.sleep(2000);
		rc.clickeditname("123654");
		rc.clickeditcommision("Commision");
		rc.clickeditprice("lki");
		rc.clickstatus("inactive");
		Thread.sleep(2000);
		rc.clickupdate();
	}
	@Test(priority=2)
	public void edittestcancel() throws InterruptedException
	{
		driver.get(BaseURl);
		ResellerCommision rc = new ResellerCommision(driver);
		rc.Setemail();
		rc.Setpassword();
		rc.clicklogin();
		Thread.sleep(2000);
		rc.Clickmenu();
		Thread.sleep(2000);
		rc.clickreseller();
		Thread.sleep(2000);
		rc.clickedit();
		Thread.sleep(2000);
		rc.clickeditcancel();
	}

}
