package by.htp.mail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import by.htp.mail.pages.AbstractPage;

public class LoginPage extends AbstractPage {
	
	private final String BASE_URL = "http://www.mail.ru";
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		//PageFactory.initElements(this.driver, this);
	}
	
	@Override
	public void openPage()
	{
		driver.get(BASE_URL);
		
	}
	
	@FindBy(xpath = ".//input[@id='mailbox:login']")
	private WebElement login;

	@FindBy(xpath = ".//input[@id='mailbox:pass']")
	private WebElement pass;

	@FindBy(xpath = ".//input[@id='mailbox:submit']")
	private WebElement submit;
	
	public void login(String username, String password)
	{
		login.sendKeys(username);
		pass.sendKeys(password);
		submit.click();
	}
	
	
}
