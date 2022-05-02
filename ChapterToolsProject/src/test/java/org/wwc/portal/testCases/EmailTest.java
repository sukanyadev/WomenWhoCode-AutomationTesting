package org.wwc.portal.testCases;

import javax.mail.Message;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.wwc.portal.utilities.EmailUtils;

public class EmailTest {

	private static EmailUtils emailUtils;
	WebDriver driver;
	 
	  @BeforeClass
	  public static void connectToEmail() {
	    try {
	      emailUtils = new EmailUtils("YOUR_USERNAME@gmail.com", "YOUR_PASSWORD", "smtp.gmail.com", EmailUtils.EmailFolder.INBOX);
	    } catch (Exception e) {
	      e.printStackTrace();
	      Assert.fail(e.getMessage());
	    }
	  }
	  
	  @Test
	  public void testTextContained() {
	    try{
	    Message email = emailUtils.getMessagesBySubject("Loan Approval", true, 5)[0];
	   // Assert.assertTrue("Approval message is not in email", emailUtils.isTextInMessage(email, "You have been approved"));
	    } catch (Exception e) {
	      e.printStackTrace();
	      Assert.fail(e.getMessage());
	    }
	  }
	  
	  @Test
	  public void testLink() {
	    
	    //TODO: apply for a loan using criteria that will result in the application being rejected
	    
	    try{
	      Message email = emailUtils.getMessagesBySubject("Decision on Your Loan Application", true, 5)[0];
	      String link = emailUtils.getUrlsFromMessage(email, "Click here to view the reason").get(0);
	      
	      driver.get(link);
	      
	      //TODO: continue testing
	    } catch (Exception e) {
	      e.printStackTrace();
	      Assert.fail(e.getMessage());
	    }
	  }
}
