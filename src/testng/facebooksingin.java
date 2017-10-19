package testng;

import org.testng.annotations.Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class facebooksingin {
  @Test
  public void f() {
	System.out.println("lunch chrome");
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	 
  }

  @AfterMethod
  public void afterMethod() {
  }

}
