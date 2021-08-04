/**
 * 
 */
package com.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author aruph
 *
 *This class has all the login page related elements and methods
 */
public class LoginOld {
	
	WebDriver driver;
	
	By homepage_loginButton = By.xpath("//a[@href='https://ui.cogmento.com']");
	By username = By.name("email");
	By password = By.name("password");
	By loginButton = By.xpath("//div[text()='Login']");
	By logoutButton = By.xpath("//div[contains(@class, 'button floating item dropdown')]");
	By logoutOption = By.xpath("//span[text()='Log Out']");
	
	public LoginOld (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void loginToWordpress (String userID, String pwd)
	{
		driver.findElement(homepage_loginButton).click();
		driver.findElement(username).sendKeys(userID);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginButton).click();		
	}
	
	public void logoutOfWordpress () throws InterruptedException
	{
		driver.findElement(logoutButton).click();
		Thread.sleep(1500L);
		driver.findElement(logoutOption).click();
	}
	

}
