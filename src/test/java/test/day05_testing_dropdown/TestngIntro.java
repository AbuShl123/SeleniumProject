package test.day05_testing_dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class TestngIntro {

    @Test (priority = 1)
    public void test1() {
        System.out.println("test1 is running...");
        String expected = "apple";
        String actual = "apple";
        Assert.assertEquals(expected, actual, "TEST IS FAILED");
    }

    @Test (priority = 2)
    public void test2() {
        System.out.println("test2 is running");
        String expected = "apple";
        String actual = "apple";
        Assert.assertTrue(actual.equals(expected), "title is not matching");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("---> Before method is running");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("---> After method is running");
    }

    @BeforeClass
    public void setUp() {
        System.out.println("*****Before class method is running*****");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("*****After class method is running*****");
    }
}
