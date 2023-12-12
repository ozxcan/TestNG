package clarusway.tests;

import clarusway.utilities.ExtentReportUtils;
import clarusway.utilities.JavascriptUtils;
import clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static clarusway.utilities.ExtentReportUtils.flush;
import static clarusway.utilities.JavascriptUtils.flash;
import static org.testng.AssertJUnit.assertTrue;

public class C28_ReusableMethod extends TestBase {
    @Test
    public void flashElements()throws Exception {

        //Üzerinde işlem yapılacak web elementi öncesinde flash yapın.

            driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement username=driver.findElement(By.id("username"));
        flash(driver, username);
            username.sendKeys("student");
        WebElement password=driver.findElement(By.id("password"));

        flash(driver,password);
            password.sendKeys("Password123");


        WebElement submit=driver.findElement(By.id("submit"));
        flash(driver,submit);
            submit.click();
        WebElement strong=driver.findElement(By.tagName("strong"));
        flash(driver,strong);
            String successMessage = strong.getText();
            assertTrue(successMessage.contains("Congratulations student"));




    }}
