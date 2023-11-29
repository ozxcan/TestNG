package clarusway.tests;

import org.testng.annotations.Test;

public class C05_TimeOut {
        /*
- Test için bir timeOut - zaman aşımı değeri belirlemeye yardımcı olur (genellikle milisaniye olarak kullanılır).
 Test belirtilen zaman aşımı değerinden daha fazlasını alırsa, test başarısız olarak işaretlenir.
- Yöntemin makul bir süre içinde geri döndüğünden emin olmak için bu zaman aşımını bir performans testi yapmak için kullanabiliriz.
     */

    @Test(timeOut = 5000)
    public void test01() throws Exception {
        Thread.sleep(4000);
        System.out.println("test01");
    }
    @Test(timeOut = 4000)
    public void test02() throws Exception {
        Thread.sleep(4000);
        System.out.println("test02");
    }
    @Test(timeOut = 6000)
    public void test03() throws Exception {
        Thread.sleep(4000);
        System.out.println("test03");
    }
}
