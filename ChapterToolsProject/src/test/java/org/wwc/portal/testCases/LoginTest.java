package org.wwc.portal.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.wwc.portal.pageObjects.ChapterMemberHomePage;
import org.wwc.portal.pageObjects.LoginPage;

public class LoginTest extends BaseTest {
	WebDriver driver;
	
	@Test(priority=1)
	public void verifyLoginWithValidCredentials() {
		LoginPage lp = new LoginPage(driver);
		lp.setUserEmail("wwcode.sv.noreply@gmail.com");
		lp.setUserPassword("Password123");
		lp.clickSubmit();
		
		ChapterMemberHomePage cmh = new ChapterMemberHomePage(driver);
		cmh.clickLogout();
	}
	
	@Test(priority=2)
	public void verifyLoginWithInvalidCredentials() {
		LoginPage lp = new LoginPage(driver);
		lp.setUserEmail("wwcode.sv.noreply@gmail.com");
		lp.setUserPassword("Password");
		lp.clickSubmit();
	}

}
