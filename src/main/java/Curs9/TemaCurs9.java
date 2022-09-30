package Curs9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class TemaCurs9 extends BaseTest{
	
	@Test(priority=1)
	public void loginLocator() {
		
		WebElement loginButton = driver.findElement(By.xpath("//a[@class=\"popup_link popup_login_link icon-user inited\"]"));
		System.out.println(loginButton.isDisplayed());
	}
		
	@Test(priority = 2)	
	public void nameLocatorNotDisplayed() {
		WebElement name = driver.findElement(By.xpath("//input[@id='log']"));
		
		if (name.isDisplayed()) {
			System.out.println("Elementul name este prezent");
		}else {
			System.out.println("Elementul name nu este prezent inca");
		}	
		
		
		
	}

	@Test(priority = 3)
	public void passwordLocatorIsNotDisplayed() {
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		
		if (password.isDisplayed()) {
			System.out.println("Elementul password este prezent");
		}else {
			System.out.println("Elementul password nu este prezent inca");
		}	
		
		
	}
	
	@Test(priority = 4)	
	public void loginClick() throws InterruptedException {
		System.out.println("=====> Rezultate dupa ce butonul de login este apasat <====");
		WebElement loginButton = driver.findElement(By.xpath("//a[@class=\"popup_link popup_login_link icon-user inited\"]"));
		loginButton.click();
		Thread.sleep(5000);
	}
	
	@Test(priority = 5)
	public void nameIsPresent () {
		WebElement name = driver.findElement(By.xpath("//input[@id='log']"));
		
		if (name.isDisplayed()) {
			System.out.println("Elementul name este prezent");
		}else {
			System.out.println("Elementul name nu este prezent inca");
		}	
		
	}
	@Test(priority = 6)
	public void passwordIsPresent() {
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		
		if (password.isDisplayed()) {
			System.out.println("Elementul password este prezent");
		}else {
			System.out.println("Elementul password nu este prezent inca");
		}	
		
	}
	}

