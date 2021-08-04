/**
 * 
 */
package com.wordpress.Pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import helper_utility.BrowserFactory;
import helper_utility.ConfigDataProvider;
import helper_utility.ExcelDataProvider;

/**
 * @author aruph
 * 
 * Contains the pre and post-conditions for our test cases
 *
 */
public class BaseClass {
	
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	
	@BeforeSuite
	public void setupSuite() throws Exception
	{
		excel = new ExcelDataProvider();
		config = new ConfigDataProvider();
	}
	
	@BeforeClass
	public void setup() throws Exception
	{
		driver = BrowserFactory.startApplication(driver, config.getBrowser(), config.url());
		System.out.println(driver.getTitle());
	}
	
	@AfterClass
	public void tearDown()
	{
		BrowserFactory.stopApplication(driver);
	}

}
