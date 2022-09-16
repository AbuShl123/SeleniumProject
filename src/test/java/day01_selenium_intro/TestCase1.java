package day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
    public static void main(String[] args) throws InterruptedException {
        // Open Chrome browser
        // go to https://jut.su/anime/
        // verify the title is смотреть аниме на jut.su


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://jut.su");

        // verify the title is смотреть аниме на jut.su
        String expected = "Смотреть аниме на Jut.su";

        if (expected.equals(driver.getTitle())) {
            System.out.println("Test verifying title is PASSED");
        } else {
            System.out.println("Test verifying title is FAILED");
        }

        Thread.sleep(3000);

        WebElement m = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/ul/li[1]/a"));
        m.click();



        m = driver.findElement(By.xpath("//*[@id=\"anime_fs_17\"]/a/div/div[4]/div[1]"));
        m.click();



        m = driver.findElement(By.xpath("//*[@id=\"dle-content\"]/div/div[2]/a[1]"));
        m.click();


        m = driver.findElement(By.xpath("//*[@id=\"my-player\"]/button"));
        m.click();

    }
}
