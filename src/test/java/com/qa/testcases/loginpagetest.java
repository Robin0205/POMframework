package com.qa.testcases;

import org.testng.annotations.*;
import org.testng.annotations.Test;

import com.qa.base.baseclass;
import com.qa.page.Loginpage;
import com.qa.page.homepage;
import com.qa.utility.propertyreader;

public class loginpagetest {
	baseclass bc = new baseclass();
	homepage hp;
	Loginpage lp;

	@BeforeTest
	public void setup() {
		baseclass.setupbrowser();
		// launch application from properties files
		baseclass.getdriver().get(propertyreader.getpropertydata("url"));
	}

	@Test
	public void logintest() throws InterruptedException

	{
		hp = new homepage();
		lp = new Loginpage();
		hp.loginoperation();
		Thread.sleep(10000);
		lp.loginentry(propertyreader.getpropertydata("uname"),propertyreader.getpropertydata("pwd"));
		Thread.sleep(3000);
		System.out.println(lp.validateloginbymsg());

	}

	@AfterTest
	public void closebrowser() {
		baseclass.teardown();
	}
}
