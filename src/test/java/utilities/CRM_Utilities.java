package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CRM_Utilities {
    public static void login_crm(WebDriver webDriver, String password, String email) {
        webDriver.findElement(By.cssSelector("input[name='USER_LOGIN']"))
                .sendKeys(email);
        webDriver.findElement(By.name("USER_PASSWORD"))
                .sendKeys(password);

        webDriver.findElement(By.className("login-btn")).click();
    }
}
