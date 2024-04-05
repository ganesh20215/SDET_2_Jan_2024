package testng.basicoftestng;

import org.testng.annotations.*;

public class BeforeAfterMethodExample_2 {

    @BeforeClass
    public void defineByClass(){
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void preRequsite(){
        System.out.println("Before Method");
    }

    @Test
    public void testCase_1(){
        System.out.println("test case 1");
    }

    @Test
    public void testCase_2(){
        System.out.println("test case 2");
    }

    @Test
    public void testCase_3(){
        System.out.println("test case 3");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("After Method");
    }

    @AfterClass
    public void defineAfterByClass(){
        System.out.println("After Class");
    }
}
