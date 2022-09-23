package test.tasks;

import org.openqa.selenium.WebDriver;

public final class MyTests {
    public static void test(String expected, String actual) {
        System.out.println(actual.equals(expected) ? "PASSED" : "FAILED");
    }

    public static void verifyTitle(String expectedTitle, WebDriver webDriver) {
        if (webDriver.getTitle().equals(expectedTitle)) {
            System.out.println("title test PASSED");
        } else {
            System.out.println("title test FAILED");
        }
    }

    public static void verifyTitleStartsWith(String expectedTitle, WebDriver webDriver) {
        if (webDriver.getTitle().startsWith(expectedTitle)) {
            System.out.println("title-starts-with test PASSED");
        } else {
            System.out.println("title test FAILED");
        }
    }

    public static void verifyUrl(String expectedUrl, WebDriver webDriver) {
        if (webDriver.getCurrentUrl().equals(expectedUrl)) {
            System.out.println("url test PASSED");
        } else {
            System.out.println("url test FAILED");
        }
    }

}
