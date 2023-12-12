package clarusway.homework;

import clarusway.utilities.TestBase;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework_01  extends TestBase {
    /*
Go to https://testpages.eviltester.com/styled/dynamic-buttons-simple.html
Click buttons to see message 'All Buttons Clicked!
Use Allure reports and listeners
 */
    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void test01(){
        driver.get("https://testpages.eviltester.com/styled/dynamic-buttons-simple.html");

       WebElement start= driver.findElement(By.id("button00"));
       start.click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement one= driver.findElement(By.id("button01"));
        one.click();
        WebElement two= driver.findElement(By.id("button02"));
        two.click();
        WebElement three= driver.findElement(By.id("button03"));
        three.click();
        Assert.assertEquals("All Buttons Clicked",driver.findElement(By.id("buttonmessage")).getText());
    }
}
