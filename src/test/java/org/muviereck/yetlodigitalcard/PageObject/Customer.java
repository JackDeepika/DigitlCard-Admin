package org.muviereck.yetlodigitalcard.PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Customer {
	
	WebDriver ldriver;
	public Customer(WebDriver rdriver)
	{
		ldriver = rdriver;
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
	
	@FindBy(xpath="//*[@id=\'sidebar-wrapper\']/div[2]/a[1]")
	WebElement customer;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/thead/tr/th[2]/div/span[1]")
	WebElement sortname;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/thead/tr/th[3]/div/span[1]")
	WebElement sortphn;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/thead/tr/th[4]/div/span[1]")
	WebElement sortemail;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/thead/tr/th[5]/div/span[1]")
	WebElement sorttype;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[2]/div/div/div[1]/select")
	WebElement namecontain;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[2]/div/div/div[1]/select/option[1]")
	WebElement contains;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[2]/div/div/div[1]/select/option[2]")
	WebElement doescontain;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[2]/div/div/div[1]/select/option[3]")
	WebElement is ;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[2]/div/div/div[1]/select/option[4]")
	WebElement isnot;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[2]/div/div/div[1]/select/option[5]")
	WebElement startwith;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[2]/div/div/div[1]/select/option[6]")
	WebElement endwith;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[2]/div/div/div[1]/select/option[7]")
	WebElement  isempty;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[2]/div/div/div[1]/select/option[8]")
	WebElement isnotempty ;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[2]/div/div/div[1]/select/option[9]")
	WebElement isnull ;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[2]/div/div/div[1]/select/option[10]")
	WebElement isnotnull ;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[2]/div/div/div[1]/select/option[11]")
	WebElement isblank ;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[2]/div/div/div[1]/select/option[12]")
	WebElement isnotblank ;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/div[1]/select")
	WebElement phncontain;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/div[1]/select/option[1]")
	WebElement phncontains;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/div[1]/select/option[2]")
	WebElement phndoescontains;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/div[1]/select/option[3]")
	WebElement phnis;

	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/div[1]/select/option[4]")
	WebElement phnisnot;

	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/div[1]/select/option[5]")
	WebElement phnstartwith;

	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/div[1]/select/option[6]")
	WebElement phnendwith;

	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/div[1]/select/option[7]")
	WebElement phnisempty;

	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/div[1]/select/option[8]")
	WebElement phnisnotempty;

	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/div[1]/select/option[9]")
	WebElement phnisnull;

	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/div[1]/select/option[10]")
	WebElement phnisnotnull;

	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/div[1]/select/option[11]")
	WebElement phnisblank;

	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/div[1]/select/option[12]")
	WebElement phnisnotblank;


	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[1]/select")
	WebElement emailcontain;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[1]/select/option[1]")
	WebElement emailcontains;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[1]/select/option[2]")
	WebElement emaildoescontains;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[1]/select/option[3]")
	WebElement emailis;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[1]/select/option[4]")
	WebElement emailisnot;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[1]/select/option[5]")
	WebElement emailstartwith;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[1]/select/option[6]")
	WebElement emailendwith;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[1]/select/option[7]")
	WebElement emailisempty;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[1]/select/option[8]")
	WebElement emailisnotempty;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[1]/select/option[9]")
	WebElement emailisnull;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[1]/select/option[10]")
	WebElement emailisnotnull;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[1]/select/option[11]")
	WebElement emailisblank;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[1]/select/option[12]")
	WebElement emailisnotblank;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select")
	WebElement typecontain;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[1]")
	WebElement typecontains;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[2]")
	WebElement typeis;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[3]")
	WebElement typeisnot;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[4]")
	WebElement typestartwith;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[5]")
	WebElement typeendwith;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[6]")
	WebElement typeisempty;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[7]")
	WebElement typeisnotempty;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[8]")
	WebElement typeisnull;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[9]")
	WebElement typeisnotnull;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[10]")
	WebElement typeisblank;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[11]")
	WebElement typeisnotblank;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[12]")
	WebElement typedoescontains;
	
	
	
	//search
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[2]/div/div/div[2]/input")
	WebElement namesearch;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/div[2]/input")
	WebElement phnsearch;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[2]/input")
	WebElement emailsearch;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[2]/input")
	WebElement typesearch;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[2]/td[6]/div/button/i")
	WebElement eye;
	
	
	//Edit
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[2]/td[7]/div/button/i")
	WebElement edit;
	
	@FindBy(xpath="//*[@id=\'Image\']")
	WebElement username;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[2]/div/form/div/div[2]/div[2]/input")
	WebElement phonenumber;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[2]/div/form/div/div[2]/div[3]/input")
	WebElement emailedit;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[2]/div/form/div/div[2]/div[4]/select")
	WebElement status;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[2]/div/form/div/div[3]/button")
	WebElement update;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[2]/div/form/div/div[1]/button")
	WebElement updatecancel;
	
	//Delete
	
	@FindBy(xpath="/html/body/div/div[2]/div/div/div/div[3]/div[2]/div/table/tbody/tr[9]/td[8]/div/button/i")
	WebElement delete;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[4]/div/form/div/div[1]/button")
	WebElement deletecancel;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[4]/div/form/div/div[3]/button")
	WebElement deleteconfirm;
	
	
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
	public void Clickcustomer()
	{
		customer.click();
	}
	public void clickSortname()
	{
		sortname.click();
		sortname.click();
	}
	public void clicksortphn()
	{
		sortphn.click();
		sortphn.click();
	}
	public void clicksortemail()
	{
		sortemail.click();
		sortemail.click();
	}
	public void clicksorttype()
	{
		sorttype.click();
		sorttype.click();
	}
	public void clicknamecontain(String name)
	{
		namecontain.click();
		
		if(name.equals("Contains"))
		{
			contains.click();
		}
		else if(name.equals("does not contains"))
		{
			doescontain.click();
		}
		else if(name.equals("is"))
		{
			is.click();
		}
		else if(name.equals("is not"))
		{
			isnot.click();
		}
		else if(name.equals("startwith"))
		{
			startwith.click();
		}
		
		else if(name.equals("endwith"))
		{
			endwith.click();
		}
		else if(name.equals("is empty"))
		{
			isempty.click();
		}
		else if(name.equals("is not empty"))
		{
			isnotempty.click();
		}
		else if(name.equals("is null"))
		{
			isnull.click();
		}
		else if(name.equals("is not null"))
		{
			isnotnull.click();
		}
		else if(name.equals("is blank"))
		{
			isblank.click();
		}
		else if (name.equals("is not blank"))
		{
			isnotblank.click();
		}
			//		Select ss  = new Select(namecontain);
//		ss.selectByIndex(1);
	}
	public void clickphncontain(String phone) throws InterruptedException
	{
		phncontain.click();
		Thread.sleep(2000);
		if(phone.equals("Contains"))
		{
			phncontains.click();
		}
		else if(phone.equals("does not contains"))
		{
			phndoescontains.click();
		}
		else if(phone.equals("is"))
		{
			phnis.click();
		}
		else if(phone.equals("is not"))
		{
			phnisnot.click();
		}
		else if(phone.equals("startwith"))
		{
			phnstartwith.click();
		}
		
		else if(phone.equals("endwith"))
		{
			phnendwith.click();
		}
		else if(phone.equals("is empty"))
		{
			phnisempty.click();
		}
		else if(phone.equals("is not empty"))
		{
			phnisnotempty.click();
		}
		else if(phone.equals("is null"))
		{
			phnisnull.click();
		}
		else if(phone.equals("is not null"))
		{
			phnisnotnull.click();
		}
		else if(phone.equals("is blank"))
		{
			phnisblank.click();
		}
		else if (phone.equals("is not blank"))
		{
			phnisnotblank.click();
		}
//		Select ss1 = new Select(phncontain);
//		ss1.selectByIndex(5);
	}
	public void clickemailcontain(String email) throws InterruptedException
	{
		emailcontain.click();
		Thread.sleep(2000);
		if(email.equals("Contains"))
		{
			emailcontains.click();
		}
		else if(email.equals("does not contains"))
		{
			emaildoescontains.click();
		}
		else if(email.equals("is"))
		{
			emailis.click();
		}
		else if(email.equals("is not"))
		{
			emailisnot.click();
		}
		else if(email.equals("startwith"))
		{
			emailstartwith.click();
		}
		
		else if(email.equals("endwith"))
		{
			emailendwith.click();
		}
		else if(email.equals("is empty"))
		{
			emailisempty.click();
		}
		else if(email.equals("is not empty"))
		{
			emailisnotempty.click();
		}
		else if(email.equals("is null"))
		{
			emailisnull.click();
		}
		else if(email.equals("is not null"))
		{
			emailisnotnull.click();
		}
		else if(email.equals("is blank"))
		{
			emailisblank.click();
		}
		else if (email.equals("is not blank"))
		{
			emailisnotblank.click();
		}
	}
	public void clicktypecontain(String type) throws InterruptedException
	{
		typecontain.click();
		Thread.sleep(2000);
		if(type.equals("Contains"))
		{
			typecontains.click();
		}
		else if(type.equals("does not contains"))
		{
			typedoescontains.click();
		}
		else if(type.equals("is"))
		{
			typeis.click();
		}
		else if(type.equals("is not"))
		{
			typeisnot.click();
		}
		else if(type.equals("startwith"))
		{
			typestartwith.click();
		}
		
		else if(type.equals("endwith"))
		{
			typeendwith.click();
		}
		else if(type.equals("is empty"))
		{
			typeisempty.click();
		}
		else if(type.equals("is not empty"))
		{
			typeisnotempty.click();
		}
		else if(type.equals("is null"))
		{
			typeisnull.click();
		}
		else if(type.equals("is not null"))
		{
			typeisnotnull.click();
		}
		else if(type.equals("is blank"))
		{
			typeisblank.click();
		}
		else if (type.equals("is not blank"))
		{
			typeisnotblank.click();
		}
		
	}
	public void setnamesearch()
	{
		namesearch.sendKeys("sugan");
	}
	public void setwrongnamesrc()
	{
		namesearch.sendKeys("dd");
	}
	public void setphnsearch()
	{
		phnsearch.sendKeys("123123123");
	}
	public void setwrongphnsrc()
	{
		phnsearch.sendKeys("1569864");
	}
	public void setemailsearch()
	{
		emailsearch.sendKeys("suganya15baskar@gmail.com");
	}
	public void setwrongemailsrc()
	{
		emailsearch.sendKeys("gt@gamil.com");
	}
	public void settypesearch()
	{
		typesearch.sendKeys("customer");
	}
	public void setwrongtypsrc()
	{
		typesearch.sendKeys("cus");
	}
	public void Clickeye()
	{
		eye.click();
	}
	
    public void clickedit()
    {
    	edit.click();
    }
    public void setusername()
    {
    	username.clear();
    	username.sendKeys("kavink");
    }
    public void usernamenumber()
    {
    	username.clear();
    	username.sendKeys("e");
    }
    public void usernameclear()
    {
    	username.clear();
    }
    public void setphnnumber()
    {
    	phonenumber.sendKeys("8");
    }
    public void phnnumberwords()
    {
    	phonenumber.clear();
    	phonenumber.sendKeys("95936824752");
    }
    public void phnnumberclear()
    {
    	phonenumber.clear();
    }
    public void seteditemail()
    {
    	emailedit.sendKeys("m");
    }
    public void emailclear()
    {
    	emailedit.clear();
    }
    public void emailnumber()
    {
    	emailedit.clear();
    	emailedit.sendKeys("6780@fr.com");
    }
    public void orderstatus()
    {
    	status.click();
    	Select ss5= new Select(status);
    	ss5.selectByIndex(2);
    }
    public void setupdate()
    {
    	update.click();
    }
    public void clickupdatecancel()
    {
    	updatecancel.click();
    }
    public void clickdelete()
    {
    	delete.click();
    }
    public void clickdeletecancel()
    {
    	deletecancel.click();
    }
    public void clickdeleteconfirm()
    {
    	deleteconfirm.click();
    }
    
}
