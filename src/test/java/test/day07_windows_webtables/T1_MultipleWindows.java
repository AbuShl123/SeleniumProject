package test.day07_windows_webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class T1_MultipleWindows {

    WebDriver webDriver = WebDriverFactory.getDriver("chrome");

    @BeforeMethod
    public void setUp() {
        webDriver = WebDriverFactory.getDriver("chrome");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.navigate().to("https://practice.cydeo.com/windows");
        webDriver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {

    }

    @Test
    public void multiple_windows_test() {
        Assert.assertEquals(webDriver.getTitle(), "Windows");

        WebElement clickHere = webDriver.findElement(By.linkText("Click Here"));
        clickHere.click();

        WebElement cydeoPage = webDriver.findElement(By.linkText("CYDEO"));
        cydeoPage.click();

        List<String> taps = new ArrayList<>(webDriver.getWindowHandles());
        String web = webDriver.getWindowHandle();
        webDriver.switchTo().window(taps.get(1));

        Assert.assertEquals(webDriver.getTitle(), "Cydeo");

        webDriver.switchTo().defaultContent();
    }

}
