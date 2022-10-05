package Curs11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Pages.NavigationMenu;
import Utils.BaseTest;

public class TemaCurs11 extends BaseTest{
	
	@Test
	public void singleAuthor() {
		NavigationMenu single = new NavigationMenu(driver);
		single.navigateTo(single.singleAuthor);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement drama = driver.findElement(By.cssSelector("div[class='sc_skills_item sc_skills_style_1 odd first inited']"));		 
		wait.until(ExpectedConditions.textToBePresentInElement(drama, "95%"));
		
		
		WebElement biography = driver.findElement(By.cssSelector("div[class='sc_skills_item sc_skills_style_1 even inited']"));		 
		wait.until(ExpectedConditions.textToBePresentInElement(biography, "75%"));
		
		WebElement cookBooks = driver.findElement(By.cssSelector("div[class='sc_skills_item sc_skills_style_1 odd inited']")); 
		wait.until(ExpectedConditions.textToBePresentInElement(cookBooks, "82%"));
		
	}

}
