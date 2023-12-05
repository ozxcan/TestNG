package clarusway.tests;

import org.testng.annotations.*;

public class C01_Annotations {
    /*
@BeforeSuite-@AfterSuite : Bu paketteki tüm testlerden önce/sonra çalışır.Sadece bir kere çalışır.
@BeforeTest-@AfterTest :Tüm test methodlarından önce/sonra çalışır.Sadece bir kere çalışır.
@BeforeClass-@AfterClass :Herhangi belirli test grubundan önce/sonra çalışır.Sadece bir kere çalışır.
@BeforeGroups-@AfterGroups : Bir test sınıfındaki tüm test yöntemlerinden önce/sonra çalışır.Sadece bir kere çalışır.
@BeforeMethod-@AfterMethod :Her test methodundan önce/sonra çalışır

kisaltmi calisma siralari= SaTiCiMesut
 */
     /*
Create a class.
Create 3 test methods.
Use TestNG annotations that can be used in the class.
Interpret output in console.
 */
//    @BeforeSuite
//    public void beforeSuite() throws Exception {
//        System.out.println("BeforeSuite");
//
//    }
//    @AfterSuite
//    public void afterSuite() throws Exception {
//        System.out.println("AfterSuite");
//    }
//    @BeforeTest
//    public void before() throws Exception {
//        System.out.println("beforeTest");
//    }
//    @AfterClass
//    public void after() throws Exception {
//        System.out.println("afterTest");
//    }
//
//    @BeforeClass
//    public void beforeClass() throws Exception {
//        System.out.println("BeforeClass"); //sadece bir kez tüm metodlardan önce calisir.
//    }
//    @AfterClass
//    public void afterClass() throws Exception {
//        System.out.println("AfterClass"); // bütün testlerden sonra birkez calisir!!!
//    }
//
//    @BeforeMethod // Her metoddan önce calisir.
//    public void setUp() throws Exception {
//        System.out.println("BeforeMethod");
//    }
//    @AfterMethod
//    public void tearDown() throws Exception {
//        System.out.println("AfterMethod");
//    }
    @Test(dependsOnMethods = "test02" )
    public void test01()  {
        System.out.println("test01");
    }
    @Test
    public void test02() {
        System.out.println("test02");
    }
    @Test
    public void test03() {
        System.out.println("test03");
    }

}
