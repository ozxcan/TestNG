package clarusway.tests;

import org.testng.annotations.Test;

public class C06_Description {
    //Testle ilgili bilgileri açıklayan @Test annotationa eklenen ve genelde tek bir dizeden oluşan açıklamadır.

    @Test(description = "US01_TC03")//US01_TC03
    void test01(){
        System.out.println("Test 01");
    }

    @Test(description = "This is test case 05")
    void test02(){
        System.out.println("Test 02");
    }

    @Test(description = "This is test case 15")
    void test03(){
        System.out.println("Test 03");
    }

    @Test(priority = -5, dependsOnMethods = "test02", enabled = true, timeOut = 3000, description = "Yanyana tüm attribute'ler eklenebilir")
    void test04(){//depend bulunduğu için öncelik bağlı olunan class'ın çalışma sırasıdır.
        System.out.println("Test 04");
    }

}
