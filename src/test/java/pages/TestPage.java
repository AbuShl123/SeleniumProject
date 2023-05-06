package pages;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPage {
    public WebDriver driver;
    SearchContext searchContext;

    @FindBy(name = "q")
    WebElement searchInput;

    public TestPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void search(String searchMaterial) {
        searchInput.sendKeys(searchMaterial);
    }
}
