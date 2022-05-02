package org.wwc.portal.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewMemberPage {

	WebDriver driver;
	
	@FindBy()
	WebElement chapterLink;
	
	@FindBy()
	WebElement backLink;
	
	@FindBy()
	WebElement pageText;
	
	@FindBy()
	WebElement mandatoryText;
	
	@FindBy()
	WebElement userEmail;
	
	@FindBy()
	WebElement volunteerRole;
	
	@FindBy()
	WebElement volunteerRoleDesc;
	
	@FindBy()
	WebElement leaderRole;
	
	@FindBy()
	WebElement leaderRoleDesc;
	
	@FindBy()
	WebElement directorRole;
	
	@FindBy()
	WebElement directorRoleDesc;
	
	@FindBy()
	WebElement message;
	
	@FindBy()
	WebElement reviewBtn;
	
	
	public AddNewMemberPage (WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickChapterLink () {
		chapterLink.click();
	}
	
	public void clickChapterMemberLink () {
		backLink.click();
	}
	
	public boolean pageTextStatus () {
		return pageText.isDisplayed();
	}
	
	public boolean mandatoryTexttStatus() {
		return mandatoryText.isDisplayed();
	}
	
	public void setUserEmail (String email) {
		userEmail.clear();
		userEmail.sendKeys(email);
	}
	
	public void clickVolunteerRole () {
		volunteerRole.click();
	}
	
	public boolean volunteerRoleDescStatus() {
		return volunteerRoleDesc.isDisplayed();
	}
	
	public void clickLeaderRole () {
		leaderRole.click();
	}
	
	public boolean leaderRoleDescStatus() {
		return leaderRoleDesc.isDisplayed();
	}
	
	public void clickDirectorRole () {
		directorRole.click();
	}
	
	public boolean directorRoleDescStatus() {
		return directorRoleDesc.isDisplayed();
	}
	
	public void setMessage (String msg) {
		message.clear();
		message.sendKeys(msg);
	}
	
	public void clickReviewButton () {
		reviewBtn.click();
	}
	
}
