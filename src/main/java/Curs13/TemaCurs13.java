package Curs13;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Pages.BlogPage;
import Pages.NavigationMenu;
import Pages.ShopPage;
import Utils.BaseTest;

public class TemaCurs13 extends BaseTest {
	
	@Test(priority = 1)
	public void tema13() throws InterruptedException {		
			
		NavigationMenu blogFormats = new NavigationMenu(driver);
		blogFormats.navigateTo(blogFormats.blogMenu);
		
	    driver.findElement(By.xpath("//a[contains(text(), 'Post Formats')]")).click();
	    assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/category/post-formats/");
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//a[contains(text(), 'Audio post')]")).click();
		Thread.sleep(2000);
	}

	
	@Test(priority = 2)
	public void moveSliders() throws InterruptedException {
		
		
		BlogPage blog = new BlogPage(driver);
		blog.doubleClick(blog.playButton);
		Thread.sleep(2000);
		blog.moveMusicSlider(blog.musicSlider, 200, 0);
		Thread.sleep(2000);
		blog.moveVolumeSlider(blog.volumeSlider, -50, 0);
		Thread.sleep(5000);
		
	}
	
}
