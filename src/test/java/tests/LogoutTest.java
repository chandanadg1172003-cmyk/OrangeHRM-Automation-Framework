package tests;


	import org.testng.Assert;
	import org.testng.annotations.Test;

	import base.BaseTest;
	import pages.HomePage;
	import pages.LoginPage;

	public class LogoutTest extends BaseTest {

	    @Test
	    public void verifyLogout() {

	        // Create LoginPage object
	        LoginPage loginPage = new LoginPage(driver);

	        // Login using credentials from config.properties
	        loginPage.login(
	                prop.getProperty("username"),
	                prop.getProperty("password"));

	        // Create HomePage object
	        HomePage homePage = new HomePage(driver);

	        // Logout
	        homePage.logout();

	        // Verify user is redirected to login page
	        Assert.assertTrue(driver.getCurrentUrl().contains("login"),
	                "Logout Failed!");

	        System.out.println("Logout Successful!");
	    }
	}


