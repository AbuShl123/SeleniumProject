package test.tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw4 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://practice.cydeo.com/inputs");
        webDriver.findElement(By.className("nav-link")).click();

        MyTests.verifyTitle("Practice", webDriver);

        webDriver.quit();
    }
}
