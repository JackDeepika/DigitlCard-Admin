package org.muviereck.yetlodigitalcard.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResellerCommision {
	WebDriver ldriver;
	public ResellerCommision(WebDriver rdriver)
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
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/a[3]")
	WebElement reseller;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[2]/button")
	WebElement add;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[2]/div/form/div/div[2]/div/div[1]/input")
	WebElement addname;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[2]/div/form/div/div[2]/div/div[2]/select")
	WebElement addcommision;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[2]/div/form/div/div[2]/div/div[2]/select/option[2]")
	WebElement flat;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[2]/div/form/div/div[2]/div/div[2]/select/option[3]")
	WebElement commision;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[2]/div/form/div/div[2]/div/div[3]/input")
	WebElement price;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[2]/div/form/div/div[2]/div/div[4]/div/input[1]")
	WebElement active;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[2]/div/form/div/div[2]/div/div[4]/div/input[2]")
	WebElement inactive;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[2]/div/form/div/div[3]/button")
	WebElement save;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/thead/tr/th[2]/div/span[1]/svg")
	WebElement namesort;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/thead/tr/th[3]/div/span[1]/svg")
	WebElement typesort;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/thead/tr/th[4]/div/span[1]/svg")
	WebElement pricesort;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/thead/tr/th[5]/div/span[1]/svg")
	WebElement statussort;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[2]/div/div/div[1]/select")
	WebElement namecon;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[2]/div/div/div[1]/select/option[1]")
	WebElement contains;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[2]/div/div/div[1]/select/option[2]")
	WebElement notcontains;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[2]/div/div/div[1]/select/option[3]")
	WebElement is;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[2]/div/div/div[1]/select/option[4]")
	WebElement isnot;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[2]/div/div/div[1]/select/option[5]")
	WebElement startwith;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[2]/div/div/div[1]/select/option[6]")
	WebElement endwith;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[2]/div/div/div[1]/select/option[7]")
	WebElement isempty;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[2]/div/div/div[1]/select/option[8]")
	WebElement isnotempty;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[2]/div/div/div[1]/select/option[9]")
	WebElement isnull;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[2]/div/div/div[1]/select/option[10]")
	WebElement isnotnull;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[2]/div/div/div[1]/select/option[11]")
	WebElement isblank;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[2]/div/div/div[1]/select/option[12]")
	WebElement isnotblank;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/div[1]/select")
	WebElement typecon;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/div[1]/select/option[1]")
	WebElement typcontains;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/div[1]/select/option[2]")
	WebElement typnotcontains;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/div[1]/select/option[3]")
	WebElement typis;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/div[1]/select/option[4]")
	WebElement typisnot;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/div[1]/select/option[5]")
	WebElement typstartwith;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/div[1]/select/option[6]")
	WebElement typendwith;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/div[1]/select/option[7]")
	WebElement typisempty;

	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/div[1]/select/option[8]")
	WebElement typisnotempty;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/div[1]/select/option[9]")
	WebElement typisnull;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/div[1]/select/option[10]")
	WebElement typisnotnull;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/div[1]/select/option[11]")
	WebElement typblank;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/div[1]/select/option[12]")
	WebElement typnotblank;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select")
	WebElement status;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[1]")
	WebElement stscontains;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[2]")
	WebElement stsnotcontains;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[3]")
	WebElement stsis;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[4]")
	WebElement stsisnot;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[5]")
	WebElement stsstartwith;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[6]")
	WebElement stsendwith;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[7]")
	WebElement stsisempty;

	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[8]")
	WebElement stsisnotempty;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[9]")
	WebElement stsisnull;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[10]")
	WebElement stsisnotnull;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[11]")
	WebElement stsblank;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/select/option[12]")
	WebElement stsnotblank;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[2]/div/div/div[2]/input")
	WebElement namesrch;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/div[2]/input")
	WebElement typesrch;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[1]/input")
	WebElement minsrch;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[2]/input")
	WebElement maxsrch;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[2]/input")
	WebElement statusscrh;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[2]/td[6]/div/button")
	WebElement edit;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[3]/div/form/div/div[2]/div/div[1]/input")
	WebElement editname;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[3]/div/form/div/div[2]/div/div[2]/select")
	WebElement editcommision;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[3]/div/form/div/div[2]/div/div[2]/select/option[1]")
	WebElement editselect;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[3]/div/form/div/div[2]/div/div[2]/select/option[2]")
	WebElement editflat;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[3]/div/form/div/div[2]/div/div[2]/select/option[3]")
	WebElement editcommis;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[3]/div/form/div/div[2]/div/div[3]/input")
	WebElement editprice;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[3]/div/form/div/div[2]/div/div[4]/div/input[1]")
	WebElement editactive;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[3]/div/form/div/div[2]/div/div[4]/div/input[2]")
	WebElement editinactive;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[3]/div/form/div/div[3]/button")
	WebElement update;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[3]/div/form/div/div[1]/button")
	WebElement editcancel;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/table/tbody/tr[2]/td[7]/div/button/i")
	WebElement delete;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[4]/div/form/div/div[1]/button")
	WebElement deletecancel;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[4]/div/form/div/div[3]/button")
    WebElement deletecon;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[3]/div/div/footer/div[1]/div/label/select")
	WebElement record;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[3]/div/div/footer/div[1]/div/label/select/option[1]")
	WebElement ten;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[3]/div/div/footer/div[1]/div/label/select/option[2]")
	WebElement twentyfive;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[3]/div/div/footer/div[1]/div/label/select/option[3]")
	WebElement fifty;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[3]/div/div/footer/div[1]/div/label/select/option[4]")
	WebElement hund;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/div[3]/div/div/footer/div[1]/div/label/select/option[5]")
	WebElement all;
	
	
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
	public void clickreseller()
	{
		reseller.click();
	}
	public void clickadd()
	{
		add.click();
	}
	public void clickaddname(String name)
	{
		addname.sendKeys(name);
	}
	public void clickcommision(String commision1)
	{
		addcommision.click();
		if(commision1.equals("Flat"))
		{
			flat.click();
		}
		else if(commision1.equals("Commision"))
		{
			commision.click();
		}
	}
	public void setprice(String prc)
	{
		price.sendKeys(prc);
	}
	public void setstatus(String status)
	{
		if(status.equals("active"))
		{
			active.click();
		}
		else if(status.equals("inactive"))
		{
			inactive.click();
		}
	}
	public void clicksave()
	{
		save.click();
		save.click();
	}
	public void clicknamesort()
	{
		namesort.click();
		namesort.click();
	}
	public void clicktypesort()
	{
		typesort.click();
		typesort.click();
	}
	public void clickpricesort()
	{
		pricesort.click();
		pricesort.click();
	}
	public void clickstatussort()
	{
		statussort.click();
		statussort.click();
	}
	public void clicknamecontain(String name)
	{
		if(name.equals("contains"))
		{
			contains.click();
		}
		else if(name.equals("not contains"))
		{
			notcontains.click();
		}
		else if(name.equals("is"))
		{
			is.click();
		}
		else if(name.equals("is not"))
		{
			isnot.click();
		}
		else if(name.equals("start with"))
		{
			startwith.click();
		}
		else if(name.equals("ends with"))
		{
			endwith.click();
		}
		else if(name.equals("is empty"))
		{
			isempty.click();
		}
		else if(name.equals("is notempty"))
		{
			isnotempty.click();
		}
		else if(name.equals("null"))
		{
			isnull.click();
		}
		else if (name.equals("is not null"))
		{
			isnotnull.click();
		}
		else if(name.equals("isblank"))
		{
			isblank.click();
		}
		else if(name.equals("is notblank"))
		{
			isnotblank.click();
		}
	}
	public void clicktypecontain(String type)
	{
		if(type.equals("contains"))
		{
			typcontains.click();
		}
		else if(type.equals("not contains"))
		{
			typnotcontains.click();
		}
		else if(type.equals("is"))
		{
			typis.click();
		}
		else if(type.equals("is not"))
		{
			typisnot.click();
		}
		else if(type.equals("start with"))
		{
			typstartwith.click();
		}
		else if(type.equals("ends with"))
		{
			typendwith.click();
		}
		else if(type.equals("is empty"))
		{
			typisempty.click();
		}
		else if(type.equals("is notempty"))
		{
			typisnotempty.click();
		}
		else if(type.equals("null"))
		{
			typisnull.click();
		}
		else if (type.equals("is not null"))
		{
			typisnotnull.click();
		}
		else if(type.equals("isblank"))
		{
			typblank.click();
		}
		else if(type.equals("is notblank"))
		{
			typnotblank.click();
		}
	}
	public void clickstatuscontain(String status)
	{
		if(status.equals("contains"))
		{
			stscontains.click();
		}
		else if(status.equals("not contains"))
		{
			stsnotcontains.click();
		}
		else if(status.equals("is"))
		{
			stsis.click();
		}
		else if(status.equals("is not"))
		{
			stsisnot.click();
		}
		else if(status.equals("start with"))
		{
			stsstartwith.click();
		}
		else if(status.equals("ends with"))
		{
			stsendwith.click();
		}
		else if(status.equals("is empty"))
		{
			stsisempty.click();
		}
		else if(status.equals("is notempty"))
		{
			stsisnotempty.click();
		}
		else if(status.equals("null"))
		{
			stsisnull.click();
		}
		else if (status.equals("is not null"))
		{
			stsisnotnull.click();
		}
		else if(status.equals("isblank"))
		{
			stsblank.click();
		}
		else if(status.equals("is notblank"))
		{
			stsnotblank.click();
		}
	}
    public void clicknamesrch(String Name)
    {
    	namesrch.sendKeys(Name);
    }
    public void clicktypesrch(String Name)
    {
    	typesrch.sendKeys(Name);
    }
    public void clickminsrch(String Name)
    {
    	minsrch.sendKeys(Name);
    }
    public void clickmaxsrch(String Name)
    {
    	maxsrch.sendKeys(Name);
    }
    public void clickstatussrch(String Name)
    {
    	statusscrh.sendKeys(Name);
    }
    public void clickedit()
    {
    	edit.click();
    }
    public void clickeditname(String value)
    {
    	editname.clear();
    	editname.sendKeys(value);
    }
    public void clickeditcommision(String commi)
    {
    	editcommision.click();
		if(commi.equals("Flat"))
		{
			editflat.click();
		}
		else if(commi.equals("Commision"))
		{
			editcommis.click();
		}
    }
    public void clickeditprice(String price)
    {
    	editprice.clear();
    	editprice.sendKeys(price);
    }
    public void clickstatus(String status1)
    {
    	if(status1.equals("active"))
		{
			editactive.click();
		}
		else if(status1.equals("inactive"))
		{
			editinactive.click();
		}
    }
    public void clickupdate()
    {
    	update.click();
    }
    public void clickeditcancel()
    {
    	editcancel.click();
    }
    public void clickdelete()
    {
    	delete.click();
    }
    public void clickdeletecancel()
    {
    	deletecancel.click();
    }
    public void clickdeletecon()
    {
    	deletecon.click();
    }
    public void clickrecord(String page)
    {
    	if(page.equals("10"))
    	{
    		ten.click();
    	}
    	else if(page.equals("25"))
    	{
    		twentyfive.click();
    	}
    	else if(page.equals("50"))
    	{
    		fifty.click();
    	}
    	else if(page.equals("100"))
    	{
    		hund.click();
    	}
    	else if(page.equals("all"))
    	{
    		all.click();
    	}
    }

}
