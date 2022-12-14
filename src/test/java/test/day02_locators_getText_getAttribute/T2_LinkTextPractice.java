package test.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://practice.cydeo.com");
        WebElement abTesting =driver.findElement(By.linkText("A/B Testing"));
        abTesting.click();

        Thread.sleep(3000);

        driver.navigate().back();

        Thread.sleep(3000);

        abTesting = driver.findElement(By.partialLinkText("A/B"));
        abTesting.click();


    }
}
