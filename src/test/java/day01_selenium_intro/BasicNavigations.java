package day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://www.google.com");
        Thread.sleep(5000);
        webDriver.navigate().to("https://www.tesla.com");
        Thread.sleep(5000);
        webDriver.navigate().back();
        Thread.sleep(5000);
        webDriver.navigate().forward();
        Thread.sleep(5000);
        webDriver.navigate().refresh();

        webDriver.close(); // closing only the current page

        // if there are several pages on the browsers, webDriver.quit() methods will close all of them
    }
}
