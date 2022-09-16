package day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://Google.com");

        WebElement m = driver.findElement(By.name("q"));
        m.sendKeys("Watch anime for free" + Keys.ENTER);

        String expected = "Watch anime";
        String actual = driver.getTitle();
        if (actual.startsWith(expected)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
    }
}
