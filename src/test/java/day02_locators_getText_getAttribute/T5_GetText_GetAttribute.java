package day02_locators_getText_getAttribute;

import MyOwnTesting.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_GetText_GetAttribute {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://practice.cydeo.com/registration_form");

        WebElement element = webDriver.findElement(By.tagName("h2"));
        System.out.println(element.getText());
        String expected = "Registration form";
        System.out.println(Test.assertEquals(expected, element.getText()));

        // verify the placeholder attribute is as expected
        element = webDriver.findElement(By.name("firstname"));
        expected = "first name";
        System.out.println(Test.assertEquals(expected, element.getAttribute("placeholder")));

        element.sendKeys("Abubakr");
    }
}
