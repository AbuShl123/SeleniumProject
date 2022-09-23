package test.tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://google.com");

        webDriver.findElement(By.name("q")).sendKeys("apple", Keys.ENTER);

        MyTests.verifyTitleStartsWith("apple", webDriver);

        webDriver.quit();
    }
}
