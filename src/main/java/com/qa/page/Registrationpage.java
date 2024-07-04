package com.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.baseclass;

public class Registrationpage {
	
	
	public Registrationpage()
	{
		PageFactory.initElements(baseclass.getdriver(),this);
	}
	
	@FindBy(name="firstName") WebElement firstname;
	@FindBy(name="lastName") WebElement lastname;
	@FindBy(name="phone") WebElement phone;
	@FindBy(name="userName") WebElement emailid;
	@FindBy(name="adress1") WebElement address;
	@FindBy(name="city") WebElement city;
	@FindBy(name="state") WebElement state;
	@FindBy(name="postalcode") WebElement postalcode;
	@FindBy(name="country") WebElement country;
	@FindBy(name="email") WebElement username;
	@FindBy(name="password") WebElement password;
	@FindBy(name="confirmPassword") WebElement confirmpassword;
	@FindBy(name="submit") WebElement submit;
	
	
	
	//Registrationpage operations
	
	public void  registrationentry(String fn,String ln,String phone2,String eid,String adr,String cit,String st,String pcode,String ctr,String uname,String pwd,String cpwd) throws InterruptedException
	{
		firstname.sendKeys(fn);
		lastname.sendKeys(ln);
	    phone.sendKeys(phone2);
		emailid.sendKeys(eid);
		address.sendKeys(adr);
		city.sendKeys(cit);
		state.sendKeys(st);
		postalcode.sendKeys(pcode);
		country.sendKeys(ctr);
		username.sendKeys(uname);
		password.sendKeys(pwd);
		confirmpassword.sendKeys(cpwd);
		submit.click();
		Thread.sleep(3000);
		
	}
	//Registration page validations
	
	 
}
