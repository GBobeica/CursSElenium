package Curs14;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import Pages.NavigationMenu;
import Pages.ShopPage;
import Utils.BaseTest;

public class TemaCurs14 extends BaseTest {
	
	@Test
	public void tema14 () throws InterruptedException {
		
		//navigate to Shop Page
		NavigationMenu shopPageNavitagation = new NavigationMenu(driver);
		shopPageNavitagation.navigateTo(shopPageNavitagation.shopLink);		
		Thread.sleep(2000);
		
		//move price sliders to wanted range
		WebElement leftSlider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default' and @style='left: 0%;']"));
		WebElement rightSlider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default' and @style='left: 100%;']"));
			
		ShopPage shop = new ShopPage(driver);
		shop.dragAndDropSlider(shop.leftSlider, 70, 0);
		shop.dragAndDropSlider(shop.rightSlider, -100, 0);
		   Thread.sleep(2000);
		
		   //filter button press
	   driver.findElement(By.xpath("//button[@class='button']")).click();
	   
	   //assert verification and print - Showing the single result is displayed 
		WebElement singleResult = driver.findElement(By.xpath("//p[@class='woocommerce-result-count']"));
		System.out.println(singleResult.isDisplayed());		
		assertEquals(singleResult.getText(), "Showing the single result");
		
		System.out.println(singleResult.getText());
		assertTrue(singleResult.isDisplayed());
	   
		//add to cart
		driver.findElement(By.xpath("//a[@class='button product_type_simple add_to_cart_button ajax_add_to_cart']")).click();
		Thread.sleep(1000);
		
		//view cart
		driver.findElement(By.xpath("(//a[@class='button wc-forward'])[2]")).click();
		Thread.sleep(1000);
		
		//increase quantity
		driver.findElement(By.xpath("//span[@class='q_inc']")).click();
		Thread.sleep(1000);
		
		//update cart
		driver.findElement(By.xpath("(//button[@class='button'])[2]")).click();
		Thread.sleep(1000);
		
		//cart updated assert check
		WebElement cartUpdated = driver.findElement(By.xpath("//div[@class='woocommerce-message']"));
		System.out.println(cartUpdated.isDisplayed());		
		assertEquals(cartUpdated.getText(), "Cart updated.");
		System.out.println(cartUpdated.getText());
		Thread.sleep(1000);
		
		//increased sub total
		WebElement updatedSubtotal = driver.findElement(By.xpath("(//span[@class='woocommerce-Price-amount amount'])[4]"));
		System.out.println(updatedSubtotal.isDisplayed());		
		assertEquals(updatedSubtotal.getText(), "$29.98");
	    System.out.println(updatedSubtotal.getText());
		Thread.sleep(2000); 
		
		//apply coupon code
		driver.findElement(By.xpath("//input[@name='coupon_code']")).sendKeys("WTM66DVT");	
		driver.findElement(By.xpath("//button[@name='apply_coupon'] ")).click();
		Thread.sleep(2000);
		
		//verify coupon discount 
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement couponDiscount = driver.findElement(By.xpath("(//span[@class='woocommerce-Price-amount amount'])[5]"));
		System.out.println(couponDiscount.isDisplayed());		
		assertEquals(couponDiscount.getText(), "$14.99");
	    System.out.println(couponDiscount.getText());
		Thread.sleep(2000);
	} 
}
		
	



