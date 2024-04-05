package testng.failtestcases;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;

public class FailTestCaseExample {


    @Test
    public void testCase_11() {
        Assert.assertTrue(false);
        System.out.println("Test case 11");
    }

    @Test
    public void testCase_22() {
        System.out.println("Test case 22");
    }

    @Test
    public void testCase_33() {
        Assert.assertTrue(false);
        System.out.println("Test case 33");
    }

    @Test
    public void testCase_44() {
        System.out.println("Test case 44");
    }

    @Test
    public void testCase_55() {
        System.out.println("Test case 55");
    }
}
