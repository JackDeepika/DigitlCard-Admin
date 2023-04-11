package org.muviereck.resellerTestCase;

import org.muviereck.yetlodigitalcard.PageObject.ResellerCommision;
import org.muviereck.yetlodigitalcards.TestCase.BaseClass;
import org.testng.annotations.Test;

public class TC_Add_01 extends BaseClass{
//	@Test(priority=0)
//	public void addtest() throws InterruptedException
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
//		rc.clickadd();
//		Thread.sleep(2000);
//		rc.clickaddname("deepika");
//		Thread.sleep(2000);
//		rc.clickcommision("Flat");
//		rc.setprice("5000");
//		rc.setstatus("active");
//		rc.clicksave();
//	}
	@Test(priority=1)
	public void addtestnumber() throws InterruptedException
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
		rc.clickadd();
		Thread.sleep(2000);
		rc.clickaddname("1236");
		Thread.sleep(2000);
		rc.clickcommision("Flat");
		rc.setprice("lkfghd");
		rc.setstatus("inactive");
		rc.clicksave();
	}
//	@Test(priority=2)
//	public void addtestspcl() throws InterruptedException
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
//		rc.clickadd();
//		Thread.sleep(2000);
//		rc.clickaddname("./,;");
//		Thread.sleep(2000);
//		rc.clickcommision("Flat");
//		rc.setprice(",./';");
//		rc.setstatus("active");
//		rc.clicksave();
//	}
//	@Test(priority=3)
//	public void addtestneg() throws InterruptedException
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
//		rc.clickadd();
//		Thread.sleep(2000);
//		rc.clickaddname("deepika1234");
//		Thread.sleep(2000);
//		rc.clickcommision("Flat");
//		rc.setprice("5000gftuu;'/.,");
//		rc.setstatus("active");
//		rc.clicksave();
//	}

}
