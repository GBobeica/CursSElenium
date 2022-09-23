package Curs8;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumScript {
	
	WebDriver driver;
	
      @Test(priority=1)
	public void openBrowser() {
		
		 driver = WebDriverManager.chromedriver().create();
		driver.get("https://keybooks.ro");
		
		 
	}
      @Test(priority=2)
      public void checkUrl() {
    	  
    	  String pageUrl = driver.getCurrentUrl();
    	  System.out.println(pageUrl);
    	  assertEquals(pageUrl, "https://altex.ro");
    	  
    	  
      }
	
}
