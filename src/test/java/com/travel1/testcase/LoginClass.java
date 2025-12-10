package com.travel1.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.travel1.pageobject.LoginPage;
import com.travel1.pageobject.LogoutPage;



public class LoginClass extends BaseClass
{
	@Test
	void login()
	{
		driver.get(url);
		LoginPage l=new LoginPage(driver);
		l.getUsername("student");
		l.getPassword("Password123");
		l.clickSubmit();
		String exptitle="Logged In Successfully | Practice Test Automation";
		String actitle=driver.getTitle();
		//Assertion hello
		Assert.assertEquals(exptitle, actitle);
		
	}
	@Test
	void logout()
	{
		LogoutPage lo=new LogoutPage(driver);
		lo.logOut();
	}
}
