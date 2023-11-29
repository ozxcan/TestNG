package clarusway.tests;

import org.testng.annotations.Test;

public class C02_Priority {
    @Test(priority = 4)
    public void test01() throws Exception {
        System.out.println("test01");
    }
    @Test(priority = 3)
    public void test02() throws Exception {
        System.out.println("test02");
    }
    @Test(priority = 2)
    public void test03() throws Exception {
        System.out.println("test03");
    }
    @Test(priority = 1)
    public void test04() throws Exception {
        System.out.println("test04");
    }
    @Test(priority = -5)
    public void test05() throws Exception {
        System.out.println("test05");
    }
}
