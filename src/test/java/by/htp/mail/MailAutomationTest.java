package by.htp.mail;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import by.htp.mail.steps.Steps;

public class MailAutomationTest {
	
	private Steps steps;
	private final String USERNAME = "tathtp";
	private final String PASSWORD = "Klopik123!";
	
	@BeforeMethod(description = "Init browser")
	public void setUp()
	{
		steps = new Steps();
		steps.initBrowser();
	}
	
	@Test(description = "Login to Mail")
	public void oneCanLoginMail()
	{
		steps.loginMail(USERNAME, PASSWORD);
	//	Assert.assertTrue(steps.isLoggedIn(USERNAME));
	}
	
	@AfterMethod(description = "Stop Browser")
	public void stopBrowser()
	{
		steps.closeDriver();
	}


}
