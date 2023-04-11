package org.muviereck.resellerTestCase;

import org.muviereck.yetlodigitalcard.PageObject.ResellerCommision;
import org.muviereck.yetlodigitalcards.TestCase.BaseClass;
import org.testng.annotations.Test;

public class TC_Record_01 extends BaseClass {
	@Test(priority=0)
	public void recordtest() throws InterruptedException
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
		rc.clickrecord("100");
	}

}
