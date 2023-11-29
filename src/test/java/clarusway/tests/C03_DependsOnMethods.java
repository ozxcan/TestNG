package clarusway.tests;

import org.testng.annotations.Test;

public class C03_DependsOnMethods {
     /*
- İkinci test methodu birinci test methoduna bağımlı olmak istediğinde bu attribute kullanılır.
- Birinci test methodu başarısız olursa, birinci test methodundaki bağımlı method, yani ikinci test methodu çalışmayacaktır.
- Bir parametrede bir method veya birden çok method iletilebilir.
  */
     @Test
     public void loginTest() throws Exception {
         System.out.println("Login Test");
     }
    @Test(dependsOnMethods = "loginTest")
    public void homepageTest() throws Exception {
        System.out.println("Homepage Test");
    }
    @Test(dependsOnMethods = {"loginTest","homepage"})
    public void smokeTest() throws Exception {
        System.out.println("smokeTest");
    }

}
