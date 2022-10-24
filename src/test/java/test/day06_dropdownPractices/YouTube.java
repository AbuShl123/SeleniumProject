package test.day06_dropdownPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class YouTube {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = WebDriverFactory.getDriver("chrome");
        webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();

        webDriver.get("https://youtube.com");

        WebElement searchBox = webDriver.findElement(By.cssSelector("div[id='center'] form input"));
        searchBox.click();
        searchBox.sendKeys("Chopin nocturne", Keys.ENTER);

        WebElement video = webDriver.findElement(By.cssSelector("div[id='contents'] > ytd-video-renderer a"));
        WebElement videoTitle = webDriver.findElement(By.cssSelector("div[id='contents'] > ytd-video-renderer yt-formatted-string"));

        System.out.println("videoTitle.isDisplayed() = " + videoTitle.isDisplayed());
        System.out.println("videoTitle.getText() = " + videoTitle.getText());

        video.click();
    }
}
