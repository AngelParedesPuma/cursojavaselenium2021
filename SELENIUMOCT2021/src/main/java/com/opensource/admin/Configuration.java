package com.opensource.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opensource.base.Base;

public class Configuration extends Base{
	// Objetos
	// Metodos customizados
	
	By pim =By.xpath("//b[contains(text(),'PIM')]");
	By lnkConfiguration = By.id("menu_pim_Configuration");
	By opcion = By.xpath("//a[@id='menu_pim_viewReportingMethods']"); 
	By btnAdd =By.id("btnAdd");
	By txtname = By.id("reportingMethod_name");
	By save =By.id("btnSave");
	By 	usenew = By.xpath("//a[contains(text(),'user')]");
	
	public Configuration(WebDriver driver) {
		super(driver);
	}
	
	public void addUser(String newuser) throws InterruptedException {
		reporter("add user..."+ newuser);
		click(pim);
		click(lnkConfiguration);
		click(opcion);
	//	Thread.sleep(1000);
		click(btnAdd);
	//	Thread.sleep(1000);
		type(txtname,newuser);
	//	Thread.sleep(5000);
		click(save);
		implicitWait();
	}
	
	public void validateUserAdd(String expectedAddUser) {
		reporter("Validate User new");
		String newuser = getText(usenew);
		assertEquals(newuser, expectedAddUser);
	}
	
	
	

}
