package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BlogPage {	
	WebDriver driver;	
	public BlogPage(WebDriver driver) {
		this.driver = driver;
		
	}
	public By playButton = By.xpath("//div[@class='mejs-button mejs-playpause-button mejs-play']");
	public By musicSlider = By.xpath("//span[@class='mejs-time-current']");
	public By volumeSlider = By.xpath("//div[@class='mejs-horizontal-volume-current']");
		

public void moveMusicSlider (By locator, int x, int y ) {
	WebElement element = driver.findElement(locator);
	Actions actions = new Actions(driver);
	actions.dragAndDropBy(element, x, y).perform();
}

public void moveVolumeSlider (By locator, int x, int y ) {
	WebElement element = driver.findElement(locator);
	Actions actions = new Actions(driver);
	actions.dragAndDropBy(element, x, y).perform();
}

public void doubleClick(By locator) {
	WebElement element = driver.findElement(locator);
	Actions actions = new Actions(driver);
	actions.doubleClick(element).perform();		

}

}