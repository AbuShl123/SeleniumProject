package day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException{
        ChromeOptions options = new ChromeOptions();
        options.addArguments("lang=en-GB");

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.get("https://www.google.com");
//        Thread.sleep(1000);
        driver.navigate().to("https://jut.su/anime/");
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
//        Thread.sleep(1000);
        driver.navigate().back();
//        Thread.sleep(1000);
        driver.navigate().forward();
//        Thread.sleep(1000);
        driver.navigate().refresh();


        driver.navigate().to("https://www.google.com");
        currentTitle = driver.getTitle();
        System.out.println("title = " + currentTitle);
//      System.out.println(driver.getTitle());

        currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);


        //driver.close(); // closing only the current page
        // if there are several pages on the browsers, driver.quit() methods will close all of them
        driver.quit();
    }
}
