package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    public static WebDriver getDriver(String browserType) {
        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }
        if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }
        if (browserType.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        }
        throw new RuntimeException("Illegal browser type: " + browserType);
    }

    public static WebDriver getDriver(String browserType, ChromeOptions opt) {
        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver(opt);
        }
        if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }
        if (browserType.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        }
        throw new RuntimeException("Illegal browser type: " + browserType);
    }

    public static void test(String expected, String actual) {
        System.out.println(actual.equals(expected) ? "PASSED" : "FAILED");
    }
}
