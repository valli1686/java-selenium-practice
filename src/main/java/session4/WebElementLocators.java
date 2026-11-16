
package session4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementLocators {

    public static void main(String[] args) {

        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Open Maya portal
        driver.get("https://maya.adityauniversity.in/");

        driver.manage().window().maximize();

        // Find all input elements
        java.util.List<WebElement> inputs =
                driver.findElements(By.tagName("input"));

        System.out.println("Total input fields: " + inputs.size());

        // Display information about input elements
        for (WebElement input : inputs) {

            System.out.println("ID: " + input.getAttribute("id"));

            System.out.println("Name: " + input.getAttribute("name"));

            System.out.println("Type: " + input.getAttribute("type"));

            System.out.println("----------------------");
        }

        // Find buttons
        java.util.List<WebElement> buttons =
                driver.findElements(By.tagName("button"));

        System.out.println("Total buttons: " + buttons.size());

        for (WebElement button : buttons) {

            System.out.println("Button Text: " + button.getText());

        }

        // Keep browser open for observation
        // driver.quit();
    }
}
