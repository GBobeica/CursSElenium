package Curs11;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class JSAlertsExample extends BaseTest {
	
	@Test(priority=1)
    public void testJSAlert () throws InterruptedException {
		
		driver.findElement(By.cssSelector("button[onclick*='Alert']")).click();
		Thread.sleep(3000);
		
		
		Alert alertaJS = driver.switchTo().alert();
		alertaJS.accept();
		
		//driver.switchTo().alert().accept(); --> acelasi lucru ca si liniile 21/22
		
		WebElement result = driver.findElement(By.cssSelector("p[id='result']"));
		assertEquals(result.getText(), "You successfully clicked an alert");
		
		
	}
	@Test(priority=2)
	public void testJSConfirmation() throws InterruptedException {
		
		driver.findElement(By.cssSelector("button[onclick*='Confirm']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().dismiss();
		
		WebElement result = driver.findElement(By.cssSelector("p[id='result']"));
		assertEquals(result.getText(), "You clicked: Cancel");
		
	}
	
	@Test(priority = 3)
	public void testJSPrompt () throws InterruptedException {
		
		driver.findElement(By.cssSelector("button[onclick*='Prompt']")).click();
		driver.switchTo().alert().sendKeys("ceva text");
		
		driver.switchTo().alert().accept();
		
		WebElement result = driver.findElement(By.cssSelector("p[id='result']"));
		assertEquals(result.getText(), "You entered: ceva text");
		Thread.sleep(3000);
		
	}
}

