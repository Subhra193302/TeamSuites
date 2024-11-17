package uitesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	 public WebDriver driver;

	    @BeforeTest
	    public void setUp() {
	        FirefoxOptions options = new FirefoxOptions();
	        options.setBinary("/usr/bin/firefox"); // Adjust the path to your Firefox binary if necessary
	        driver = new FirefoxDriver(options);
	        driver.manage().window().maximize(); // Maximize the window for better visibility
	        driver.get("https://qa.teamsuite.wingmp.com/login");
	        
	        LoginPage loginPage = new LoginPage(driver);
			loginPage.enterUsername("masteradmin@wingmanpartners.com");
	        loginPage.enterPassword("Tsuite@123");
	        loginPage.clickLoginButton();
	    }

	    @AfterTest
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit(); 
	        }
	    }
	}
