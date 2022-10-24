package test.day06_dropdownPractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("http://zero.webappsecurity.com/login.html");

        String expected = "Log in to ZeroBank";
        String actual = webDriver.findElement(By.tagName("h3")).getText();
        if (actual.equals(expected)) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
        }

        webDriver.quit();

    }
}
