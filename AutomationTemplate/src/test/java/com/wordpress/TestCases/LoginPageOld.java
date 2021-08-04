/**
 * 
 */
package com.wordpress.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordpress.Pages.LoginOld;

/**
 * @author aruph
 *
 *This class contains test case for login functionality
 */
public class LoginPageOld {
	
	
	@Test
	public void verifyLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://freecrm.com/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		LoginOld login = new LoginOld(driver);
		login.loginToWordpress("arup.halder1991@gmail.com", "Mh04gm9878!");
		login.logoutOfWordpress();
	}
}
