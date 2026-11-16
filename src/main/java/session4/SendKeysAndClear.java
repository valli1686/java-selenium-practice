
package session4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SendKeysAndClear {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://maya.adityauniversity.in/");
        driver.manage().window().maximize();

        // Click Login
        WebElement login = wait.until(
            ExpectedConditions.elementToBeClickable(
                By.xpath("//*[self::a or self::button][normalize-space()='Login']")
            )
        );
        login.click();

        // Wait for the login form
        wait.until(d -> d.findElements(By.tagName("input"))
                         .stream().anyMatch(WebElement::isDisplayed));

        // Find a visible username-type field
        List<WebElement> inputs = driver.findElements(By.tagName("input"));

        WebElement username = inputs.stream()
            .filter(WebElement::isDisplayed)
            .filter(e -> {
                String type = e.getAttribute("type");
                return "text".equalsIgnoreCase(type)
                    || "email".equalsIgnoreCase(type);
            })
            .findFirst()
            .orElseThrow(() -> new RuntimeException("Username field not found"));

        // Enter sample text
        username.sendKeys("selenium_test");
        System.out.println("Text entered: " + username.getAttribute("value"));

        // Clear the field
        username.clear();
        System.out.println("Field cleared: " + username.getAttribute("value"));

        // Keep browser open for observation
    }
}
