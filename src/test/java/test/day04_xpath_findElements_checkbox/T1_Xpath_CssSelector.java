package test.day04_xpath_findElements_checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class T1_Xpath_CssSelector {
    public static void main(String[] args) {
        WebDriver webDriver = WebDriverFactory.getDriver("chrome");
        webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        webDriver.get("https://practice.cydeo.com/forgot_password");

        WebElement homeLink = webDriver.findElement(By.cssSelector(".nav-link"));

        WebElement header = webDriver.findElement(By.cssSelector("#content > div > h2"));
        WebElement header1 = webDriver.findElement(By.cssSelector("div[class='example'] > h2"));
        WebElement header2 = webDriver.findElement(By.cssSelector("div.example > h2"));
        WebElement header3 = webDriver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        WebElement header4 = webDriver.findElement(By.xpath("(//*[.='Forgot Password'])[2]")); // there are two matching results -> we put (...)[2] to get second matching result

        WebElement eMail = webDriver.findElement(By.xpath("//div[@class = 'row']/div/label "));
        WebElement eMail1 = webDriver.findElement(By.xpath("//label[.='E-mail']"));
        WebElement eMail2 = webDriver.findElement(By.xpath("//label[contains(@for, 'email')]"));
                            // contains(attribute, attributeValue)


        WebElement inputEmail = webDriver.findElement(By.xpath("//div[@class = 'row']/div/input"));
        WebElement inputEmail1 = webDriver.findElement(By.cssSelector("button[id='form_submit'] > i"));

        WebElement btn = webDriver.findElement(By.cssSelector("button[type=\"submit\"]"));
        btn.click();

        WebElement poweredBy = webDriver.findElement(By.xpath("//div[text()='Powered by ']"));
        WebElement poweredBy1 = webDriver.findElement(By.xpath("//div[@style='text-align: center;']"));

        WebElement[] webElements = new WebElement[]{homeLink, header, eMail, inputEmail, btn, poweredBy};
        for (WebElement webElement : webElements) {
            if (webElement.getText().equals("")) continue;
            System.out.println(webElement.getText());
        }



        // verify all web elements are displayed
        // isDisplayed() method returns true if it is
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("header.isDisplayed() = " + header.isDisplayed());
        System.out.println("eMail.isDisplayed() = " + eMail.isDisplayed());
        System.out.println("btn.isDisplayed() = " + btn.isDisplayed());
        System.out.println("inputEmail.isDisplayed() = " + inputEmail.isDisplayed());
        System.out.println("poweredBy.isDisplayed() = " + poweredBy.isDisplayed());

        webDriver.quit();
    }
}
