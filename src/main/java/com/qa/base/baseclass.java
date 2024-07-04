package com.qa.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.utility.pageutils;
import com.qa.utility.propertyreader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	
	public static WebDriver driver;
	 
	public static void setupbrowser() 
	{
		String browsername=propertyreader.getpropertydata("browser");    //browsername=chrome
		switch(browsername.toLowerCase())
		{
		case "chrome" :
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox" :
			WebDriverManager.firefoxdriver().setup();
			driver=new ChromeDriver();
			break;
		case "edge" :
			WebDriverManager.edgedriver().setup();
			driver=new ChromeDriver();
			break;
			
			default :
				System.out.println("enter the valid browser from given list: chrome,firefox,edge");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts();
		driver.manage().timeouts();
	}
	public static WebDriver getdriver()
	{
		return driver;
	}
	public static void teardown()
	{
		driver.quit();
	}

}
