package clarusway.tests;

import clarusway.utilities.DataProviderUtils;
import clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class C17_DataProviderExcel extends TestBase {
    @Test(dataProvider = "excelData", dataProviderClass = DataProviderUtils.class)
    public void dataProviderExcel(String username, String password){

        System.out.print("username = " + username);
        System.out.println("  password = " + password);

    }
    @Test(dataProvider = "excelData", dataProviderClass = DataProviderUtils.class)
    public void dataProviderExcelTest(String username, String password) throws InterruptedException {

        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");

        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys(username);
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys(password);
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@value='submit']")).click();

    }
}
