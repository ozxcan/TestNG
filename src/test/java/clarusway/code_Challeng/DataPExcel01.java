package clarusway.code_Challeng;

import clarusway.utilities.ExtentReportUtils;
import clarusway.utilities.TestBase;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static clarusway.utilities.ExtentReportUtils.flush;

public class DataPExcel01 extends TestBase {
    /*
Go to https://automationexercise.com/
Create an account and delete it.
Create HTML report for each step with screenshots
*/
    @Test(dataProvider = "excelData" , dataProviderClass = TestData.class)
    public void homework(String name , String email ,String parola , String lastname, String company) throws InterruptedException {
        driver.get("https://automationexercise.com/");
        Thread.sleep(1000);
        WebElement signUp = driver.findElement(By.linkText("Signup / Login"));
        signUp.click();
        Actions action = new Actions(driver);
        WebElement nameBox = driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
        action.
                click(nameBox).
                sendKeys(name).
                sendKeys(Keys.TAB).
                sendKeys(email).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).perform();
        Thread.sleep(10000);
        WebElement title = driver.findElement(By.xpath("//input[@value='Mrs']"));
        title.click();
        WebElement nameArea = driver.findElement(By.xpath("//input[@id='name']"));
        action.click(nameArea).
                sendKeys(Keys.TAB).sendKeys(parola).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(name).
                sendKeys(Keys.ENTER).
                sendKeys(lastname).
                sendKeys(Keys.ENTER).
                sendKeys(company).
                perform();
        Thread.sleep(2000);
    }


}
