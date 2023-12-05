package clarusway.tests;

import clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C10_SoftAssertion extends TestBase {
      /*
Open page https://practicetestautomation.com/practice-test-login/
Type username incorrectUser into Username field.
Type password Password123 into Password field.
Puch Submit button.
Verify error message is displayed.
Verify error message text is Your username is invalid!
     */

@Test
    public void softNegatifAssertionTest() throws Exception {
//        Open page https://practicetestautomation.com/practice-test-login/
    driver.get("https://practicetestautomation.com/practice-test-login/");
//        Type username student into Username field
    driver.findElement(By.id("username")).sendKeys("inCorrectUser");

//        Type password Password123 into Password field
    driver.findElement(By.id("password")).sendKeys("Password123");

//        Click Submit button.
    driver.findElement(By.id("submit")).click();

//                Verify error message is displayed.
    SoftAssert softAssert=new SoftAssert(); // sadece obje olusturulur

    softAssert.assertTrue(driver.findElement(By.id("error")).isDisplayed());
//        Verify error message text is Your username is invalid!
softAssert.assertEquals(driver.findElement(By.id("error")).getText(),"Your username is invalid!");
    }
}
