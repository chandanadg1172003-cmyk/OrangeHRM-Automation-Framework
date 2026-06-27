package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class InvalidLoginTest extends BaseTest {

    @Test
    public void verifyInvalidLogin() {

        LoginPage loginPage = new LoginPage(driver);

        // Enter invalid credentials
        loginPage.login("Admin", "WrongPassword");

        // Get actual error message
        String actualMessage = loginPage.getErrorMessage();

        // Verify the error message
        Assert.assertEquals(actualMessage, "Invalid credentials");

        System.out.println("Invalid Login Test Passed!");

    }
}