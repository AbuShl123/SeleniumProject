package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class LibraryLoginPage {

    public LibraryLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id="inputEmail")
    public WebElement inputUserName;

    @FindBy (xpath = "//input[@id='inputPassword']")
    public WebElement inputPassword;

    @FindBy (xpath = "//button")
    public WebElement signInButton;

    @FindBy (xpath = "//div[.='This field is required.']/div[1]")
    public WebElement errorMessage;

    @FindBy (xpath = "//div[.='Please enter a valid email address.']/div[1]")
    public WebElement invalidEmailError;

    @FindBy (xpath = "//div[.='Sorry, Wrong Email or Password']")
    public WebElement wrongEmailOrPass;

}
