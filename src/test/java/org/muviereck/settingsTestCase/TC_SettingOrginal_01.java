package org.muviereck.settingsTestCase;

import org.muviereck.yetlodigitalcard.PageObject.Settings;
import org.muviereck.yetlodigitalcards.TestCase.BaseClass;
import org.testng.annotations.Test;

public class TC_SettingOrginal_01 extends BaseClass{
	@Test(priority=0)
	public void orginal() throws InterruptedException
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
		rc.clickNFCorginal("2000");
		rc.clicknfcadd();
		rc.clickQRorginal("4125");
		rc.clickqradd();
		Thread.sleep(2000);
		rc.clickvisitorginal("1002");
		rc.clickvistadd();
	}
	@Test(priority=1)
	public void orginalchar() throws InterruptedException
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
		rc.clickNFCorginal("kkm");
		rc.clicknfcadd();
		rc.clickQRorginal("jnk");
		rc.clickqradd();
		Thread.sleep(2000);
		rc.clickvisitorginal("mkl");
		rc.clickvistadd();
	}
	@Test(priority=2)
	public void orginalspcl() throws InterruptedException
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
		rc.clickNFCorginal(".;'/");
		rc.clicknfcadd();
		rc.clickQRorginal("';[]");
		rc.clickqradd();
		Thread.sleep(2000);
		rc.clickvisitorginal(".;'/");
		rc.clickvistadd();
	}



}
