/**
 * 
 */
package helper_utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

/**
 * @author aruph
 *
 *This class implements the code snippet for launching browsers
 */
public class BrowserFactory {

	public static WebDriver startApplication(WebDriver driver, String browserName, String url) throws Exception
	{
		if (browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else 
			throw new Exception ("We do not support this browser");
		
		Reporter.log("===Browser session opened===", true);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Reporter.log("===Application started===", true);
		
		return driver;
	}
	
	public static void stopApplication(WebDriver driver)
	{
		driver.quit();
		Reporter.log("====Browser Session Closed===", true);
	}


}
