/**
 * 
 */
package com.wordpress.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.Pages.BaseClass;
import com.wordpress.Pages.LoginNew;

/**
 * @author aruph
 *
 *This class uses the concept of page factory
 */
public class LoginPageNew extends BaseClass{
	
	@Test (description="This TC performs a valid login")
	public void verifyLoginLogout() throws InterruptedException
	{		
		LoginNew login = PageFactory.initElements(driver, LoginNew.class);
		
		login.loginLogout("arup.halder1991@gmail.com", "Mh04gm9878!");		
	}

}
