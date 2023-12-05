package clarusway.tests;

import clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C13_XMLParameterTest extends TestBase {


    @Test
    @Parameters({"username", "password"})
    public void parameterTest01(String username,String password) throws InterruptedException {
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys(username);
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys(username);
       // driver.findElement(By.name("submitbutton")).click();

        driver.findElement(By.xpath("//input[@value='submit']")).click();
    }
}
