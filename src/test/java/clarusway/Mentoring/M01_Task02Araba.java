package clarusway.Mentoring;

import org.testng.annotations.Test;

public class M01_Task02Araba {
    @Test
    public void arabaCalistir() throws Exception {
        System.out.println("arabaCalistir");
    }
    @Test(dependsOnMethods = "arabaCalistir")
    public void arabaSur() throws Exception {
        System.out.println("arabaSur");
    }
    @Test(dependsOnMethods = "arabaSur")
    public void arabaparkEt() throws Exception {
        System.out.println("arabaparkEt");
    }
    @Test(dependsOnMethods = "arabaparkEt")
    public void arabaDurdur() throws Exception {
        System.out.println("arabaDurdur");
    }

}
