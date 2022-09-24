package test.day04_xpath_findElements_checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class T5_Checkboxes {
    public static void main(String[] args) {
        WebDriver webDriver = WebDriverFactory.getDriver("chrome");
        webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        webDriver.get("https://practice.cydeo.com/checkboxes");

        WebElement ch1 = webDriver.findElement(By.id("box1"));
        System.out.println("ch1.isSelected() <expecting false> = " + ch1.isSelected());

        WebElement ch2 = webDriver.findElement(By.xpath("(//form[@id='checkboxes']/input)[2]"));
        System.out.println("ch2.isSelected() <expecting true> = " + ch2.isSelected());

        System.out.println("After clicking them: ");
        ch1.click();
        ch2.click();
        System.out.println("ch1.isSelected() <expecting true> = " + ch1.isSelected());
        System.out.println("ch2.isSelected() <expecting false> = " + ch2.isSelected());


        webDriver.quit();
    }
}
