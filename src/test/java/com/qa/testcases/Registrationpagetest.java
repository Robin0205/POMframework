package com.qa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.baseclass;
import com.qa.page.Registrationpage;
import com.qa.page.homepage;
import com.qa.utility.ExcelReader;
import com.qa.utility.propertyreader;

public class Registrationpagetest {
	baseclass bc=new baseclass();
	homepage hp;
	Registrationpage rp;
	String sheetname="Registration";
	
	@BeforeTest
	public void setup()
	{
		baseclass.setupbrowser();
		//launch application from properties files
		baseclass.getdriver().get(propertyreader.getpropertydata("url"));
	}
	@DataProvider
	public Object[][] getdata()
	{
		Object data[][]= ExcelReader.getTestData(sheetname);
		return data;
		
	}
	@Test(dataProvider="getdata")
	public void registrationtest(String firstname,String lastname,String phone,String email,String adress,String city,String state,String pcode,String country,String uname,String pwd,String cpwd) throws InterruptedException 
	{
		hp=new homepage();
        hp.registeroperation();
		rp=new Registrationpage();
		rp.registrationentry(firstname,lastname, phone, email, adress, city, state, pcode, country,uname,pwd,cpwd);
		
	}
	@Test
	public   void validatereg()
	{
		baseclass.getdriver().getTitle();
		
	
	}
	@AfterTest
	public void close()
	{
		baseclass.teardown();
		
	}
	

}
