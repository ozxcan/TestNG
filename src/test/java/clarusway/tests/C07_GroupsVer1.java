package clarusway.tests;

import org.testng.annotations.Test;

public class C07_GroupsVer1 {
    @Test
    public void test01(){
        System.out.println("Test 01");
    }

    @Test
    public void test02(){
        System.out.println("Test 02");
    }

    @Test(groups="Group A")
    public void test03(){
        System.out.println("Test 03");
    }

    @Test
    public void test04(){

        System.out.println("Test 04");

    }

    @Test(groups="Group A")
    public void test05(){

        System.out.println("Test 05");

    }
@Test(dependsOnGroups = "Group A")
//Sadece gruptan calisirsa test03 ,test 05 ve Group A test i calisir.
// class tan calisirsa hepsi sirayla calisir.
    public void groupATest () throws Exception{

    System.out.println("Group A Test");
}
}
