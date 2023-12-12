package clarusway.tests.smoke_test;

import clarusway.utilities.ExtentReportUtils;
import clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class NegativeLoginTest extends TestBase {

    @Test
    public void negativeLoginTest() throws Exception {
        ExtentReportUtils.createTestReport("NegativeLoginTest","NegativeLoginTest");

        driver.get("https://practicetestautomation.com/practice-test-login/");
        ExtentReportUtils.passAndCaptureScreenshot("Kullanici ana sayfaya geldi",driver);

        driver.findElement(By.id("username")).sendKeys("studentX");
        ExtentReportUtils.passAndCaptureScreenshot("Kullanici kullanici adini girdi",driver);
        driver.findElement(By.id("password")).sendKeys("Password123");
        ExtentReportUtils.passAndCaptureScreenshot("Kullanici passwordu girdi",driver);

        ExtentReportUtils.info("Kullanici submit butonuna tiklar");
        driver.findElement(By.id("submit")).click();

        String errorMessage = driver.findElement(By.id("error")).getText();
        ExtentReportUtils.passAndCaptureScreenshot("Kullanici error mesajini görür",driver);

        assertTrue(errorMessage.contains("Your username is invalid!"));
ExtentReportUtils.flush();
    }

}
