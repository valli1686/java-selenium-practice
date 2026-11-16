
package session4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SignInButtonLocator {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://maya.adityauniversity.in/sign-in");
        driver.manage().window().maximize();

        // Find all buttons
        List<WebElement> buttons =
            driver.findElements(By.tagName("button"));

        System.out.println("Total buttons: " + buttons.size());

        for (WebElement button : buttons) {

            System.out.println("Text: " + button.getText());
            System.out.println("Type: " + button.getAttribute("type"));
            System.out.println("Class: " + button.getAttribute("class"));
            System.out.println("Value: " + button.getAttribute("value"));
            System.out.println("Aria-label: " +
                button.getAttribute("aria-label"));

            System.out.println("----------------------");
        }

        // Find submit elements
        List<WebElement> submitButtons =
            driver.findElements(By.cssSelector(
                "button[type='submit'], input[type='submit']"
            ));

        System.out.println("Submit elements: " + submitButtons.size());
    }
}
