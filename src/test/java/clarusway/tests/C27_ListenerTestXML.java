package clarusway.tests;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;


public class C27_ListenerTestXML {
    //Bu class XML dosyasi ile listeners a bagliyoruz!!
    @Test
    public void test01(){
        System.out.println("Test01");
    }
    @Test
    public void test02(){
        System.out.println("Test02");
        throw new RuntimeException();
        //Test 2 fail oldugu icin 6 kez calisir
        //Listenerutils te count sayisi veriyor burayi
    }
    @Test
    public void test03(){
        System.out.println("Test03");
        throw new SkipException("Skipped");
    }
    @Test
    public void test04() throws InterruptedException {

        System.out.println("Test04");
        assertTrue(false);
        //Test 4 fail oldugu icin 6 kez calisir Listenerutils te count sayisi veriyor burayi
    }
    @Test
    public void test05() throws InterruptedException {

        System.out.println("Test05");

    }
    @Test
    public void test06() throws InterruptedException {

        System.out.println("Test06");

    }

}
