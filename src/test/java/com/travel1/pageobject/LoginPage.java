package com.travel1.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	@FindBy(id="username") WebElement username;
	@FindBy(id="password") WebElement password;
	@FindBy(id="submit") WebElement submit;
	
	public void getUsername(String user)
	{
		username.sendKeys(user);
	}
	public void getPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void clickSubmit()
	{
		submit.click();
	}
}
