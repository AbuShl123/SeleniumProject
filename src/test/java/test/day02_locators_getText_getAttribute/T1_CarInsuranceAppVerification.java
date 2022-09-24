package test.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CarInsuranceAppVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.qa1.excelsoirinsurance.com/login");

        String expected = "excelsoirinsurance"; // comes from requirement
        String actualUrl = driver.getCurrentUrl(); // come from browser
        if (actualUrl.contains(expected)) {
            System.out.println("Test Case 1: PASSED");
        } else {
            System.out.println("Test Case 2: FAILED");
        }

        String expectedTitle = "Login | Excelsoir Insurance";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test Case 2: PASSED");
        } else {
            System.out.println("Test Case 2: FAILED");
        }
    }
}
 // I will == I'll