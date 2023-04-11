package org.muviereck.LoginTestCase;

import org.muviereck.yetlodigitalcard.PageObject.LoginDigitalcards;
import org.muviereck.yetlodigitalcards.TestCase.BaseClass;
import org.testng.annotations.Test;

public class TC_Login_01 extends BaseClass{
	@Test (priority=0)
	public void TC_logintest() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.get(BaseURl);

		LoginDigitalcards lp=new LoginDigitalcards(driver);
		lp.Setemail();
		lp.Setpassword();
		Thread.sleep(2000);
		lp.Clicklogin();
		
		
	}
	@Test (priority=1)
	public void TC_logintestNegative() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.get(BaseURl);

		LoginDigitalcards lp=new LoginDigitalcards(driver);
		lp.Setwrongemail();
		lp.setwrongpassword();
		Thread.sleep(2000);
		lp.Clicklogin();
		
	}
	@Test (priority=2)
	public void TC_logintestNegativeemail() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.get(BaseURl);

		LoginDigitalcards lp=new LoginDigitalcards(driver);
		lp.Setwrongemail();
		lp.Setpassword();
		Thread.sleep(2000);
		lp.Clicklogin();
		
	}
	@Test (priority=3)
	public void TC_logintestNegativepwd() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.get(BaseURl);

		LoginDigitalcards lp=new LoginDigitalcards(driver);
		lp.Setemail();
		lp.setwrongpassword();
		Thread.sleep(2000);
		lp.Clicklogin();
		
	}

}
