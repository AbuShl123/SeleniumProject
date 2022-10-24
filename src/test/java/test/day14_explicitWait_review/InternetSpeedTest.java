package test.day14_explicitWait_review;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.InternetSpeedPage;
import utilities.Driver;

public class InternetSpeedTest {
    @Test
    public void internet_test(){
        Driver.getDriver().navigate().to("https://www.speedtest.net");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 25);

        InternetSpeedPage page = new InternetSpeedPage();

        wait.until(ExpectedConditions.visibilityOf(page.resultLink)); // this is here just like that

        page.goButton.click();

        wait.until(ExpectedConditions.visibilityOf(page.gaugeSpeedNeedle));
        wait.until(ExpectedConditions.invisibilityOf(page.gaugeSpeedNeedle));

        System.out.println(page.downloadData);
        System.out.println(page.uploadData);
    }
}
