package clarusway.tests;

import org.testng.annotations.Test;

public class C06_DescriptionVer1 {
    //Testle ilgili bilgileri açıklayan @Test annotationa eklenen ve genelde tek bir dizeden oluşan açıklamadır.
    @Test(description = "Description")
    public void test01() throws Exception {
        System.out.println("test01");
    }
    @Test
    public void test02() throws Exception {
        System.out.println("test02");
    }
    @Test
    public void test03() throws Exception {
        System.out.println("test03");
    }
    @Test
    public void test04() throws Exception {
        System.out.println("test04");
    }
}
