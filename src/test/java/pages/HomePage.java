package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Profile Menu
    By profileMenu = By.xpath("//span[@class='oxd-userdropdown-tab']");

    // Logout Button
    By logoutBtn = By.xpath("//a[text()='Logout']");

    public void logout() {

        wait.until(ExpectedConditions.elementToBeClickable(profileMenu)).click();

        wait.until(ExpectedConditions.elementToBeClickable(logoutBtn)).click();
    }
}