package test.tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();

        webDriver.get(" https://practice.cydeo.com");

        webDriver.findElement(By.partialLinkText("A/B")).click();

        MyTests.verifyTitle("No A/B Test", webDriver);

        webDriver.navigate().back();

        MyTests.verifyTitle("Practice", webDriver);

        webDriver.quit();
    }

}
