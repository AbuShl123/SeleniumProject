package test.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class AmazonPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = WebDriverFactory.getDriver("chrome");


        webDriver.get("https://amazon.com");
        webDriver.findElement(By.cssSelector("#nav-logo-sprites")).click();
        WebElement defSlide;
        try {
            defSlide = webDriver.findElement(By.xpath("//img[contains(@alt, 'Shop Computers and Accessories')]"));
        } catch (Exception e) {
            defSlide = webDriver.findElement(By.xpath("//img[contains(@alt, 'Shop the home store')]"));
        }

        System.out.println("defSlide.isDisplayed() = " + defSlide.isDisplayed());

        WebElement forwBtn = webDriver.findElement(By.cssSelector("a.a-carousel-goto-nextpage"));
        System.out.println("forwBtn.isDisplayed() = " + forwBtn.isDisplayed());
        forwBtn.click();
        System.out.println("defSlide.isDisplayed() = " + defSlide.isDisplayed());

        WebElement backBtn = webDriver.findElement(By.xpath("//div[@data-csa-c-type='action']/a"));
        System.out.println("backBtn.isDisplayed() = " + backBtn.isDisplayed());
        backBtn.click();
        System.out.println("defSlide.isDisplayed() = " + defSlide.isDisplayed());

        Thread.sleep(2000);
        webDriver.quit();
    }
}
