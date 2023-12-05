package clarusway.Mentoring;

import clarusway.utilities.JavascriptUtils;
import clarusway.utilities.TestBase;
import com.github.javafaker.Faker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.Assert;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class M03_Odev1 extends TestBase {




    @Test
    public void test01()throws Exception {
//        1. Launch browser
//        2. Navigate to url 'https://automationexercise.com'
driver.navigate().to("https://automationexercise.com");

//        3. Verify that home page is visible successfully
        WebElement homePageElement = driver.findElement(By.xpath("//span[.='Automation']"));
        String homePage = homePageElement.getText();

        Assert.assertTrue(homePage.contains("Automation"));
//        4. Scroll down to footer
        JavascriptUtils.scrollDownByJS(driver);
//        5. Verify text 'SUBSCRIPTION'
        WebElement subscription = driver.findElement(By.xpath("//h2[text()='Subscription']"));
     //   softAssert.assertEquals(subscription.getText(), "SUBSCRIPTION","Subscription text does not match");
      //  softAssert.assertEquals(subscription.getText(),"SUBSCRIPTION","Subscription text does not match");
//        6. Enter email address in input and click arrow button
        WebElement eMail= driver.findElement(By.id("Subscription"));
        eMail.sendKeys(Faker.instance().internet().emailAddress());
        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        7. Verify success message 'You have been successfully subscribed!' is visible
        WebElement succesMessage = driver.findElement(By.xpath("//div[@class='form-row']//child::div/div"));
        String expectedMessage = "You have been successfully subscribed!";
     //   softAssert.assertEquals(succesMessage.getText(),expectedMessage,"Succes Message does not match");

    }}
