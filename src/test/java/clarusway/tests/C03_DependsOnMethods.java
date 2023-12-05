package clarusway.tests;

import org.testng.annotations.Test;

public class C03_DependsOnMethods {
     /*
- İkinci test methodu birinci test methoduna bağımlı olmak istediğinde bu attribute kullanılır.
- Birinci test methodu başarısız olursa, birinci test methodundaki bağımlı method, yani ikinci test methodu çalışmayacaktır.
- Bir parametrede bir method veya birden çok method iletilebilir.
  */
     @Test
     public void loginTest() {
         System.out.println("Login Test");
     }
    @Test(dependsOnMethods = "loginTest")
    public void homepageTest() {
        System.out.println("Homepage Test");
    }
    @Test(dependsOnMethods = {"loginTest","homepageTest"})
    public void smokeTest()  {
        System.out.println("smokeTest");
    }

}
