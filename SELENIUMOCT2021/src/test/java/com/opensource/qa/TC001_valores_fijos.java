package com.opensource.qa;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opensource.admin.Login;
import com.opensource.admin.UserManagement;
import com.opensource.base.Base;
import com.opensource.base.GlobalVariables;

public class TC001_valores_fijos {

	WebDriver driver;
	Base base;
	UserManagement um;
	Login login;
	
	String username, pwd;

	@BeforeTest
	public void beforeTest() {
		base = new Base(driver);
		driver = base.chromeDriverConnection();
		login = new Login(driver);
		um = new UserManagement(driver);
		
		this.username = "Admin";
	    this.pwd = "admin123";
		
		 //busca del archivo Credendtial los valores de la variable
		
	//	this.username = base.getJSONData("Credentials", "username");
	//	this.pwd = base.getJSONData("Credentials", "password");
		
		/*
		//uso de excel  para tomar los valores de user y pwd
		this.username = base.getCellData("Credentials", 1, 0);
		this.pwd = base.getCellData("Credentials", 1, 1);
		*/

		
	}

	@Test
	public void tc001() {
		
		// Step 1
		base.launchBrowser(GlobalVariables.QA_URL);
		
		// Step 2, 3, 4
		login.loginOrange(username, pwd);
		
		// Step 5, 6, 7
		um.searchUsername(username);
		
		// Step 8
		um.validateUsernameTable(username);

	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
