package org.wwc.portal.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CommonDriver {
	
	private WebDriver driver;
	private String currentWorkingDirectory; 
	ConfigUtils config;

	//save the drivers in project folder and provide the relative path in the script instead of absolute path

	@SuppressWarnings("deprecation")
	public CommonDriver(String browserType)throws Exception {
		currentWorkingDirectory = System.getProperty("user.dir");		
		if(browserType.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",currentWorkingDirectory + "/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserType.equalsIgnoreCase("edge")) {
			
			System.setProperty("webdriver.edge.driver",currentWorkingDirectory + "/drivers/msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else {
			throw new Exception("Invalid Browser Type" + browserType);
		}
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get(config.getApplicationURL());
		
	}

// 3 variable declared are Private , so we need to define the setters/getters so that anyone from outside can set the values
	
	public String getTitleOfThePage() {
		return driver.getTitle();
	}
	public void closeAllBrowser() {
		driver.quit();
	}
}
