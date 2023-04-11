package org.muviereck.settingsTestCase;

import org.muviereck.yetlodigitalcard.PageObject.Settings;
import org.muviereck.yetlodigitalcards.TestCase.BaseClass;
import org.testng.annotations.Test;

public class TC_logout_01 extends BaseClass{
	@Test
	public void clicklogout() throws InterruptedException
	{
		driver.get(BaseURl);
		Settings rc = new Settings(driver);
		rc.Setemail();
		rc.Setpassword();
		rc.clicklogin();
		Thread.sleep(2000);
		rc.Clickmenu();
		Thread.sleep(2000);
		rc.clicklogout();
	}

}
