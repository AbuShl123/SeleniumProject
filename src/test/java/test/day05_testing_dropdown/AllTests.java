package test.day05_testing_dropdown;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class AllTests {
    WebDriver webDriver;

    @BeforeClass
    public void setUp() {
        webDriver = WebDriverFactory.getDriver("chrome");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {
        webDriver.quit();
    }

    @BeforeMethod
    public void beforeMethod() {
        webDriver.navigate().to("https://practice.cydeo.com/dropdown");
    }

/*
TC#3: Verifying “Simple dropdown” and “State selection” dropdown default values
1.Open Chrome browser
2.Go to https://practice.cydeo.com/dropdown
3.Verify “Simple dropdown” default selected value is correctExpected: “Please select an option”
4.Verify “State selection” default selected value is correctExpected: “Select a State”
 */
    @Test
    public void test3_1() {
        WebElement dropdown = webDriver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        String expected = "Please select an option";
        String actual = select.getFirstSelectedOption().getText();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3_2() {
        WebElement dropdown = webDriver.findElement(By.id("state"));
        Select select = new Select(dropdown);
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

    /*
    TC #5: Selecting date on dropdown and verifying
    1.Open Chrome browser
    2.Go to https://practice.cydeo.com/dropdown
    3.Select “December 1st, 1923” and verify it is selected.
    Select year using : visible text
    Select month using  : value attribute
    Select day using : index number
     */
    @Test
    public void test5() {
        Select year = new Select(webDriver.findElement(By.id("year")));
        year.selectByVisibleText("1923");
        Select month = new Select(webDriver.findElement(By.id("month")));
        month.selectByValue("11");
        Select day = new Select(webDriver.findElement(By.id("day")));
        day.selectByIndex(0);

        String expectedYear = "1923";
        String expectedMonth = "December";
        String expectedDay = "1";

        String actualYear = year.getFirstSelectedOption().getText();
        String actualMonth = month.getFirstSelectedOption().getText();
        String actualDay = day.getFirstSelectedOption().getText();

        Assert.assertEquals(expectedYear, actualYear, "year has failed");
        Assert.assertEquals(expectedMonth, actualMonth, "month has failed");
        Assert.assertEquals(expectedDay, actualDay, "day has failed");
    }

    /*
    TC #6: Selecting value from non-select dropdown
    1.Open Chrome browser
    2.Go to https://practice.cydeo.com/dropdown
    3.Click to non-select dropdown
    4.Select Facebook from dropdown
    5.Verify title is “Facebook -Log In or Sign Up”
     */
    @Test
    public void test6() {
        WebElement dropdown = webDriver.findElement(By.id("dropdownMenuLink"));
        dropdown.click();
        WebElement facebook = webDriver.findElement(By.linkText("Facebook"));
        facebook.click();

        String expectedTitle = "Facebook — Выполните вход или зарегистрируйтесь";
        String actualTitle = webDriver.getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);
    }
}
