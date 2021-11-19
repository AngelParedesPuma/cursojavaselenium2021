package com.opensource.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
// ctl + shif + o
public class Ejercio1 {
	
	public static WebDriver driver;
  @Test
  public void TC001() throws InterruptedException {
	  //Step01 launcher browser
	  Reporter.log("Step 1 Launch browser");
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chrome/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.manage().window().maximize();
	// step02 enter user name and pasword  
	  Reporter.log("step02 enter user name and pasword ");
	  driver.findElement(By.id("txtUsername")).sendKeys("Admini");
	  Thread.sleep(2000);
	  driver.findElement(By.id("txtPassword")).sendKeys("admin1234");
	  Thread.sleep(2000);// pausas  en milisegundos
	// step03 click   
	  Reporter.log("step03 enter user name and pasword ");
	  driver.findElement(By.id("btnLogin")).click();
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	  Thread.sleep(2000);
	// step04 verificar luego de ingrerer pwd errado
	  Reporter.log("Step04 luego de ingrerer pwd errado y el usuario");
	  WebDriverWait wait = new WebDriverWait(driver,30);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("spanMessage")));
	  String mensaje =driver.findElement(By.id("spanMessage")).getText();// captura el texto del elemento 
	  Assert.assertEquals(mensaje,"Invalid credentials");// compara el texto capturado con lo esperado 
	  Thread.sleep(2000);
	  driver.close();
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
