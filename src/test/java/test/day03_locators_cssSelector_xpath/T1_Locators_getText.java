package test.day03_locators_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.WebDriverFactory;

public class T1_Locators_getText {
    public static void main(String[] args) {
        WebDriver webDriver = WebDriverFactory.getDriver("edge");

        webDriver.get("https://login1.nextbasecrm.com/");

        webDriver.findElement(By.name("USER_LOGIN")).sendKeys("incorrect");
        webDriver.findElement(By.name("USER_PASSWORD")).sendKeys("incorrect");

        webDriver.findElement(By.className("login-btn")).click();

        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = webDriver.findElement(By.className("errortext")).getText();

        if (expectedErrorMessage.equals(actualErrorMessage)) {
            System.out.println("test invalid login PASSED");
        } else {
            System.out.println("test invalid login FAILED");
        }

        webDriver.quit();
    }
}
