/**
 * 
 */
package com.wordpress.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author aruph
 *
 *This class has all the page-specific elements and methods. 
 *@FindBy annotation will be used
 */
public class LoginNew {
	
	@FindBy (xpath="//*[text()='Log In']")
	@CacheLookup
	WebElement homepage_loginButton;
	
	@FindBy (how=How.NAME, using="email")
	@CacheLookup
	WebElement email;
	
	@FindBy (how=How.NAME, using="password")
	@CacheLookup
	WebElement password;
	
	@FindBy (how=How.XPATH, using="//div[text()='Login']")
	@CacheLookup
	WebElement loginButton;
	
	@FindBy (how=How.XPATH, using="//div[contains(@class, 'button floating item dropdown')]")
	@CacheLookup
	WebElement gearIcon;
	
	@FindBy (how=How.XPATH, using="//span[text()='Log Out']")
	@CacheLookup
	WebElement logoutOption;
	
	/*WebDriver driver;
	
	public LoginNew (WebDriver driver)
	{
		this.driver=driver;
	}*/
	
	public void loginLogout(String userID, String pwd) throws InterruptedException
	{
		homepage_loginButton.click();
		email.sendKeys(userID);
		password.sendKeys(pwd);
		loginButton.click();
		gearIcon.click();
		Thread.sleep(1500L);
		logoutOption.click();		
	}
}
