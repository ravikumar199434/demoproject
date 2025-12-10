package com.travel1.testcase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import com.travel1.utlities.ReadConfiguration;

public class BaseClass 
{
	public static WebDriver driver;
	ReadConfiguration r=new ReadConfiguration();
	String browser=r.getBrowser();//chrome
	String url=r.getUrl();//https://practicetestautomation.com/practice-test-login/
	
	@BeforeTest
	public void setup()
	{
		switch(browser.toLowerCase())
		{
			case "chrome":
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				break;
			case "msedge":
				driver=new EdgeDriver();
				driver.manage().window().maximize();
				break;
			case "firefox":
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				break;
		}
	}
	public  void  ScreenShot() throws IOException
	{
			
		File Source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Destination=new File("C:\\Users\\user\\Desktop\\new8pm\\DataDrivenFramwork9\\travel1\\ScreenShot\\t.png");
		FileUtils.copyFile(Source, Destination);
		
	}

}
