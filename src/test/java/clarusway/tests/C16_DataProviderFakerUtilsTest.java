package clarusway.tests;

import clarusway.utilities.DataProviderUtils;
import clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class C16_DataProviderFakerUtilsTest extends TestBase {

    @Test(dataProvider = "fakeUsernamePassword", dataProviderClass = DataProviderUtils.class) // diger classtan parametreleri cagirdik

    public void dataProviderTest02(String username,String password,String lorem) throws InterruptedException {
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys(username);
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys(password);
        // driver.findElement(By.name("submitbutton")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//textarea[@name='comments']")).clear();
        driver.findElement(By.xpath("//textarea[@name='comments']")).sendKeys(lorem);
        driver.findElement(By.xpath("//input[@value='submit']")).click();
    }
}
