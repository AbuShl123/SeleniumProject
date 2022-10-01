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
public class T5_WindowsPractice {

    WebDriver webDriver;

    @BeforeMethod
    public void setUp() {
        webDriver = WebDriverFactory.getDriver("chrome");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.navigate().to("https://practice.cydeo.com/windows");
    }

    @AfterMethod
    public void tearDown() {
        webDriver.quit();
    }

    @Test
    public void test1() {
        String mainWindow = webDriver.getWindowHandle();
        String actual = webDriver.getTitle();
        String expected = "Windows";

        Assert.assertEquals(actual, expected);

        System.out.println("Before opening new Window: " + actual);

        WebElement a = webDriver.findElement(By.xpath("//a[.='Click Here']"));

        a.click();
        actual = webDriver.getTitle();
        System.out.println("After opening new window: " + actual);

        // switching to a new window (tab)
        for (String eachWindow : webDriver.getWindowHandles()) {
            webDriver.switchTo().window(eachWindow);
            System.out.println(webDriver.getTitle());
        }

        actual = webDriver.getTitle();
        expected = "New Window";
        Assert.assertEquals(actual, expected);

        webDriver.switchTo().window(mainWindow);
    }
}
