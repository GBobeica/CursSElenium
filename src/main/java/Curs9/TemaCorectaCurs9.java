package Curs9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class TemaCorectaCurs9 extends BaseTest {
	
	@Test
	public void tema () throws InterruptedException {
		
		WebElement loginButton = driver.findElement(By.xpath("//a[@class=\"popup_link popup_login_link icon-user inited\"]"));
		System.out.println(loginButton.isDisplayed());
		
		
	WebElement name = driver.findElement(By.xpath("//input[@id='log']"));	
		if (name.isDisplayed()) {
			System.out.println("Elementul name este prezent");
		}else {
			System.out.println("Elementul name nu este prezent inca");
		
			
			WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
			
			if (password.isDisplayed()) {
				System.out.println("Elementul password este prezent");
			}else {
				System.out.println("Elementul password nu este prezent inca");
			}				
	}

		System.out.println("=====> Rezultate dupa ce butonul de login este apasat <====");
		loginButton.click();
		Thread.sleep(5000);
		
	
		
		if (name.isDisplayed()) {
			System.out.println("Elementul name este prezent");
		}else {
			System.out.println("Elementul name nu este prezent inca");
		}	
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		if (password.isDisplayed()) {
			System.out.println("Elementul password este prezent");
		}else {
			System.out.println("Elementul password nu este prezent inca");
}
}
}
