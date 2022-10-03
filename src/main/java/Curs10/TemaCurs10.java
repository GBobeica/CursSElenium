package Curs10;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

@Test(priority=1)
public class TemaCurs10 extends BaseTest {
	
	
	public void searchBook() throws InterruptedException {
		
		WebElement searchButton = driver.findElement(By.cssSelector("form[role='search'][class='search_form']"));		
		searchButton.click();		
		Thread.sleep(2000);
		
		WebElement bookSearch = driver.findElement(By.cssSelector("input[class='search_field']"));
		bookSearch.sendKeys("The story about me");
		bookSearch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void loadMore () throws InterruptedException {
			WebElement loadButton = driver.findElement(By.cssSelector("a[id*='viewmore_link']"));
		    loadButton.click();
			Thread.sleep(4000);
		}
	
	@Test(priority=3)
	public void titleSelect() throws InterruptedException {
		WebElement titleSelect = driver.findElement(By.cssSelector("a[href='https://keybooks.ro/shop/the-story-about-me/']"));
		titleSelect.click();
		Thread.sleep(4000);
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/the-story-about-me/");
		
	}
	
	@Test(priority=4)
	public void addToCart() throws InterruptedException {
		WebElement addToCart = driver.findElement(By.cssSelector("button[class='single_add_to_cart_button button alt']"));
		addToCart.click();

       WebElement addedToCartText = driver.findElement(By.cssSelector("div[class='woocommerce-message']"));
       System.out.println(addedToCartText.getText());
       Thread.sleep(2000);
		
       WebElement viewCart = driver.findElement(By.cssSelector("a[tabindex='1'][class='button wc-forward']"));
       viewCart.click();
       assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/cart/");
       Thread.sleep(2000);
       
	}
	
	@Test(priority=5)
	public void updateCart() throws InterruptedException {
		
		WebElement addSecondCopy = driver.findElement(By.cssSelector("span[class='q_inc']"));
		addSecondCopy.click();
		
		WebElement updateCart = driver.findElement(By.cssSelector("button[type='submit'][class='button'][name='update_cart']"));
		updateCart.click();
		Thread.sleep(2000);
		
		WebElement updatedCartMessage = driver.findElement(By.cssSelector("div[class='woocommerce-message']"));
		System.out.println(updatedCartMessage.getText());
		Thread.sleep(2000);
		
		WebElement proceedToCheckOut = driver.findElement(By.cssSelector("a[class='checkout-button button alt wc-forward']"));
		proceedToCheckOut.click();
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/checkout/");
		Thread.sleep(2000);
		
		WebElement billingDetails = driver.findElement(By.cssSelector("div[class='woocommerce-billing-fields'] h3"));
		System.out.println(billingDetails.getText());
		
		WebElement aditionalInformation = driver.findElement(By.cssSelector("div[class='woocommerce-additional-fields'] h3"));
		System.out.println(aditionalInformation.getText());
		
	}
	
	}

