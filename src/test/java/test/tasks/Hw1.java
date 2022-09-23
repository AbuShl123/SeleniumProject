package test.tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://www.etsy.com");

        webDriver.findElement(By.name("search_query")).sendKeys("Wooden spoon", Keys.ENTER);

        MyTests.verifyTitle("Wooden spoon | Etsy", webDriver);

        webDriver.quit();
    }
}
