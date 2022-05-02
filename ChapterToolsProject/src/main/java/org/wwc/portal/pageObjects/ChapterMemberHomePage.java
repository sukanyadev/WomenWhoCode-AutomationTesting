package org.wwc.portal.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChapterMemberHomePage {

	WebDriver driver;
	
	@FindBy(xpath="//div[@id='navbarDropdown']//span")
	WebElement initialIcon;
	
	@FindBy(linkText="Chapter Members")
	WebElement chapterMemberLink;
	
	@FindBy(linkText="Your Profile")
	WebElement yourProfileLink;
	
	@FindBy(linkText="Logout")
	WebElement logoutLink;
	
	public ChapterMemberHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean initialIconStatus() {
		return initialIcon.isDisplayed();
	}
	
	public void clickChapterMemberLink () {
		chapterMemberLink.click();
	}
	
	public void clickYourProfile() {
		yourProfileLink.click();
	}
	
	public void clickLogout() {
		logoutLink.click();
	}
}
