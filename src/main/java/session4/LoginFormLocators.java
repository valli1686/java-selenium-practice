
package session4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LoginFormLocators {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://maya.adityauniversity.in/sign-in");
        driver.manage().window().maximize();

        List<WebElement> inputs =
            driver.findElements(By.tagName("input"));

        System.out.println("Total input fields: " + inputs.size());

        for (WebElement input : inputs) {
            System.out.println("Type: " + input.getAttribute("type"));
            System.out.println("ID: " + input.getAttribute("id"));
            System.out.println("Name: " + input.getAttribute("name"));
            System.out.println("Placeholder: " +
                input.getAttribute("placeholder"));
            System.out.println("----------------------");
        }

        List<WebElement> buttons =
            driver.findElements(By.tagName("button"));

        for (WebElement button : buttons) {
            System.out.println("Button: " + button.getText());
        }
    }
}
