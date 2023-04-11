package org.muviereck.resellerTestCase;

import org.muviereck.yetlodigitalcard.PageObject.ResellerCommision;
import org.muviereck.yetlodigitalcards.TestCase.BaseClass;
import org.testng.annotations.Test;

public class TC_Delete_01 extends BaseClass{
	@Test(priority=0)
	public void deletetest() throws InterruptedException
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
		rc.clickdelete();
		Thread.sleep(2000);
		rc.clickdeletecancel();
	}
	@Test(priority=1)
	public void deletetestcon() throws InterruptedException
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
		rc.clickdelete();
		Thread.sleep(2000);
		rc.clickdeletecon();
	}

}
