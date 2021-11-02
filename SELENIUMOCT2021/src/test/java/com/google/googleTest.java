package com.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class googleTest {
	public static WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chrome/chromedriver.exe");
	  driver = new ChromeDriver();

	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  
  }
}