package clarusway.tests;

import org.testng.annotations.Test;

public class C11_XMLFilesGroups {

    @Test(groups = "C")
    public void test01() {
        System.out.println("Test 1   -  C Test");
    }
    @Test(groups = "B")
    public void test02() {
        System.out.println("Test 2   -  B Test");
    }


    @Test(groups = "A")
    public void test03() {
        System.out.println("Test 3   -  A Test");
    }

    @Test(groups = "C")
    public void test04() {
        System.out.println("Test 4    -  C Test");
    }

    @Test(groups = "A")
    public void test05() {
        System.out.println("Test 5  -  A Test");
    }

    @Test(groups = "B")
    public void test06() {
        System.out.println("Test 6   -  B Test");
    }

    @Test(groups = "B")
    public void test07() {
        System.out.println("Test 7   -  B Test");
    }

    @Test(groups = "A")
    public void test08() {
        System.out.println("Test 8  -  A Test");
    }


}
