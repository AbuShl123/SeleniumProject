package test.day06_dropdownPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class T4_Iframe_Practice {
    WebDriver webDriver;

    @BeforeMethod
    public void setUp() {
        webDriver = WebDriverFactory.getDriver("chrome");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.navigate().to("https://practice.cydeo.com/iframe");
    }

    @AfterMethod
    public void tearDown() {
        webDriver.quit();
    }

    @Test
    public void test1() {
//        webDriver.switchTo().frame(0); // by index
//        webDriver.switchTo().frame("mce_0_ifr"); // by id
        webDriver.switchTo().frame(webDriver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));

        WebElement iframe = webDriver.findElement(By.xpath("//p"));
        Assert.assertTrue(iframe.isDisplayed());

//        webDriver.switchTo().parentFrame(); // this also works
        webDriver.switchTo().defaultContent();

        WebElement headerText = webDriver.findElement(By.xpath("//h3"));
        Assert.assertTrue(headerText.isDisplayed());
    }
}
