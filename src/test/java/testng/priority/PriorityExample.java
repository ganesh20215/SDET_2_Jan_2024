package testng.priority;

import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 1)
    public void testCaseA(){
        System.out.println("test case of A");
    }

    @Test
    public void testCaseX(){
        System.out.println("test case of X");
		System.out.println("test case of XY");
    }

    @Test(priority = 'A')
    public void testCaseM(){
        System.out.println("test case of M");
    }

    @Test(priority = 4)
    public void testCaseF(){
        System.out.println("test case F");
    }

    @Test(priority = -5)
    public void testCaseO(){
        System.out.println("test case O");
    }
}
