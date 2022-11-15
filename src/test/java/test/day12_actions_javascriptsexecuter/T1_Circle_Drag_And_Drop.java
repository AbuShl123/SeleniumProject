package test.day12_actions_javascriptsexecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import utilities.Driver;

public class T1_Circle_Drag_And_Drop {

    @Test
    public void drag_and_drop_test() {
        Driver.getDriver().navigate().to("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement acceptCookies = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptCookies.click();

        WebElement circle = Driver.getDriver().findElement(By.cssSelector("div#draggable"));

        WebElement areaToDrop = Driver.getDriver().findElement(By.cssSelector("div#droptarget"));

        Actions actions = new Actions(Driver.getDriver());

        //actions.clickAndHold(circle).moveToElement(areaToDrop).release().perform();

        actions.dragAndDrop(circle, areaToDrop).perform();
        String expected = "You did great!";

        assertEquals(areaToDrop.getText(), expected, areaToDrop.getText());
    }

}
