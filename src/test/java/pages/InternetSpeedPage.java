package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InternetSpeedPage {
    public InternetSpeedPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//a[normalize-space()='Results']")
    public WebElement resultLink;

    @FindBy (xpath = "//span[.='Go']")
    public WebElement goButton;

    @FindBy (className = "gauge-speed-needle")
    public WebElement gaugeSpeedNeedle;

    @FindBy (className = "result-item-download")
    public WebElement downloadData;

    @FindBy (className = "result-item-upload")
    public WebElement uploadData;
}
