package org.muviereck.yetlodigitalcards.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public String BaseURl="https://digitalcard.yetloapps.com/admin-login";
	public String Email="tester@muvierecktech.com";
	public String Password="suganya@12";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		ChromeOptions co =new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        
		System.setProperty("WebDriver.chrome.driver",System.getenv("user.dir")+"//Drivers//chromedriver2.exe");
		 driver=new ChromeDriver(co);
		 driver.manage().window().maximize();
	}
	
//	@AfterClass
//	public void tearDown()
//	{
//		driver.quit();
//	}

}
