package com.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.baseclass;

public class Loginpage {
	
	WebDriver driver;
	

	public Loginpage()
	{
		
		PageFactory.initElements(baseclass.getdriver(), this);

	}
	
	@FindBy (xpath="//input[@name='userName']" ) WebElement username;
	@FindBy (xpath="//input[@name='password']") WebElement password;
	@FindBy (xpath="//input[@name='submit']") WebElement submit;
	@FindBy(xpath="//*[contains(text(),'Thank you for Loggin. ')]") WebElement loginmessage;
	
	
	
public void loginentry(String uname,String pwd) {
	
	username.sendKeys(uname);
	password.sendKeys(pwd);
	submit.click();
	
}

public String  validateloginbymsg()
{
	
	 return loginmessage.getText();
	 
}
}
