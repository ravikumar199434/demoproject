package com.travel1.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage 
{
public WebDriver ldriver;
	
	public LogoutPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	@FindBy(xpath ="//a[text()='Log out']") WebElement logout;
	
	public void logOut()
	{
		logout.click();
	}

}
