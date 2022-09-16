package MyOwnTesting;

import static org.junit.Assert.assertEquals;

public final class Test {

    public static String assertEquals(String expected, String actual) {
        if (actual.equals(expected)) {
            return "Test PASSED";
        }
        return "Test FAILED";
    }

}
