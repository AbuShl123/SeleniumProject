package test.day13_pom_explicitWait;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
import utilities.Driver;

public class LibraryLoginPage {
    @Test
    public void test1() {
        Driver.getDriver().navigate().to("https://library1.cydeo.com/login.html");

        pages.LibraryLoginPage data = new pages.LibraryLoginPage();

        data.signInButton.click();
        assertTrue(data.errorMessage.isDisplayed());

        data.inputUserName.sendKeys("asdasd");
        data.signInButton.click();
        String expected = "Please enter a valid email address.";
        assertEquals(data.invalidEmailError.getText(), expected);
    }
}
