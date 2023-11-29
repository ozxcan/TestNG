package clarusway.Mentoring;

import org.testng.annotations.Test;

public class M01_Task01 {
//    Alışverş yapmak istiyorum. İlgili sitenin şöyle bir requirement ı var .
//    Üye olmadan alişveriş yapamıyoruz. Alışveriş yap testi ayrı.
//    Uye ol testi ayrı üye giriş yap testi ayrı olacak şekilde bir şema krabilir misin ?

    @Test
    public void alisverisYap() throws Exception {
        System.out.println("alisverisYap");
    }
    @Test(dependsOnMethods = "alisverisYap")
    public void uyeOl() throws Exception {
        System.out.println("uyeOl");
    }
    @Test(dependsOnMethods = {"uyeOl","alisverisYap"})
    public void girisYap() throws Exception {
        System.out.println("girisYap");
    }
}
