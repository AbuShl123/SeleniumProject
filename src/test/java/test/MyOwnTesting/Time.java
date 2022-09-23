package test.MyOwnTesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Time {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://animestars.org/");

        WebElement m = driver.findElement(By.cssSelector("body > div.wrapper > div > header > a > div.logo__title"));
        System.out.println("m.getText() = " + m.getText());
    }
}
