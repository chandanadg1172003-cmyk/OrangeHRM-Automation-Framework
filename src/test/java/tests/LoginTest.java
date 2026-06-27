package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void verifyValidLogin() {

        // Print URL and Title
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Page Title: " + driver.getTitle());

        // Create LoginPage object
        LoginPage loginPage = new LoginPage(driver);

        // Perform Login
        loginPage.login(
                prop.getProperty("username"),
                prop.getProperty("password"));

        // Create DashboardPage object
        DashboardPage dashboard = new DashboardPage(driver);

        // Verify Dashboard is displayed
        Assert.assertTrue(dashboard.isDashboardDisplayed(),
                "Dashboard is not displayed. Login Failed!");

        System.out.println("Dashboard is displayed successfully.");
        System.out.println("Login Test Passed Successfully!");

    }
}