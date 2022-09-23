package test.day03_locators_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class T3_getText_cssSelector {
    public static void main(String[] args) {
        WebDriver webDriver = WebDriverFactory.getDriver("chrome");

        webDriver.get("https://login1.nextbasecrm.com/");

        // by type:
        // webDriver.findElement(By.cssSelector("input[type='submit']")).click();

        // by value:
        // webDriver.findElement(By.cssSelector("input[value=\"Log In\"]")).click();

        //webDriver.findElement(By.cssSelector("input[class = \"login-btn\"]")).click();

        webDriver.findElement(By.cssSelector("#login-popup > form > div.log-popup-footer > input")).click();


        webDriver.quit();
    }
}
