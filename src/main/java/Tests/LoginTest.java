package Tests;

import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.NavigationMenu;
import Utils.BaseTest;

public class LoginTest extends BaseTest {
	
	@Test
	public void loginTest() {
		//menu.navigateTo(menu.shopLink);		
		//menu.navigateTo(menu.contactLink);
		NavigationMenu menu = new NavigationMenu(driver);		
		menu.navigateTo(menu.loginLink);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.loginInApp("TestUser", "12345@67890");
	}
	

}
