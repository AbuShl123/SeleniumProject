package test.day06_dropdownPractices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practice {
    WebDriver webDriver;

    @BeforeMethod
    public void setUp() {
        webDriver = WebDriverFactory.getDriver("chrome");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.navigate().to("https://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void test1() {
        webDriver.findElement(By.xpath("//button[@onClick='jsAlert()']")).click();
        Alert alert = webDriver.switchTo().alert();
        alert.accept();
        WebElement alertMsg = webDriver.findElement(By.id("result"));
        String actual = alertMsg.getText();
        String expected = "You successfully clicked an alert";

        Assert.assertEquals(actual, expected);
    }

    @AfterMethod
    public void tearDown() {
        webDriver.quit();
    }
}
