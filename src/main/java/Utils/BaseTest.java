package Utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

 public WebDriver driver;
	
	
	@BeforeClass
	public void openBrowser() {
		
		 driver = WebDriverManager.chromedriver().create();
		 driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://keybooks.ro");
		// driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException {
		//Thread.sleep(5000);
		driver.quit();
	
	}
}
