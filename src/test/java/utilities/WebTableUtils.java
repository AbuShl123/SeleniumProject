package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {
    public static String returnOrderDay(WebDriver webDriver, String customerName) {
        String xPath = "//td[.='" + customerName + "']/following-sibling::td[3]";
        WebElement date = webDriver.findElement(By.xpath(xPath));

        return date.getText();
    }

    public static void orderVerify(WebDriver webDriver, String customerName, String expectedOrderDate) {
        String actual = returnOrderDay(webDriver, customerName);
        Assert.assertEquals(actual, expectedOrderDate);
    }
}
