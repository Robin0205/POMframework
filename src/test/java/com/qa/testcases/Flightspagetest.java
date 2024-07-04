package com.qa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.baseclass;
import com.qa.page.Flightspage;
import com.qa.page.homepage;
import com.qa.utility.propertyreader;

public class Flightspagetest {
	
	baseclass bc=new baseclass();
	homepage hp=new homepage();
	Flightspage fp=new Flightspage();
	
	@BeforeTest
	public void setup() throws InterruptedException
	{
		baseclass.setupbrowser();
		Thread.sleep(5000);
		baseclass.getdriver().get(propertyreader.getpropertydata("url"));
		
	}
	@Test
	public void flightoperation()
	{
		fp.flightsdetailsentry();
	}
	@Test
	public void findermsg()
	{
		System.out.println(fp.verifypagetitle());
		
	}
	
	@AfterTest
		public void close()
		{
			baseclass.teardown();
			
		}
	

}
