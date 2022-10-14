package test.day09_properties_configuration;

import org.testng.annotations.Test;
import test.base.TestBase;
import utilities.CRM_Utilities;

import static org.testng.Assert.*;

public class T1_CRM_Login extends TestBase {

    @Test
    public void test1() {
        webDriver.navigate().to("https://login1.nextbasecrm.com/");
        CRM_Utilities.login_crm(webDriver, "hr2@cydeo.com", "UserUser");
        System.out.println("webDriver.getTitle() = " + webDriver.getTitle());
        assertEquals(webDriver.getTitle(), "Portal");
    }

}
