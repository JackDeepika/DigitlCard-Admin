package org.muviereck.resellerTestCase;

import org.muviereck.yetlodigitalcard.PageObject.ResellerCommision;
import org.muviereck.yetlodigitalcards.TestCase.BaseClass;
import org.testng.annotations.Test;

public class TC_contains_01 extends BaseClass{
//	@Test(priority=0)
//	public void namecon() throws InterruptedException
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
//		rc.clicknamecontain("start with");
//		rc.clicktypecontain("start with");
//		rc.clickstatuscontain("is not");
//		Thread.sleep(2000);
//	}
//	@Test(priority=1)
//	public void namesrch() throws InterruptedException
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
//		rc.clicknamesrch("deepika");
//		rc.clicktypesrch("flat");
//		rc.clickmaxsrch("5000");
//		rc.clickminsrch("100");
//		rc.clickstatussrch("active");
//	}
//	@Test(priority=2)
//	public void namesrchneg() throws InterruptedException
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
//		rc.clicknamesrch("lkjio");
//		rc.clicktypesrch("flat");
//		rc.clickmaxsrch("00");
//		rc.clickminsrch("100");
//		rc.clickstatussrch("inactive");
//	}
	@Test(priority=0)
	public void namecon() throws InterruptedException
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
		rc.clicknamecontain("start with");
		rc.clicktypecontain("start with");
		rc.clickstatuscontain("is not");
		Thread.sleep(2000);
	    rc.clicknamesrch("deepika");
	    rc.clicktypesrch("flat");
     	rc.clickmaxsrch("5000");
    	rc.clickminsrch("100");
    	rc.clickstatussrch("active");
	
	}



}
