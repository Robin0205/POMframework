package com.qa.testcases;

import java.io.IOException;

import org.apache.hc.core5.util.Asserts;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.baseclass;
import com.qa.page.homepage;
import com.qa.utility.propertyreader;

public class homepagetest {

	baseclass bc = new baseclass();
	homepage hp = new homepage();

	@BeforeTest
	public void setup() {
		baseclass.setupbrowser();
		baseclass.getdriver().get(propertyreader.getpropertydata("url"));

	}

	@Test
	public void homepagetitletest() {
		homepage hp = new homepage();
		String actualtitle = hp.verifyhomepagetitle();
		String expectedurl = "Welcome: Mercury Tours";
		Assert.assertEquals(actualtitle, expectedurl, "homepagevalidationfailure");

	}

	@Test
	public void homepageurltest() {
		homepage hp = new homepage();
		String actualurl = hp.verifyhomepageurl();
		String expectedurl ="https://demo.guru99.com/test/newtours/" ;
		Assert.assertEquals(actualurl, expectedurl, "homepagevalidationfailure");

	}

	@AfterTest
	public void close() {

		baseclass.getdriver().close();

	}

}
