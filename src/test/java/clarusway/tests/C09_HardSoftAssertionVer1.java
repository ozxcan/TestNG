package clarusway.tests;

import clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C09_HardSoftAssertionVer1 extends TestBase {
    /*
    Test Case1: Positive Login Test
    Open page https://practicetestautomation.com/practice-test-login/
    Type username student into Username field
    Type password Password123 into Password field
    Click Submit button.
    Verify new page URL contains practicetestautomation.com/logged-in-successfully/
    Verify new page contains expected text ('Congratulations' or 'successfully logged in')
    Verify button Log out is displayed on the new page.
*/

    @Test
    public void hardAssertionTest() throws Exception {
        //        Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");

//        Type username student into Username field
        driver.findElement(By.id("username")).sendKeys("student");

//        Type password Password123 into Password field
        driver.findElement(By.id("password")).sendKeys("Password123");

//        Click Submit button.
        driver.findElement(By.id("submit")).click();

//        Verify new page URL contains practicetestautomation.com/logged-in-successfully/
        Assert.assertTrue(driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"));
//       Verify new page contains expected text ('Congratulations' or 'successfully logged in')
        Assert.assertTrue(driver.findElement(By.tagName("strong")).getText().contains("Congratulations"));
//        Verify button Log out is displayed on the new page.
        Assert.assertTrue(driver.findElement(By.linkText("Log out")).isDisplayed());
    }


    @Test
    public void softAssertionTest() throws Exception {
        //        Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");

//        Type username student into Username field
        driver.findElement(By.id("username")).sendKeys("student");

//        Type password Password123 into Password field
        driver.findElement(By.id("password")).sendKeys("Password123");

//        Click Submit button.
        driver.findElement(By.id("submit")).click();

//        Verify new page URL contains practicetestautomation.com/logged-in-successfully/
        SoftAssert softAssert=new SoftAssert(); // sadece obje olusturulur

        softAssert.assertTrue(driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"));
//       Verify new page contains expected text ('Congratulations' or 'successfully logged in')
       softAssert.assertTrue(driver.findElement(By.tagName("strong")).getText().contains("Congratulations"));
//        Verify button Log out is displayed on the new page.
        softAssert.assertTrue(driver.findElement(By.linkText("Log out")).isDisplayed());

        softAssert.assertAll();
        System.out.println("-----------");
    }


}
