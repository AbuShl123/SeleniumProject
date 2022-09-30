package test.day05_testing_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T1_RadioButton {
    public static <WebElements> void main(String[] args) {
        WebDriver webDriver = WebDriverFactory.getDriver("chrome");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.navigate().to("https://practice.cydeo.com/radio_buttons");

        WebElement hockeyBtn = webDriver.findElement(By.xpath("//input[@id='hockey']"));
        hockeyBtn.click();

        if(hockeyBtn.isSelected()) {
            System.out.println("hockeyBtn is Selected");
        } else {
            System.out.println("hockeyBtn is not Selected");
        }

       List<WebElement> sportRadios = webDriver.findElements(By.xpath("//input[@name='sport']"));

        for (WebElement e : sportRadios) {
            e.click();
            System.out.println("e.isSelected() = " + e.isSelected());
        }
    }
}
