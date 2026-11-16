package session4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MayaLoginAutomation {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

            // Step 1: Open login page
            driver.get("https://maya.adityauniversity.in/sign-in");
            driver.manage().window().maximize();

            // Step 2: Enter username
            WebElement username = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("roll_no"))
            );
            username.sendKeys("23A91A0575");
            System.out.println("Username entered!");

            // Step 3: Enter password (type your password between the quotes)
            WebElement password = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("password"))
            );
            password.sendKeys("password");
            System.out.println("Password entered!");

            // Step 4: Submit
            password.sendKeys(Keys.ENTER);
            System.out.println("Login form submitted!");

            // Step 5: Wait until the page leaves /sign-in
            wait.until(ExpectedConditions.not(
                ExpectedConditions.urlContains("/sign-in")
            ));

            System.out.println("Current URL: " + driver.getCurrentUrl());
            System.out.println("Page Title: " + driver.getTitle());

        } catch (Exception e) {
            System.out.println("Login automation issue: " + e.getMessage());
        }
        // Browser stays open so you can check the result.
    }
}