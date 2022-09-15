package day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver();

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://www.google.com/");

        System.out.println(webDriver.getTitle());
    }
}
