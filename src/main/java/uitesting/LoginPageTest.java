package uitesting;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

public class LoginPageTest extends BaseClass {

  
   

//	@Test
//    public void AttendanceCLICK() {
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.clickAttendanceButton();
//        loginPage.clickonleaveattendance();
//        }

    @Test
    public void INVENTORY() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.CLICKTOiNVENTORY();
        }
    
} 

	

