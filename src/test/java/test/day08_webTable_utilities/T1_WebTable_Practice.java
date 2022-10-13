package test.day08_webTable_utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.base.TestBase;
import utilities.WebDriverFactory;
import utilities.WebDriverUtils;
import utilities.WebTableUtils;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Practice extends TestBase {
    @Test
    public void test1() {
        WebElement bobMartinName = webDriver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[7]/td[2]"));
        String expected = "Bob Martin";
        Assert.assertEquals(bobMartinName.getText(), expected);

        WebElement date = webDriver.findElement(By.cssSelector("table.SampleTable > tbody > tr ~ tr+tr+tr+tr+tr+tr > td ~ td+td+td+td"));
        expected = "12/31/2021";
        Assert.assertEquals(date.getText(), expected);
    }

    @Test
    public void test2() {
        System.out.println(WebTableUtils.returnOrderDay(webDriver, "Alexandra Gray"));
        WebTableUtils.orderVerify(webDriver, "Alexandra Gray", "04/15/2021");

        WebDriverUtils.verifyTitle(webDriver, "Web Tables");
    }

    @Test
    public void test3() {
        WebTableUtils.orderVerify(webDriver, "Robert Baratheon", "12/04/2021");
    }
}
