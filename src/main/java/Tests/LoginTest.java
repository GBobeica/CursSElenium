package Tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.NavigationMenu;
import Utils.BaseTest;
import Utils.TestngListener;
@Listeners(TestngListener.class)
public class LoginTest extends BaseTest {
	
	@Test
	public void loginTest() throws InterruptedException {
		//menu.navigateTo(menu.shopLink);		
		//menu.navigateTo(menu.contactLink);
		NavigationMenu menu = new NavigationMenu(driver);		
		menu.navigateTo(menu.loginLink);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.loginInApp("TestUser", "12345@67890");
		Thread.sleep(5000);
		loginpage.logoutFromApp();
		
		
	}
	

	@Test(priority = 1)
	public void invalidloginTest() {
		//menu.navigateTo(menu.shopLink);		
		//menu.navigateTo(menu.contactLink);
		NavigationMenu menu = new NavigationMenu(driver);		
		menu.navigateTo(menu.loginLink);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.loginInApp("UserGresit", "ParolaGresita");
		
		
	}
}
