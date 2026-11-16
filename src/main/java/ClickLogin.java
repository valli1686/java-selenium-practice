
package session4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ClickLogin {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://maya.adityauniversity.in/");
        driver.manage().window().maximize();

        // Find the Login button
        WebElement loginButton = driver.findElement(
            By.xpath("//*[self::a or self::button][normalize-space()='Login']")
        );

        // Click Login
        loginButton.click();

        System.out.println("Login button clicked!");

        // Wait for the login form to load
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(d -> !d.findElements(By.tagName("input")).isEmpty());

        // Find and display login form fields
        List<WebElement> inputs = driver.findElements(By.tagName("input"));

        for (WebElement input : inputs) {
            System.out.println("Type: " + input.getAttribute("type"));
            System.out.println("Name: " + input.getAttribute("name"));
            System.out.println("ID: " + input.getAttribute("id"));
            System.out.println("-------------------");
        }
    }
}
