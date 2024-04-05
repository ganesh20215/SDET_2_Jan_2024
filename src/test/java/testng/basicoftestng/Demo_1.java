package testng.basicoftestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo_1 {

    @BeforeClass
    public void beforeClassMethodForDemo() {
        System.out.println("before Class Method For Demo 1");
    }

    @AfterClass
    public void afterClassMethodForDemo() {
        System.out.println("After Class Method For Demo 1");
    }

    @Test
    public void testCase_P() {
        System.out.println("test case P");
    }

    @Test
    public void testCase_Q() {
        System.out.println("test case Q");
    }
}
