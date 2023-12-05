package clarusway.tests;

import clarusway.utilities.ParameterBrowserTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.AssertJUnit.assertTrue;

public class C19_CrossBrowserTest extends ParameterBrowserTestBase {
    /*
    Go to URL: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
    Enter username Admin
    Enter password admin123
    Assert that user singed in
    Doing Cross Browser Testing.
*/
    @Test
    public void crossBrowserTest() throws Exception {

//        Go to URL: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//        Enter username Admin
        Thread.sleep(500);
        driver.findElement(By.xpath("//input[@name='username']")).
                sendKeys("Admin");

//        Enter password admin123
        Thread.sleep(500);
        driver.findElement(By.xpath("//input[@name='password']")).
                sendKeys("admin123");

       // Click login button
        Thread.sleep(500);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
//        Assert that user singed in

        Thread.sleep(1000);
        WebElement userDropDown = driver.findElement(By.xpath("//li[@class='oxd-userdropdown']"));
/*   soft assert ile assert islemi
      SoftAssert softAssert=  new SoftAssert();
      softAssert.assertTrue(userDropDown.isDisplayed());
        softAssert.assertAll();

 */
        //hard assert islemi
        assertTrue(userDropDown.isDisplayed());

//        Doing Cross Browser Testing.


    }

}
