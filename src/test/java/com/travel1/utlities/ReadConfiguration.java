package com.travel1.utlities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfiguration 
{
	String path="C:\\Users\\user\\Desktop\\new8pm\\DataDrivenFramwork9\\travel1\\Configuration\\config.properties";
	Properties pro;
	public ReadConfiguration()
	{
		FileInputStream fn=null;
		try {
			 fn=new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pro=new Properties();
		try {
			pro.load(fn);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getUrl()
	{
		String ur=pro.getProperty("url");
		if(ur!=null)
		{
			return ur;
		}
		else
		{
			throw new RuntimeException("Url not found");
		}
	}
	public String getBrowser()
	{
		String br=pro.getProperty("browser");
		if(br!=null)
		{
			return br;
		}
		else
		{
			throw new RuntimeException("Browser not found");
		}
	}

}
