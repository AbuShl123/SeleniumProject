package utilities;

import org.openqa.selenium.WebDriver;
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
}
