package com.Alta;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opensource.admin.Login;
import com.opensource.admin.UserManagement;
import com.opensource.base.Base;
import com.opensource.base.VariablesGlobales;

public class AltaGiru {
	WebDriver driver;
	Base base;
	UserManagement um;
	Login login;
	String username, pwd, newuser;

	@BeforeTest
	public void beforeTest() {
		base = new Base(driver);
		driver = base.chromeDriverConnection();
		login = new Login(driver);	
	}

	@Test
	public void tc001() throws InterruptedException {
		
		// Step 1
		base.launchBrowser(VariablesGlobales.SDA_URL);
		  Thread.sleep(5000);
			// Step 2, 3, 4
		login.loginuat(username, pwd);
	}

	@AfterTest
	public void afterTest() {
//		driver.close();
	}

}

