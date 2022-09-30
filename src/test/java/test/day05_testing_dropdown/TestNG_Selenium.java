package test.day05_testing_dropdown;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {
    WebDriver webDriver;

    @BeforeClass
    public void setUp() {
        webDriver = WebDriverFactory.getDriver("Chrome");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void googleTitle() {
        webDriver.navigate().to("https://google.com");

        String actual = webDriver.getTitle();
        Assert.assertEquals("Google", actual, "title is not matching");
    }

    @AfterClass
    public void tearDown() {
        webDriver.quit();
    }
}
