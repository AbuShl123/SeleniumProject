package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WebDriverUtils {
    // methods are static. Because we do not want to create an object to call these methods. We just want to call those methods by simply using class name. That's why they are static.

    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds* 1000L);
        } catch (InterruptedException ignored) {}
    }


    public static void verifyTitle(WebDriver webDriver, String expectedTitle) {
        Assert.assertEquals(webDriver.getTitle(), expectedTitle);
    }


    public static void waitForInvisibilityOf(WebElement element) {
        new WebDriverWait(Driver.getDriver(), 5)
                .until(ExpectedConditions.invisibilityOf(element));
    }
}
