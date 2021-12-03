 package com.opensource.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opensource.base.Base;

public class UserManagement extends Base{
	// Objetos
	// Metodos customizados
	
	By lnkAdmin = By.id("menu_admin_viewAdminModule");
	By txtUsername = By.id("searchSystemUser_userName");
	By btnSearch = By.id("searchBtn");
	By tblUsername = By.xpath("//tbody/tr[1]/td[2]");
	///////////////////////*
	/*
	By pim =By.xpath("//b[contains(text(),'PIM')]");
	By lnkConfiguration = By.id("menu_pim_Configuration");
	By opcion = By.xpath("//a[@id='menu_pim_viewReportingMethods']"); 
	By btnAdd =By.id("btnAdd");
	By txtname = By.id("reportingMethod_name");
	By save =By.id("btnSave");
	By 	usenew = By.xpath("//a[contains(text(),'user')]");
	
	*///////////////////////
	
	public UserManagement(WebDriver driver) {
		super(driver);
	}
	
	public void searchUsername(String username) {
		reporter("Search username..."+username);
		click(lnkAdmin);
		takeScreenshot("ClickedAdmin");
		type(txtUsername, username);
		takeScreenshot("EnterUsernameText");
		click(btnSearch);
		implicitWait();
		takeScreenshot("ClickedSearch");
	}
	
	public void validateUsernameTable(String expectedUsername) {
		reporter("Validate Username in table results");
		String username = getText(tblUsername);
		assertEquals(username, expectedUsername);
		takeScreenshot("ValidateUsernameTable");
	}
//////////////////////////////
	/*
	public void addUser(String newuser) {
		reporter("add newuser..."+newuser);
		click(pim);
		click(lnkConfiguration);
		click(opcion);
		click(btnAdd);
		type(txtname,newuser);
		click(save);
		implicitWait();
	}
	
	public void validateUserAdd(String expectedAddUser) {
		reporter("Validate User new");
		String newuser = getText(usenew);
		assertEquals(newuser, expectedAddUser);
	}
	
	*/
	//////////////////////////////////////

}
