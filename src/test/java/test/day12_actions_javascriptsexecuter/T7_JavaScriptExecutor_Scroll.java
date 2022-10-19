package test.day12_actions_javascriptsexecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.WebDriverUtils;

public class T7_JavaScriptExecutor_Scroll {
    @Test
    public void jsScroll() {
        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("env") + "large");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        WebElement poweredBy = Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));
        js.executeScript("arguments[0].scrollIntoView(true)", poweredBy);
        WebDriverUtils.sleep(1);
        js.executeScript("arguments[0].scrollIntoView(true)", homeLink);
    }
}
