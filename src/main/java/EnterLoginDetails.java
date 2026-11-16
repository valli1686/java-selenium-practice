
package session4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EnterLoginDetails {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://maya.adityauniversity.in/sign-in");
            driver.manage().window().maximize();

            WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

            // Locate username field
            WebElement username = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                    By.name("roll_no")
                )
            );

            // Enter username
            username.sendKeys("23A91A0575");
            System.out.println("Username entered successfully!");

            // Locate password field
            WebElement password = driver.findElement(
                By.name("password")
            );

            // Enter password from environment variable
            String passwordValue = System.getenv("password");

            if (passwordValue == null || passwordValue.isEmpty()) {
                System.out.println("Set MAYA_PASSWORD environment variable.");
                return;
            }

            password.sendKeys(passwordValue);
            System.out.println("Password entered successfully!");

            // Do not print the password or click Sign In yet.

        } finally {
            // Browser remains open for observation.
        }
    }
}
