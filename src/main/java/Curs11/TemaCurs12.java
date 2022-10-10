package Curs11;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Pages.NavigationMenu;
import Utils.BaseTest;

public class TemaCurs12 extends BaseTest{
	

	@Test(priority = 1)
	public void blogClassicSelect() throws InterruptedException {
		
	
	NavigationMenu blog = new NavigationMenu(driver);
	blog.navigateTo(blog.blogMenu);
	
	
	driver.findElement(By.xpath("//a[contains(text(), 'Classic')]")).click();
	driver.findElement(By.xpath("(//a[contains(@class, 'sc_button sc_button_square sc_button_style_filled sc_button_size_small')])[3]")).click();
	
}
	@Test(priority = 2)
	public void addComment() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.xpath("//textarea[@id='comment']")).sendKeys("Mesaj SADADA");
		driver.findElement(By.xpath("//input[@id='author']")).sendKeys("Bobeica Gabriel");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("beicaa@gmail.com");
		driver.findElement(By.xpath("//input[@id='url']")).sendKeys("www.beica.ro");
		

		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='send_comment']")).click();
		Thread.sleep(3000);
		Boolean approveComment = driver.findElement(By.xpath("//div[@class='comment_not_approved']")).isDisplayed();
		assertTrue(approveComment);
		
		Thread.sleep(10000);
		
	}
}