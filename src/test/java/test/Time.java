package test;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.TestPage;
import utilities.Driver;
import utilities.WebDriverFactory;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Time {
    public static int recur(int n) {
        if (n >= 7 && n <= 10) return n;
        return recur(n-1);
    }


    public static void main(String[] args) throws InterruptedException {
        TestPage page = new TestPage(Driver.getDriver());
        Driver.getDriver().navigate().to("https://google.com");
        page.search("anime");
        Thread.sleep(5000);
    }
}
