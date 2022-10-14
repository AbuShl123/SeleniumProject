package test.day09_properties_configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import test.base.TestBase;
import utilities.ConfigurationReader;

import static org.testng.Assert.*;

public class T3_Config_Practice extends TestBase {
    @Test
    public void google_search_test() {
        webDriver.navigate().to(ConfigurationReader.getProperty("google.url"));
        WebElement input = webDriver.findElement(By.name("q"));
        input.sendKeys("apple", Keys.ENTER);

        String expected = "apple - Поиск в Google";

        assertEquals(webDriver.getTitle(), expected);
    }
}
