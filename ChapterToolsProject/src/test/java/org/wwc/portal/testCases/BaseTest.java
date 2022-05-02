package org.wwc.portal.testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.wwc.portal.utilities.*;

public class BaseTest {
	
	CommonDriver comDriver ; // initialize this class as it has all driver related logic written
	ConfigUtils configUtils;
	
	//Assign the properties in the config file to a variable
	@BeforeClass
	public void setUp () throws Exception {
		
		String browserType = configUtils.getBrowserType();
		
		comDriver = new CommonDriver(browserType);
		
	}
	
	//Close the browser after executing the class
	@AfterClass
	public void tearDown () {
		
		comDriver.closeAllBrowser();
	}

}
