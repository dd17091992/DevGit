package com.pack.DevGit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest
{
  WebDriver driver;
  @Test
  public void f() 
  {
	  System.out.println("GIT PROJECT UPDATED");
	   
  }
  @BeforeClass
  public void beforeClass() 
  {
	  System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://dev.tracko.co.in/");
	  
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  
  }

  @AfterClass
  public void afterClass() 
  {
	 driver.quit(); 
  }

}
