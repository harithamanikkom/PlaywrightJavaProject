package tests;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest2 extends BaseTest {

	@Test
	public void Logintest1() {

		LoginPage loginpage = new LoginPage(page);

		HomePage homepage = new HomePage(page);
		
		test.info("navigating to login page");
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		test.info("Adding username");
		loginpage.addUsername("Admin12");
		
		test.info("Adding password");
		loginpage.addPassword("admin123");
		
		test.info("clicking login button");
		loginpage.clickLoginButton();

		// loginpage.login("Admin", "admin123");
		homepage.clickTimeLink();
		
		test.info("all test completed");

	}
	
	@Test
	public void Logintest2() {
		test.skip("skipping this test");

		throw new SkipException("Skipping this test");	

	}
	
	@Test
	public void Logintest3() {

		LoginPage loginpage = new LoginPage(page);

		HomePage homepage = new HomePage(page);
		
		test.info("navigating to login page");
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		test.info("Adding username");
		loginpage.addUsername("Admin");
		
		test.info("Adding password");
		loginpage.addPassword("admin123");
		
		test.info("clicking login button");
		loginpage.clickLoginButton();

		// loginpage.login("Admin", "admin123");
		//homepage.clickTimeLink();
		
		test.info("all test completed");

	}
}
