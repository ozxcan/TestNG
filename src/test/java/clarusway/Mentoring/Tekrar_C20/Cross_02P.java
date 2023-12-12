package clarusway.Mentoring.Tekrar_C20;

import clarusway.utilities.ParameterBrowserTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class Cross_02P extends ParameterBrowserTestBase {
    /*
     Find the height of the earliest built tower on this page:
     https://www.techlistic.com/p/demo-selenium-practice.html
     Your code must be dynamic
     Run test with XML file
   */
    @Test
    public void cross01() {
        driver.get("http://crossbrowsertesting.github.io");
        //Click to To-Do App
        driver.findElement(By.xpath("//*[text()='To-Do App']")).click();
        //Checking Box to do-4 and Checking Box to do-5
        driver.findElement(By.xpath("//input[@name='todo-4']")).click();
        driver.findElement(By.xpath("//input[@name='todo-5']")).click();
        List<WebElement> liste1 = driver.findElements(By.xpath("//span[@class='done-true']"));
        System.out.println("To do done list size: " + liste1.size());
        // So we'll assert that this is correct.
        Assert.assertEquals(liste1.size(), 2);
        System.out.println("Entering Text");
        WebElement addedTxt = driver.findElement(By.xpath("//input[@id='todotext']"));
        addedTxt.sendKeys("we added is Run Selenium Test" + Keys.ENTER);
        Assert.assertTrue(addedTxt.isDisplayed());
        System.out.println("Archiving old todos");
        driver.findElement(By.xpath("//*[text()='archive']")).click();
        //    driver.findElement(By.linkText("archive")).click();
        List<WebElement> liste2=driver.findElements(By.xpath("//span[@class='done-false']"));
        System.out.println("To does not done size = " + liste2.size());
        Assert.assertEquals(liste2.size(),4);
        System.out.println("Test Finished");
    }

    @Test
    public void cross02() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.name("password")).sendKeys("incorrectPassword");
        driver.findElement(By.cssSelector("button#submit")).click();
        SoftAssert softAssert = new SoftAssert();
        String expectedErrorMes = "Your password is invalid!";
        WebElement actualErrorMes = driver.findElement(By.cssSelector("div[id='error']"));
        softAssert.assertTrue(actualErrorMes.isDisplayed());
        softAssert.assertEquals(actualErrorMes.getText(), expectedErrorMes);
        softAssert.assertAll();
    }
}
