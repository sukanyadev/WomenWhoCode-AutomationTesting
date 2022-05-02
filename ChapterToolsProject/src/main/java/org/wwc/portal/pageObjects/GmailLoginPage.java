package org.wwc.portal.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLoginPage {

	protected WebDriver ldriver;
	
	@FindBy(id="identifierId")
	WebElement gEmail;
	
	@FindBy(id ="identifierNext")
	WebElement nextBtn;
	
	@FindBy(id="")
	WebElement gPassword;
	
	@FindBy(id="")
	WebElement submitBtn;
	
	public GmailLoginPage(WebDriver rdriver) {
		 ldriver = rdriver;
		 PageFactory.initElements(rdriver, this);
	 }
	
	public void launchGmail() {
		   
	 ldriver.get("https://accounts.google.com/signin");
		     
	}
	 public void setGEmail(String email) {
		 gEmail.sendKeys(email);
	 }
	 
	 public void setGPassword(String password) {
		 gPassword.sendKeys(password);
	 }
	 
	 public void clickSubmit() {
		 submitBtn.click();
	 }  

}
