package com.entrevista;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class web {

	public static WebDriver driver;
	  @Test
	  public void TC001() throws InterruptedException {
		  //Step01 launcher browser
		  Reporter.log("Step 1 Launch browser");
		  System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chrome/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://demoqa.com/text-box");
		  driver.manage().window().maximize();	
}
}