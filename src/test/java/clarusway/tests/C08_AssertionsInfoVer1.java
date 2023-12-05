package clarusway.tests;

import org.testng.Assert;
import org.testng.annotations.Test;



public class C08_AssertionsInfoVer1 {

    @Test
    public void hardAssertionTest () throws Exception {
        System.out.println("Assertion 1: ");
        Assert.assertEquals("a","a","Actual and Expected result did not match");
        System.out.println("1. Assertion sonrasi ");
        System.out.println("\n Assertion 2: ");
        Assert.assertTrue("Hello".contains("loX"),"Strin does not contains 'substring'");

    }
}
