package com.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.baseclass;

public class Flightspage {
	
	Select sp=new Select(null);

	public Flightspage()
	{
		PageFactory.initElements(baseclass.getdriver(),this);
		
	}
	@FindBy(name="passCount") WebElement passenger;
	@FindBy(name="fromPort")WebElement DepartingFrom;
	@FindBy(name="fromMonth")WebElement DepartingMonth;
	@FindBy(name="fromDay")WebElement DepartingDate;
	@FindBy(name="toPort")WebElement ArrivingIn;
	@FindBy(name="toMonth")WebElement ReturningMonth;
	@FindBy(name="toDay")WebElement ReturningDate;
	@FindBy(css="input[value=First]") WebElement Service; 
	@FindBy(name="airline")WebElement Airlines;
	@FindBy(css="input[name=findFlights]")WebElement submit;
    @FindBy(xpath="//*[contains(text(),'Please press your')]")WebElement Flightfindmsg;
	
	
	public void flightsdetailsentry() {
	     sp=new Select(passenger);
		sp.selectByValue("1");
		sp=new Select(DepartingFrom);
		sp.selectByVisibleText("Acapulco");
		sp=new Select(DepartingMonth);
		sp.selectByVisibleText("January");
		sp=new Select(DepartingDate);
		sp.selectByValue("1");
		sp=new Select(ArrivingIn);
		sp.selectByVisibleText("Acapulco");
		sp=new Select(ReturningMonth);
		sp.selectByVisibleText("January");
		sp=new Select(ReturningDate);
		sp.selectByValue("3");
		Service.click();
		sp=new Select(Airlines);
		sp.selectByVisibleText("Blue Skies Airlines");
		
		
	}
	
	public String verifypagetitle ()
	
	{
	return baseclass.getdriver().getTitle();
		
	}
}
