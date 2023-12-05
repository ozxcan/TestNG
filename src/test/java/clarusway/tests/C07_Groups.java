package clarusway.tests;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class C07_Groups {

    //TestNG'de @BeforeGroups ve dependsOnGroups özellikleri, belirli bir grup testlerin çalışmadan önce başka bir grup testin tamamlanmasına bağımlılığını sağlar.

    @BeforeGroups(groups = "Group A")//Group A olarak gruplanmış testlerden önce bir kez çalışır
    public void beforeGroupA(){
        System.out.println("Before Group A");
    }

    @BeforeGroups(groups = "Group B")
    public void beforeGroupB(){
        System.out.println("Before Group B");
    }

    @AfterGroups(groups = "Group B")
    public void afterGroupB(){
        System.out.println("After Group B");
    }


    @Test(groups = "Group B")
    public void test01(){
        System.out.println("Test 01");
    }

    @Test
    public void test02(){
        System.out.println("Test 02");
    }

    @Test(groups = "Group A")
    public void test03(){
        System.out.println("Test 03");
    }

    @Test(groups = "Group B")
    public void test04(){
        System.out.println("Test 04");
    }

    @Test(groups = "Group A")
    public void test05(){
        System.out.println("Test 05");
    }

    @Test(dependsOnGroups = "Group A")//Bu test Group A testlerinin çalışmasına bağlıdır. Önce group testleri çalışır.
    public void groupATest(){
        System.out.println("Group A Test");
    }

    @Test(dependsOnGroups = "Group B")
    public void groupBTest(){
        System.out.println("Group B Test");
    }

}