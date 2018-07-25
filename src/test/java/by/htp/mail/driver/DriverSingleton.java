package by.htp.mail.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSingleton {

    private static WebDriver driver;
    private static final String CHROME = "webdriver.chrome.driver";
	private static final String CHROME_PATH = "C:\\WebDrivers\\chromedriver_win32\\chromedriver.exe";
	

    private DriverSingleton(){};
    
    public static WebDriver getDriver(){
        if (driver == null){
        	System.setProperty(CHROME, CHROME_PATH);
        	WebDriver driver = new ChromeDriver();
        	System.out.println("Driver started!");
        }
        
        return driver;

    }
    
    public static void closeDriver(){
        driver.quit();
        driver = null;
    }
    
}
