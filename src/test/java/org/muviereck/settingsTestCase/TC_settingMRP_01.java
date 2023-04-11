package org.muviereck.settingsTestCase;

import org.muviereck.yetlodigitalcard.PageObject.ResellerCommision;
import org.muviereck.yetlodigitalcard.PageObject.Settings;
import org.muviereck.yetlodigitalcards.TestCase.BaseClass;
import org.testng.annotations.Test;

public class TC_settingMRP_01 extends BaseClass{
	@Test(priority=0)
	public void settingtest() throws InterruptedException
	{
		driver.get(BaseURl);
		Settings rc = new Settings(driver);
		rc.Setemail();
		rc.Setpassword();
		rc.clicklogin();
		Thread.sleep(2000);
		rc.Clickmenu();
		Thread.sleep(2000);
		rc.clicksetting();
		Thread.sleep(2000);
		rc.clickNFC("2000");
		rc.clicknfcadd();
		rc.clickVistQR("74586");
		rc.clickqradd();
		rc.clickvistcode("852");
		rc.clickvistadd();
	}
	@Test(priority=1)
	public void settingtestchar() throws InterruptedException
	{
		driver.get(BaseURl);
		Settings rc = new Settings(driver);
		rc.Setemail();
		rc.Setpassword();
		rc.clicklogin();
		Thread.sleep(2000);
		rc.Clickmenu();
		Thread.sleep(2000);
		rc.clicksetting();
		Thread.sleep(2000);
		rc.clickNFC("nhu");
		rc.clicknfcadd();
		rc.clickVistQR("ert");
		rc.clickqradd();
		rc.clickvistcode("oijh");
		rc.clickvistadd();
	}
	@Test(priority=2)
	public void settingtestspcl() throws InterruptedException
	{
		driver.get(BaseURl);
		Settings rc = new Settings(driver);
		rc.Setemail();
		rc.Setpassword();
		rc.clicklogin();
		Thread.sleep(2000);
		rc.Clickmenu();
		Thread.sleep(2000);
		rc.clicksetting();
		Thread.sleep(2000);
		rc.clickNFC(";'./");
		rc.clicknfcadd();
		rc.clickVistQR("./;'");
		rc.clickqradd();
		rc.clickvistcode("[]';");
		rc.clickvistadd();
	}

}
