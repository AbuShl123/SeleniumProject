package test.day06_dropdownPractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://google.com");

        WebElement webElement = webDriver.findElement(By.linkText("Почта"));

        webElement.click();

        if (webDriver.getTitle().contains("Gmail")) {
            System.out.println("Test gmail PASSED");
        } else {
            System.out.println("Test gmail FAILED ");
        }
        webDriver.navigate().back();
        MyTests.verifyTitle("Google", webDriver);
    }
}
