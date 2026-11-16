
package session4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAndGetText {

    public static void main(String[] args) {

        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Open login page
        driver.get("https://the-internet.herokuapp.com/login");

        driver.manage().window().maximize();

        // Find username and enter value
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("tomsmith");

        // Find password and enter value
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword!");

        // Find login button and click
        WebElement loginButton =
                driver.findElement(By.cssSelector("button[type='submit']"));

        loginButton.click();

        // Find success message
        WebElement message = driver.findElement(By.id("flash"));

        // Retrieve and print message
        System.out.println("Login Result: " + message.getText());

        // Keep browser open for observation
        // driver.quit();
    }
}
