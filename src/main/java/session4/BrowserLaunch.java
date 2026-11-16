
package session4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

    public static void main(String[] args) {

        // Create WebDriver object
        WebDriver driver = new ChromeDriver();

        // Open Maya portal
        driver.get("https://maya.adityauniversity.in/");

        // Maximize browser
        driver.manage().window().maximize();

        // Print webpage title
        System.out.println("Page Title: " + driver.getTitle());

        // Print current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Keep browser open for observation
        // driver.quit();
    }
}
