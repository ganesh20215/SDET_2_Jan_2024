package testng.priority;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroup {


    @Test(groups = {"smoke"})
    public void verifyLogin() {
        Assert.assertTrue(false);
        System.out.println("Verify Login");
         System.out.println("Verify Test");
    }

    @Test(dependsOnGroups = {"smoke"})
    public void verifyFundTransfer() {
        System.out.println("Verify Fund Transfer");
    }

    @Test
    public void verifyCardManagement() {
        System.out.println("Verify Card Management");
    }

    @Test
    public void verifyCashBackOffer() {
        System.out.println("Verify CashBack Offer");
    }
}
