package com.opensource.qa;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opensource.admin.Configuration;
import com.opensource.admin.Login;
import com.opensource.base.Base;
import com.opensource.base.GlobalVariables;

public class Tc005 {

	WebDriver driver;
	Base base;
	Configuration con;
	Login login;
	
	String username, pwd, newuser;

	@BeforeTest
	public void beforeTest() {
		base = new Base(driver);
		driver = base.chromeDriverConnection();
		login = new Login(driver);
		con = new Configuration(driver);
		
		this.newuser = "user";
	//	this.username = "Admin";
	//	this.pwd = "admin123";

		this.username = base.getJSONData("Credentials", "username");
		this.pwd = base.getJSONData("Credentials", "password");
		
	}

	@Test
	public void tc005() throws InterruptedException {
		
		// Step 1
		base.launchBrowser(GlobalVariables.QA_URL);
		
		// Step 2, 3, 4
		login.loginOrange(username, pwd);
		
		// Step 5, 6, 7
		con.addUser(newuser);
		
		// Step 8
		con.validateUserAdd(newuser);

	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
