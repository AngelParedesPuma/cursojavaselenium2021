package com.opensource.admin;

import org.openqa.selenium.WebDriver;

import com.opensource.base.Base;

public class Login extends Base {



	public Login(WebDriver driver) {
	super(driver);
	}
	public void loginuat(String username, String pwd, boolean isLogged) {	
	}
	
	public void loginuat(String username, String pwd) {
		loginuat(username, pwd, true);
	}
		
		
	
}