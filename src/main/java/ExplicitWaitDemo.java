
package session4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://maya.adityauniversity.in/");
            driver.manage().window().maximize();

            WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

            // Wait until Login button is clickable
            WebElement loginButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                    By.xpath("//*[self::a or self::button][normalize-space()='Login']")
                )
            );

            loginButton.click();
            System.out.println("Login button clicked!");

            // Check browser connection
            System.out.println("Page title: " + driver.getTitle());
            System.out.println("Current URL: " + driver.getCurrentUrl());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Do not quit the browser yet
    }
}
