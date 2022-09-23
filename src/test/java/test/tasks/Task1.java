package test.tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://www.qa1.excelsoirinsurance.com/login");

        MyTests.verifyUrl("excelsoirinsurance", webDriver);

        MyTests.verifyTitle("Login | Excelsoir Insurance", webDriver);

        webDriver.quit();
    }
}
