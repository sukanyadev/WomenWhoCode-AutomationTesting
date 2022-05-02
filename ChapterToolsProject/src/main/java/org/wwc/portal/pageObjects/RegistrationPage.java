package org.wwc.portal.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

	WebDriver driver;
	
	@FindBy()
	WebElement wwcLogo;
	
	@FindBy()
	WebElement regFormText;
	
	@FindBy()
	WebElement mandatoryFieldsText;
	
	@FindBy()
	WebElement firstName;
	
	@FindBy()
	WebElement lastName;
	
	@FindBy()
	WebElement newUserEmail;
	
	@FindBy()
	WebElement newUserPassword;
	
	@FindBy()
	WebElement submitBtn;
	
	@FindBy()
	WebElement pwdRule1;
	
	@FindBy()
	WebElement pwdRule2;
	
	@FindBy()
	WebElement pwdRule3;
	
	@FindBy()
	WebElement pwdRule4;
	
	@FindBy()
	WebElement pwdRule5;
	
	public RegistrationPage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean wwcLogoStatus() {
		return wwcLogo.isDisplayed();
	}
	
	public boolean regFormTextStatus() {
		return regFormText.isDisplayed();
	}
	
	public void setFirstName (String fName) {
		firstName.clear();
		firstName.sendKeys(fName);
	}
	
	public void setLastName (String lName) {
		lastName.clear();
		lastName.sendKeys(lName);	
	}
	
	public void setNewUserEmail (String email) {
		newUserEmail.clear();
		newUserEmail.sendKeys(email);
	}
	
	public void setNewUserPassword (String pwd) {
		newUserPassword.clear();
		newUserPassword.sendKeys(pwd);	
	}
	
	public void clickSubmitBtn() {
		submitBtn.click();
	}
	
	public boolean pwdRule1Status() {
		return pwdRule1.isDisplayed();
	}
	
	public boolean pwdRule2Status() {
		return pwdRule2.isDisplayed();
	}
	
	public boolean pwdRule3Status() {
		return pwdRule3.isDisplayed();
	}
	
	public boolean pwdRule4Status() {
		return pwdRule4.isDisplayed();
	}
	
	public boolean pwdRule5Status() {
		return pwdRule5.isDisplayed();
	}
	
}
