package testng.basicoftestng;

import org.testng.annotations.*;

public class Check_2 {

    @BeforeTest
    public void beforeTestMethod() {
        System.out.println("Before Test Method");
    }

    @AfterTest
    public void afterTestMethod() {
        System.out.println("After Test Method");
    }

    @BeforeClass
    public void beforeClassMethodForDemo() {
        System.out.println("before Class Method For Check 2");
    }

    @AfterClass
    public void afterClassMethodForDemo() {
        System.out.println("After Class Method For Check 2");
    }

    @Test
    public void testCase_X() {
        System.out.println("test case X");
    }

    @Test
    public void testCase_Y() {
        System.out.println("test case Y");
    }
}
