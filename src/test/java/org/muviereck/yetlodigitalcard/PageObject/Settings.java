package org.muviereck.yetlodigitalcard.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings {
	WebDriver ldriver;
	public Settings(WebDriver rdriver)
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
	
	@FindBy(id="sidebarToggle")
	WebElement menu;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/a[4]")
	WebElement setting;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[1]/input")
	WebElement NFC;

	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[3]/div[2]/div/div/div[1]/input")
	WebElement VistQR;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[4]/div[2]/div/div/div[1]/input")
	WebElement vistcode;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[2]/input")
	WebElement NFCorginal;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[3]/div[2]/div/div/div[2]/input")
	WebElement QRorginal;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[4]/div[2]/div/div/div[2]/input")
	WebElement visitorginal;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[3]/button")
	WebElement nfcadd;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[3]/div[2]/div/div/div[3]/button")
	WebElement qradd;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[4]/div[2]/div/div/div[3]/button")
	WebElement codeadd;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/nav/div/div/ul/li/a")
	WebElement logout;
	
	public void Setemail()
	{
		email.sendKeys("tester@muvierecktech.com");
	}
	public void Setpassword()
	{
		password.sendKeys("suganya@12");
	}
	public void clicklogin()
	{
		login.click();
	}
	public void Clickmenu() throws InterruptedException
	{
		menu.click();
		Thread.sleep(1000);
		menu.click();
	}
	public void clicksetting()
	{
		setting.click();
	}
	public void clickNFC(String mrp)
	{
		NFC.clear();
		NFC.sendKeys(mrp);
	}
	public void clickVistQR(String mrp)
	{
		VistQR.clear();
		VistQR.sendKeys(mrp);
	}
	public void clickvistcode(String mrp)
	{
		vistcode.clear();
		vistcode.sendKeys(mrp);
	}
	public void clickNFCorginal(String orginal)
	{
		NFCorginal.clear();
		NFCorginal.sendKeys(orginal);
	}
	public void clickQRorginal(String orginal)
	{
		QRorginal.clear();
		QRorginal.sendKeys(orginal);
	}
	public void clickvisitorginal(String orginal)
	{
		visitorginal.clear();
		visitorginal.sendKeys(orginal);
	}
	public void clicknfcadd()
	{
		
		nfcadd.click();
	}
	public void clickqradd()
	{
		qradd.click();
	}
	public void clickvistadd()
	{
		codeadd.click();
	}
	public void clicklogout()
	{
		logout.click();
	}

}
