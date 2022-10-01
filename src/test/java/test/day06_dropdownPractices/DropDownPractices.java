package test.day06_dropdownPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static utilities.WebDriverFactory.*;

import java.util.concurrent.TimeUnit;

public class DropDownPractices {
    WebDriver webDriver;

    @BeforeMethod
    public void setUp() {
        webDriver = getDriver("chrome");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.navigate().to("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void test1() {
        Select select = new Select(webDriver.findElement(By.id("state")));

        int index = getIndexFromSelect(select, "California");
        select.selectByIndex(index);
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "California");
    }

    @AfterMethod
    public void tearDown() {
        webDriver.quit();
    }
}
