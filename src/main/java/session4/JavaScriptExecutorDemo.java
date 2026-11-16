
package session4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://maya.adityauniversity.in/");
        driver.manage().window().maximize();

        // Create JavaScriptExecutor object
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Locate Login button
        WebElement loginButton = driver.findElement(
            By.xpath("//*[self::a or self::button][normalize-space()='Login']")
        );

        // Scroll to the Login button
        js.executeScript("arguments[0].scrollIntoView(true);", loginButton);

        // Highlight the Login button
        js.executeScript(
            "arguments[0].style.border='3px solid red';", loginButton
        );

        System.out.println("Login button highlighted!");

        // Click using JavaScript
        js.executeScript("arguments[0].click();", loginButton);

        System.out.println("Login button clicked using JavaScript!");
    }
}
