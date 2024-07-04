package com.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		JavascriptExecutor jsex = (JavascriptExecutor) driver;
		WebElement ele = (WebElement) jsex.executeScript("return document.getElementById('email')");
        ele.sendKeys("ramesh");
        Thread.sleep(5000);
        driver.close();

	}

}
