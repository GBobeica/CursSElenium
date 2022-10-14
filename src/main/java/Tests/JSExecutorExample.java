package Tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class JSExecutorExample extends BaseTest{
	
	@Test(priority = 0)
	public void jsExecutorTest() throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		//scroll un anumiy nr de pixeli
		jse.executeScript("window.scrollBy(0,2500)");
		Thread.sleep(3000);
		
		WebElement buttonSignup = driver.findElement(By.cssSelector("input[value='Sign up']"));
		//scroll pana la un anumit element
		jse.executeScript("arguments[0].scrollIntoView()",buttonSignup);
		
		//muta view-ul pe elementul specificat
		Actions actions = new Actions(driver);
		actions.moveToElement(buttonSignup).perform();
		
		//scroll pe toata  inaltimea ferestrei pana jos
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		Thread.sleep(3000);
		// face scroll de jos inapoi la top window
		jse.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		
		Thread.sleep(3000);
		
		
	}

	@Test(priority = 1)
	public void jsExecutorExample3() throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		WebElement searchIcon = driver.findElement(By.cssSelector("button[class*='icon-search']"));
		WebElement searchInput = driver.findElement(By.cssSelector("input[class='search_field']"));
		
		//jse.executeScript("arguments[0].click()", searchIcon);
		//jse.executeScript("arguments[0].value='cooking'", searchInput);
		//jse.executeScript("arguments[0].click()", searchIcon);
		
		jse.executeScript("arguments[0].click();arguments[1].value='cooking'", searchIcon, searchInput);
		
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(3000);
	}
	
	
	
}
