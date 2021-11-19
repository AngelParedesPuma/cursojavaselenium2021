package com.opensource.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
// ctl + shif + o
public class TC001_Validate_User_Admin {
	
	public static WebDriver driver;
  @Test
  public void TC001() {
	  //Step01 launcher browser
	  Reporter.log("Step 1 Launch browser");
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chrome/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.manage().window().maximize();
	// step02 enter user name and pasword  
	  Reporter.log("step02 enter user name and pasword ");
	  driver.findElement(By.id("txtUsername")).sendKeys("Admini");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin1234");
	// step03 click   
	  Reporter.log("step03 enter user name and pasword ");
	  driver.findElement(By.id("btnLogin")).click();
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	// step04 verificar
	 Reporter.log("Step 4 Verify user is logged successfully");
	 WebDriverWait wait = new WebDriverWait(driver,30);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("welcome")));
	  
		// step05 click  Admin  
	  Reporter.log("step05 click Admin ");
	  driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	  
		// step6 click   
	  Reporter.log("step05 click Admin ");
	  driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Admin");
	  //step 7
	  
  
  
  
  }  
  
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
