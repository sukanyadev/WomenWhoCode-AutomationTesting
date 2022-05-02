package org.wwc.portal.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigUtils {
	
	Properties prop;

	public ConfigUtils()
	{
		File src = new File("./config/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getApplicationURL()
	{
		String url=prop.getProperty("baseURL");
		return url;
	}
	
	public String getBrowserType()
	{
		String browser=prop.getProperty("browserType");
		return browser;
	}
		
	public String getChromePath()
	{
	String chromepath=prop.getProperty("chromepath");
	return chromepath;
	}
	
	public String getIEPath()
	{
	String iepath=prop.getProperty("iepath");
	return iepath;
	}
	
	public String getFirefoxPath()
	{
	String firefoxpath=prop.getProperty("firefoxpath");
	return firefoxpath;
	}
}
