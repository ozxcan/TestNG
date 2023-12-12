package clarusway.tests.smoke_test;

import clarusway.utilities.ExtentReportUtils;
import clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static clarusway.utilities.ExtentReportUtils.flush;
import static org.testng.AssertJUnit.assertTrue;

public class PositiveLoginTest extends TestBase {
    @Test
            public void positiveLoginTest() throws Exception {

        ExtentReportUtils.createTestReport("PositiveLoginTest","PositiveLoginTest");

        driver.get("https://practicetestautomation.com/practice-test-login/");
        ExtentReportUtils.passAndCaptureScreenshot("Kullanici ana sayfaya geldi",driver);

        driver.findElement(By.id("username")).sendKeys("student");
        ExtentReportUtils.passAndCaptureScreenshot("Kullanici kullanici adini girdi",driver);
        driver.findElement(By.id("password")).sendKeys("Password123");
        ExtentReportUtils.passAndCaptureScreenshot("Kullanici passwordu girdi",driver);

        ExtentReportUtils.info("Kullanici submit butonuna tiklar");
        driver.findElement(By.id("submit")).click();

        String successMessage = driver.findElement(By.tagName("strong")).getText();
        assertTrue(successMessage.contains("Congratulations student"));
        ExtentReportUtils.passAndCaptureScreenshot("Kullanici successMessage gördü",driver);
        flush();
}
}
