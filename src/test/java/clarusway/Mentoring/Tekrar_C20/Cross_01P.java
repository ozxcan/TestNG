package clarusway.Mentoring.Tekrar_C20;

import clarusway.utilities.ParameterBrowserTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Cross_01P extends ParameterBrowserTestBase {
    @Test
    public void homework() throws InterruptedException {
        driver.get("https://automationexercise.com/");
        WebElement signUp = driver.findElement(By.linkText("Signup / Login"));
        signUp.click();
        Actions action = new Actions(driver);
        WebElement nameBox = driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
        action.
                click(nameBox).
                sendKeys("hale").
                sendKeys(Keys.TAB).
                sendKeys("halelk@gmail.com").
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);
        WebElement title = driver.findElement(By.xpath("//input[@value='Mrs']"));
        title.click();
        WebElement nameArea = driver.findElement(By.xpath("//input[@id='name']"));
        action.click(nameArea).
                sendKeys(Keys.TAB).sendKeys("12345").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys("hale").
                sendKeys(Keys.ENTER).
                sendKeys("kaya").
                sendKeys(Keys.ENTER).
                sendKeys("kaya").
                perform();
        Thread.sleep(2000);
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
