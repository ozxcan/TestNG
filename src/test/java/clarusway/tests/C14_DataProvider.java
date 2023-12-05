package clarusway.tests;

import clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C14_DataProvider extends TestBase {

    @Test(dataProvider = "userCredentials")
    public void dataProviderTest01 (String name,String lastName){


        System.out.println("name = " + name);
        System.out.println("lastName = " + lastName);
    }
    @DataProvider
    public Object [][] userCredentials(){
        String[][] data={
                {"john", "Doe"},{"Ali", "Can"},{"Veli", "Den"},
        };

        return data;
    }
    @Test (dataProvider = "userCredentials")

    public void dataProviderTest02(String username,String password) throws InterruptedException {
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys(username);
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys(username);
        // driver.findElement(By.name("submitbutton")).click();

        driver.findElement(By.xpath("//input[@value='submit']")).click();
    }
}
