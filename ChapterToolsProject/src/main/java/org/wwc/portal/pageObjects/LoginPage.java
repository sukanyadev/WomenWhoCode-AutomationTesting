package org.wwc.portal.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(id="email")
	WebElement userEmail;
	
	@FindBy(id="password")
	WebElement userPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginSubmit;

	
	public LoginPage (WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	
	public void setUserEmail (String email) {
		userEmail.clear();
		userEmail.sendKeys(email);
	}
	
	public void setUserPassword (String password) {
		userPassword.clear();
		userPassword.sendKeys(password);
	}
	
	public void clickSubmit () {
		loginSubmit.click();
	}
	
}
