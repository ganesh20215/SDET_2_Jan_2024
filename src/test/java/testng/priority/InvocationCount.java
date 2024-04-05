package testng.priority;

import org.testng.annotations.Test;

public class InvocationCount {


    @Test(invocationCount = 1000, invocationTimeOut = 1)
    public void testCaseMethod(){
        System.out.println("Test Case Method");
    }
}
