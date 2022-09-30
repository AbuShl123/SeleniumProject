package test.day05_testing_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class T3_Dropdown {
    WebDriver webDriver;

    @BeforeClass
    public void setUp() {
        webDriver = WebDriverFactory.getDriver("Chrome");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.navigate().to("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void test1() {
        Select select = new Select(webDriver.findElement(By.cssSelector("#dropdown")));
        String actual = select.getFirstSelectedOption().getText();
        String expected = "Please select an option";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        Select select = new Select(webDriver.findElement(By.cssSelector("#state")));
        String expected = "Select a State";
        String actual = select.getFirstSelectedOption().getText();
        Assert.assertEquals(expected, actual);
    }

/*
1.Open Chrome browser
2.Go to http://practice.cybertekschool.com/dropdown
3.Select Illinois
4.Select Virginia
5.Select California
6.Verify final selected option is California.Use all Select options. (visible text, value, index)
*/
    @Test
    public void test4() {
        WebElement dropDown = webDriver.findElement(By.id("state"));
        Select states = new Select(dropDown);
        states.selectByVisibleText("Illinois");
        states.selectByValue("VA");
        states.selectByIndex(5);
        String actual = states.getFirstSelectedOption().getText();
        String expected = "California";
        Assert.assertEquals(expected, actual);
    }



    @AfterClass
    public void tearDown() {
        webDriver.quit();
    }
}
