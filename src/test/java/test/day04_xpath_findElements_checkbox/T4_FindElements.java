package test.day04_xpath_findElements_checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_FindElements {
    public static void main(String[] args) {
        WebDriver webDriver = WebDriverFactory.getDriver("chrome");
        webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        webDriver.get("https://practice.cydeo.com/abtest");

        List<WebElement> webElements = webDriver.findElements(By.tagName("a"));

        System.out.println(webElements.size());
        for (WebElement  webElement : webElements){
            System.out.println("webElement.getText() = " + webElement.getText());
        }
        for (WebElement webElement : webElements) {
            System.out.println("webElement.getAttribute(\"href\") = " + webElement.getAttribute("href"));
        }

        webDriver.quit();
    }
}
