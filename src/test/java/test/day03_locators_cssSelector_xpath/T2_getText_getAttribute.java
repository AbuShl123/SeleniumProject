package test.day03_locators_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class T2_getText_getAttribute {
    public static void main(String[] args) {
        WebDriver webDriver = WebDriverFactory.getDriver("chrome");

        webDriver.get("https://login1.nextbasecrm.com/");

        String expected = "Remember me on this computer";
        String actual = webDriver.findElement(By.className("login-item-checkbox-label")).getText();

        WebDriverFactory.test(expected, actual);

        WebElement forget = webDriver.findElement(By.className("login-link-forgot-pass"));
        WebDriverFactory.test("Forgot your password?".toUpperCase(), forget.getText());

        WebDriverFactory.test(webDriver.getCurrentUrl() + "?forgot_password=yes", forget.getAttribute("href"));

        webDriver.quit();
    }
}
