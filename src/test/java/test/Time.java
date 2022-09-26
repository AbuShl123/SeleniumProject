package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class Time {
    public static void main(String[] args) {
        WebDriver webDriver = WebDriverFactory.getDriver("chrome");

        webDriver.get("https://jut.su");
        WebElement animeBtn = webDriver.findElement(By.cssSelector("div.widget > ul > li > a"));
        animeBtn.click();

        WebElement attackOnTitan = webDriver.findElement(By.xpath("//div[.='Атака титанов']"));

        webDriver.navigate().back();

        attackOnTitan.click();

        webDriver.quit();
    }
}
