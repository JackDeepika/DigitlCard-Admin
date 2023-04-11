package org.muviereck.yetlodigitalcard.PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MyOrders {
	
	WebDriver ldriver;
	public MyOrders(WebDriver rdriver)
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
	
	@FindBy(xpath="//*[@id=\'sidebar-wrapper\']/div[2]/a[2]")
	WebElement myorder;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[3]/div[2]/div/table/thead/tr/th[3]/div/span[1]")
	WebElement orderid;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[2]/div/table/thead/tr/th[4]/div/span[1]")
	WebElement userid;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/form/div/div[2]/div[3]/input")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[2]/div/table/thead/tr/th[6]/div/span[1]")
	WebElement digitalid;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[2]/div/table/thead/tr/th[7]/div/span[1]")
	WebElement digitalname;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[2]/div/table/thead/tr/th[8]/div/span[1]")
	WebElement visitingcard;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[2]/div/table/thead/tr/th[9]/div/span[1]")
	WebElement orderstatus;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[2]/div/table/thead/tr/th[10]/div/span[1]")
	WebElement cardstatus;
	
	@FindBy(xpath="//*[@id=\'input_created_at_formatted\']")
	WebElement period;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div/span[18]")
	WebElement selectdate;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div/span[21]")
	WebElement selectcrtdate;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[6]/div/div/div[1]/select")
	WebElement digitalcontain;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[7]/div/div/div[1]/select")
	WebElement digitalnamecontain;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[8]/div/div/div[1]/select")
	WebElement visitingcontain;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[9]/div/div/div[1]/select")
	WebElement orderstatuscontain;
	
	@FindBy(xpath="//*[@id=\'input_name\']")
	WebElement cardstatuscontain;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[6]/div/div/div[2]/input")
	WebElement srchdigitalid;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[7]/div/div/div[2]/input")
	WebElement srchdigitalname;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[8]/div/div/div[2]/input")
	WebElement srchvisitingname;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[9]/div/div/div[2]/input")
	WebElement srchorderstatus;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[2]/div/table/tbody/tr[2]/td[11]/div/button/i")
	WebElement eye;
	
	@FindBy(xpath="//*[@id=\'btn_add\']")
	WebElement addposter;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div/div/div/div[3]/form/div/div[1]/input")
	WebElement cardname;
	
	@FindBy(xpath="//div[@class='col-md-12 mt-3']//input")
	WebElement img;
	
	@FindBy(xpath="//*[@id=\'activeRadio1\']")
	WebElement status;
	
	@FindBy(xpath="//*[@id=\'inactiveRadio2\']")
	WebElement status1;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[2]/div[3]/div/button[1]")
	WebElement add;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[2]/div[3]/div/button[2]")
	WebElement clear;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[4]/div[1]/div/div/div/div[2]/div/label/div/input")
	WebElement search;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[4]/div[2]/div/table/thead/tr/th[2]/div/span[1]")
	WebElement usersort;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[4]/div[2]/div/table/thead/tr/th[3]/div/span[1]")
	WebElement ordersort;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[4]/div[2]/div/table/thead/tr/th[4]/div/span[1]")
	WebElement cardsort;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[4]/div[2]/div/table/thead/tr/th[5]/div/span[1]")
	WebElement imgsort;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[4]/div[2]/div/table/tbody/tr[2]/td[7]/div/button/i")
	WebElement editvist;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[3]/div/form/div/div[2]/div[1]/input")
	WebElement cardedit;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[3]/div/form/div/div[2]/div[2]/div[1]/div/input")
	WebElement editimg;
	
	@FindBy(xpath="//*[@id=\'activeRadio1\']")
	WebElement viststatus;
	
	@FindBy(xpath="//*[@id=\'editframesModal\']/div/form/div/div[3]/button")
	WebElement vistupdate;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[4]/div[2]/div/table/tbody/tr[2]/td[8]/div/button/i")
	WebElement delete;
	
	@FindBy(xpath="//*[@id=\'deleteframesModal\']/div/form/div/div[1]/button")
	WebElement deletecancel;
	
	@FindBy(xpath="//*[@id=\'deleteframesModal\']/div/form/div/div[3]/button")
	WebElement deletecon;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[4]/div[3]/div/div/footer/div[1]/div/label/select")
	WebElement record;
	
	@FindBy(xpath="//*[@id=\"page-content-wrapper\"]/div/div/div/div/div[3]/div[2]/div/table/tbody/tr[2]/td[9]/div/button/i")
	WebElement edit;
	
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/form/div/div[2]/div[3]/input")
	WebElement editusername;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/form/div/div[2]/div[4]/input")
	WebElement editphone;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/form/div/div[2]/div[5]/select")
	WebElement editorderstatus;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/form/div/div[2]/div[5]/select/option[1]")
	WebElement editorderstatus1;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/form/div/div[2]/div[5]/select/option[2]")
	WebElement request;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/form/div/div[2]/div[5]/select/option[3]")
	WebElement processing;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/form/div/div[2]/div[5]/select/option[4]")
	WebElement shipped;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/form/div/div[2]/div[5]/select/option[5]")
	WebElement delivered;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/form/div/div[2]/div[5]/select/option[6]")
	WebElement cancel;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/form/div/div[2]/div[6]/select")
	WebElement editpay;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/form/div/div[2]/div[6]/select/option[1]")
	WebElement paymode;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/form/div/div[2]/div[6]/select/option[2]")
	WebElement razpay;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/form/div/div[2]/div[6]/select/option[3]")
	WebElement manual;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/form/div/div[2]/div[7]/select")
	WebElement paymentstatus;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/form/div/div[2]/div[7]/select/option[1]")
	WebElement paystatus;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/form/div/div[2]/div[7]/select/option[2]")
	WebElement success;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/form/div/div[2]/div[7]/select/option[3]")
	WebElement pending;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/form/div/div[2]/div[7]/select/option[4]")
	WebElement failure;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/form/div/div[2]/div[8]/input")
	WebElement editdate;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/form/div/div[2]/div[9]/input")
	WebElement editamount;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/form/div/div[2]/div[10]/input[1]")
	WebElement editcardstatus;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/form/div/div[2]/div[10]/input[2]")
	WebElement editcardstatus1;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/form/div/div[2]/div[11]/input")
	WebElement partner;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/form/div/div[2]/div[12]/input")
	WebElement trackid;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/form/div/div[2]/div[13]/input")
	WebElement trackurl;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/form/div/div[2]/div[11]/input")
	WebElement cancelreason;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/form/div/div[3]/button")
	WebElement update;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[3]/div[2]/div/table/tbody/tr[2]/td[13]/div/button/i")
	WebElement deletemyorder;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[4]/div/form/div/div[1]/button")
	WebElement delcancelmyorder;
	
	@FindBy(xpath="//*[@id=\"deleteorderModal\"]/div/form/div/div[3]/button")
	WebElement deleteconmyorder;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[3]/div/div/footer/div[1]/div/label/select")
	WebElement recordmyorder;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[3]/div/div/footer/div[1]/div/label/select/option[1]")
	WebElement ten;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[3]/div/div/footer/div[1]/div/label/select/option[2]")
	WebElement twentyfive;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[3]/div/div/footer/div[1]/div/label/select/option[3]")
	WebElement fifty;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[3]/div/div/footer/div[1]/div/label/select/option[4]")
	WebElement hundred;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[3]/div/div/footer/div[1]/div/label/select/option[5]")
	WebElement all;
	
	@FindBy(name="activeRadio") WebElement cardStatusActive;

	@FindBy(name="inactiveRadio") WebElement cardStatusInactive;
	
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
	public void clickmyorder()
	{
		myorder.click();
	}
	public void sortorderid()
	{
		orderid.click();
		orderid.click();
	}
	public void sortuserid()
	{
		userid.click();
		userid.click();
	}
	public void sortusername()
	{
		username.click();
		username.click();
	}
	public void sortdigitacard()
	{
		digitalid.click();
		digitalid.click();
	}
	public void sortdigitalname()
	{
		digitalname.click();
		digitalname.click();
	}
	public void sortvisitingcard()
	{
		visitingcard.click();
		visitingcard.click();
	}
	public void sortorderstatus()
	{
		orderstatus.click();
		orderstatus.click();
	}
	public void sortcardstatus()
	{
		cardstatus.click();
		cardstatus.click();
	}
	public void clickperiod()
	{
		period.click();
	}
	public void clickselectdate()
	{
		selectdate.click();
		selectdate.click();
	}
	public void clickselectcrtdate()
	{
		selectcrtdate.click();
		selectcrtdate.click();
	}
	public void clickdigitalidcontain()
	{
		digitalcontain.click();
		Select ss1 = new Select(digitalcontain);
		ss1.selectByIndex(6);
	}
	public void clickdigitalidcrtcontain()
	{
		digitalcontain.click();
		Select ss9 = new Select(digitalcontain);
		ss9.selectByIndex(4);
	}
	public void clickdigitalnamecontain()
	{
		digitalnamecontain.click();
		Select ss2 = new Select(digitalnamecontain);
		ss2.selectByIndex(6);
	}
	public void clickdigitalnamecrtcontain()
	{
		digitalnamecontain.click();
		Select ss8 = new Select(digitalnamecontain);
		ss8.selectByIndex(4);
	}
	public void clickvisitincontain()
	{
		visitingcontain.click();
		Select ss3 = new Select(visitingcontain);
		ss3.selectByIndex(6);
	}
	public void clickvisitincrtcontain()
	{
		visitingcontain.click();
		Select ss7 = new Select(visitingcontain);
		ss7.selectByIndex(4);
	}
	public void clickordercontain()
	{
		orderstatuscontain.click();
		Select ss4 = new Select(orderstatuscontain);
		ss4.selectByIndex(6);
		
	}
	public void clickordercrtcontain()
	{
		orderstatuscontain.click();
		Select ss6 = new Select(orderstatuscontain);
		ss6.selectByIndex(7);
		
	}
	public void clickstatuscontain()
	{
		cardstatuscontain.click();
		Select ss5 = new Select(cardstatuscontain);
		ss5.selectByIndex(2);
	}
	public void clickstatuscrtcontain()
	{
		cardstatuscontain.click();
		Select ss99 = new Select(cardstatuscontain);
		ss99.selectByIndex(1);
	}
	public void clicksrchdigitalid()
	{
		srchdigitalid.sendKeys("150");
	}
	public void clicksrchnegdigid()
	{
		srchdigitalid.sendKeys("10");
	}
	public void clicksrchdigitalname()
	{
		srchdigitalname.sendKeys("other country");
	}
	public void clicksrchnegdigname()
	{
		srchdigitalname.sendKeys("othercountry");
	}
	public void clicksrchvisitingname()
	{
		srchvisitingname.sendKeys("VCN003");
	}
	public void clicksrchnegvisname()
	{
		srchvisitingname.sendKeys("mnk");
	}
	public void clicksrchorderstatus()
	{
		srchorderstatus.sendKeys("request");
	}
	public void clicksrchnegorderstatus()
	{
		srchorderstatus.sendKeys("acc");
	}
	public void clickeye()
	{
		eye.click();
	}
	public void clickaddposter()
	{
		addposter.click();
	}
	public void setcardname()
	{
		cardname.sendKeys("wrk");
	}
	public void setcardnameneg()
	{
		cardname.sendKeys("/;'[]=-,.");
	}
	public void setimage() throws InterruptedException, AWTException
	{
		
		img.sendKeys("C:\\Users\\91996\\Downloads\\happy life.jpg");
		//		 Thread.sleep(2000);
//		   String file="C:\\Users\\91996\\Downloads\\happy life.jpg";
//		  StringSelection Selection = new StringSelection(file);
//		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);
//		  
//		  Robot rr=new Robot();
//			rr.keyPress(KeyEvent.VK_CONTROL);
//			rr.keyPress(KeyEvent.VK_V);
//			rr.keyRelease(KeyEvent.VK_V);
//			rr.keyRelease(KeyEvent.VK_CONTROL);
//			rr.keyPress(KeyEvent.VK_ENTER);
//			rr.keyRelease(KeyEvent.VK_ENTER);
	}
	public void setpdf() throws InterruptedException, AWTException
	{
		
		img.sendKeys("J:\\Testing\\Manual Testing Questions.pdf");
	}
	public void setstatus()
	{
		status.click();
	}
	public void setstatus1()
	{
		status1.click();
	}
	public void setadd()
	{
		add.click();
	}
	public void setclear()
	{
		clear.click();
	}
	public void setsearch()
	{
		search.sendKeys("wrk");
	}
	public void setsearchneg()
	{
		search.sendKeys("wrkkoj");
	}
	public void setsearchnum()
	{
		search.sendKeys("69");
	}
	public void setsearchnumneg()
	{
		search.sendKeys("6996");
	}
	public void vistusersort()
	{
		usersort.click();
		usersort.click();
	}
	public void vistordersort()
	{
		ordersort.click();
		ordersort.click();
	}
	public void vistcardsort()
	{
		cardsort.click();
		cardsort.click();
	}
	public void visitimg()
	{
		imgsort.click();
		imgsort.click();
	}
	public void clickeditvist()
	{
		editvist.click();
	}
	public void clickcardedit()
	{
		cardedit.clear();
		cardedit.sendKeys("happy");
	}
	public void clickcardeditnum()
	{
		cardedit.clear();
		cardedit.sendKeys("123654");
	}
	public void clickcardeditspc()
	{
		cardedit.clear();
		cardedit.sendKeys("';][=/");
	}
	public void clickcardeditalp()
	{
		cardedit.clear();
		cardedit.sendKeys("bangle1236");
	}
	public void editimgset()
	{
		editimg.sendKeys("C:\\Users\\91996\\Downloads\\happy life.jpg");
	}
	public void editpdfset()
	{
		editimg.sendKeys("J:\\Testing\\Manual Testing Questions.pdf");
	}
	public void viststatus()
	{
		viststatus.click();
	}
	public void vistupd()
	{
		vistupdate.click();
	}
	public void clickdelte()
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
	public void clickrecord()
	{
		record.click();
		Select s=new Select(record);
		s.selectByIndex(4);
	}
	public void clickedit()
	{
		edit.click();
	}
	
	public void clickusername(String username1)
	{
		username.clear();
		username.sendKeys(username1);
		
	}
	
	public void clickphonenum(String phnnumber)
	{
		editphone.clear();
		editphone.sendKeys(phnnumber);
	}
	
	public void clickeditorderstatus(String name)
	{
		editorderstatus.click();
		if(name.equals("editorderstatus1"))
		{
			editorderstatus1.click();
		}
		else if(name.equals("request"))
		{
			request.click();
		}
		else if(name.equals("processing"))
		{
			processing.click();
		}
		else if(name.equals("shipped"))
		{
			shipped.click();
		}
		else if(name.equals("delivered"))
		{
			delivered.click();
		}
		else if(name.equals("cancel"))
		{
			cancel.click();
		}
		
	}
	public void clickpaymentmode(String paymentmode)
	{
		editpay.click();
		
		if(paymentmode.equals("paymentmode"))
		{
			paymode.click();
		}
		else if(paymentmode.equals("Razorpay"))
		{
			razpay.click();
		}
		else if(paymentmode.equals("manual"))
		{
			manual.click();
		}
		else 
		{
			paymode.click();
		}

	}
	
	public void paymentstatus(String paymentstatus1)
	{
		paymentstatus.click();
		
		if(paymentstatus1.equals("paystatus"))
		{
			paystatus.click();
		}
		else if(paymentstatus1.equals("success"))
		{
			success.click();
		}
		else if(paymentstatus1.equals("pending"))
		{
			pending.click();
		}
		else if(paymentstatus1.equals("failure"))
		{
			failure.click();
		}
		else 
		{
			paystatus.click();
		}
		
	}
	public void clickdate(String date1) throws InterruptedException
	{
		editdate.sendKeys(date1);
	
	}
	public void clickeditamount(String amount) throws InterruptedException
	{
		//Thread.sleep(1000);
		editamount.clear();
		editamount.sendKeys(amount);
	}
		
	
	public void clickcardstatus(String status)
	{
		if(status.equals("active")) {
			cardStatusActive.click();
		}else if(status.equals("inactive")) {
			cardStatusInactive.click();
		}else {
			cardStatusInactive.click();
		}
	}
	
	public void clickpartner(String shippingpartner)
	{
		partner.sendKeys(shippingpartner);
	}
	
	public void clicktrackid(String trackid1)
	{
		trackid.sendKeys(trackid1);
	}
	
	public void clicktrackurl(String trackurl1)
	{
		trackurl.sendKeys(trackurl1);
	}
	
	public void clickupdate()
	{
		update.click();
	}
	public void clickdeletemyorder()
	{
		deletemyorder.click();
	}
	public void clickdelcancelmyorder()
	{
		delcancelmyorder.click();
	}
	public void clickdeleteconmyorder()
	{
		deleteconmyorder.click();
	}
	public void cancelres(String reason)
	{
		cancelreason.clear();
		cancelreason.sendKeys(reason);
	}
	public void clickrecmyorder(String page)
	{
		recordmyorder.click();
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
		else if(page.equals("All"))
		{
			all.click(); 
		}
		
	}

}
