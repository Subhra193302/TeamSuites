package uitesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;

    // Locators stored as private fields
    private By usernameLocator = By.id("email");
    private By passwordLocator = By.id("password");
    private By loginButtonLocator = By.xpath("//button[normalize-space()='Login']");
    private By CLICKTOATTENDANCE =By.cssSelector("a[href='/attendance']");
    private By CLICKTOiNVENTORY =By.xpath("  //span[normalize-space()='Inventory']"
    		
    		);
    private By ClickOnMarkAttendance =By.xpath("a[href='/attendance']");

    

//    // Constructor initializes driver and wait
//    public LoginPage(WebDriver driver) {
//        this.driver = driver;
//        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // 20 seconds default wait
//    }
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        // Ensure driver is not null before initializing WebDriverWait
        if (driver == null) {
            throw new IllegalArgumentException("WebDriver cannot be null");
        }
        wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // 20 seconds default wait
    }


    // Method to enter username
    public void enterUsername(String username) {
        WebElement usernameField = waitUntilVisible(usernameLocator);
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    // Method to enter password
    public void enterPassword(String password) {
        WebElement passwordField = waitUntilVisible(passwordLocator);
        passwordField.clear();
        passwordField.sendKeys(password);
    }
    
    public void clickAttendanceButton() {
        WebElement loginButton = waitUntilVisible(CLICKTOATTENDANCE);
        loginButton.click();
    }
    // Method to click the login button
    public void clickLoginButton() {
        WebElement loginButton = waitUntilVisible(loginButtonLocator);
        loginButton.click();
    }
    
    public void CLICKTOiNVENTORY() {
        WebElement loginButton = waitUntilVisible(CLICKTOiNVENTORY);
        loginButton.click();
    }
    public void clickonleaveattendance() {
    	WebElement login =waitUntilVisible(ClickOnMarkAttendance);
    	login.click();
    }
    // General wait method to simplify element retrieval
    private WebElement waitUntilVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
