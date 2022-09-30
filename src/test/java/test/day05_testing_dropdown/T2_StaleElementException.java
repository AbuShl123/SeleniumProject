package test.day05_testing_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class T2_StaleElementException {
    public static void main(String[] args) {
        WebDriver webDriver = WebDriverFactory.getDriver("Chrome");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.navigate().to("https://practice.cydeo.com/add_remove_elements/");

        WebElement addElement = webDriver.findElement(By.xpath("//*[.='Add Element']"));
        addElement.click();

        WebElement secondBlock = webDriver.findElement(By.xpath("//div[@id='elements']/button"));
        System.out.println("secondBlock.isDisplayed() = " + secondBlock.isDisplayed());
        secondBlock.click();
        System.out.println("deleting...");

        try {
            System.out.println("secondBlock.isDisplayed() = " + secondBlock.isDisplayed()); // <- should throw an exception
        } catch (StaleElementReferenceException e) {
            System.out.println(e.getMessage());
        }

        webDriver.quit();
    }
}
