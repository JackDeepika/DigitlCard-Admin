package org.muviereck.yetlodigitalcard.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginDigitalcards {
	
	WebDriver ldriver;
	
	public LoginDigitalcards (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="exampleInputEmail1")
	WebElement email;
	
	@FindBy(id="loginpassword")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\'center-content\']/div/section/div/div/div/div/div/form/div[3]/button")
	WebElement login;
	
	public void Setemail()
	{
		email.sendKeys("tester@muvierecktech.com");
	}
	public void Setwrongemail()
	{
		email.sendKeys("dd");
	}
	public void Setpassword()
	{
		password.sendKeys("suganya@12");
	}
	public void setwrongpassword() {
		password.sendKeys("ff");
	}
	
	public void Clicklogin()
	{
		login.click();
	}

}
