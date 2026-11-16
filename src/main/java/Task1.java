package session1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://maya.adityauniversity.in/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        // Clicks Login on the home page
        driver.findElement(By.xpath("//a[.='Login']")).click();
        Thread.sleep(5000);

        // Scrolls down to bring the login form into view
        JavascriptExecutor siri = (JavascriptExecutor) driver;
        siri.executeScript("window.scrollBy(0,400)");
        Thread.sleep(4000);

        // Enters your Roll Number
        driver.findElement(By.name("roll_no")).sendKeys("23a91a0575");
        Thread.sleep(3000);

        // Enters your Password (keep @name='password' unchanged)
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Srivalli1686$");
        Thread.sleep(3000);

        // Clicks the blue "Sign in" button to log in
        driver.findElement(By.xpath("//button[contains(.,'Sign in')]")).click();
        Thread.sleep(8000);

        // driver.quit(); // Commented out so Chrome stays open on your logged-in dashboard
    }
}