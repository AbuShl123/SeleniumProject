package test.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class T4_LibraryAppLogin {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://library2.cydeo.com/login.html");

        WebElement emailBar = driver.findElement(By.id("inputEmail"));
        emailBar.sendKeys("wrongemail@gmail.com");

        WebElement searchBar = driver.findElement(By.id("inputPassword"));
        searchBar.sendKeys("wrongpassword" + Keys.ENTER);

        String expectedMessage = "Sorry, Wrong Email or Password";
        String actualMessage = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login-form\"]/div[2]/div"))).getAttribute("innerHTML");
        if (expectedMessage.equals(actualMessage)) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
        }

        String text = driver.findElement(By.cssSelector("#login-form > div:nth-child(2) > div")).getText();
        System.out.println(text);

    }
}
