package clarusway.Mentoring;

import clarusway.utilities.ExtentReportUtils;
import clarusway.utilities.TestBase;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static clarusway.utilities.ExtentReportUtils.flush;

public class Odev2Hoca extends TestBase {
    /*
Go to https://automationexercise.com/
Create an account and delete it.
Create HTML report for each step with screenshots
 */
  @Test(dataProvider = "Registration" )
  public void test01(String name,String eMail) {
      ExtentReportUtils.createTestReport("RegistrationTest","RegistrationTest");
      driver.get("https://automationexercise.com/");
      ExtentReportUtils.passAndCaptureScreenshot("Kullanici ana sayfaya geldi",driver);

  driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
      ExtentReportUtils.info("Login butonu tiklandi");
  driver.findElement(By.xpath("//input[@name='name']")).click();
      ExtentReportUtils.passAndCaptureScreenshot("Kullanici Register bölümüne geldi",driver);
      Actions actions=new Actions(driver);
    //  String name="ozcan1";
    //  String eMail="ozcan1@gmail.com";
      actions.sendKeys(name).sendKeys(Keys.TAB).
              sendKeys(eMail).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
      ExtentReportUtils.passAndCaptureScreenshot("Kullanici name ve email girdi",driver);
      WebElement mr= driver.findElement(By.xpath("//input[@id='id_gender1']"));
      mr.click();
      Faker faker=new Faker();

      actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).
              sendKeys(faker.internet().password()).
              sendKeys(Keys.TAB).sendKeys("1").sendKeys(Keys.TAB).
              sendKeys("January").sendKeys(Keys.TAB).sendKeys("1986").
              sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
              sendKeys(name).sendKeys(Keys.TAB).sendKeys(faker.name().lastName()).
              sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(faker.address().city()).
              sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("Canada").
              sendKeys(Keys.TAB).sendKeys(faker.address().state()).
              sendKeys(Keys.TAB).sendKeys(faker.address().cityName()).
              sendKeys(Keys.TAB).sendKeys(faker.address().zipCode()).
              sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().cellPhone()).
              sendKeys(Keys.TAB).sendKeys(Keys.ENTER).
              perform();
      ExtentReportUtils.passAndCaptureScreenshot("Kullanici kayit oldu",driver);
      flush();

  }
    @DataProvider
  public Object[][] Registration (){
      String[][] data={
              {Faker.instance().name().toString(),"ozcan3@gmail.com"},{"ozcan4","ozcan4@gmail.com"},{"ozcan5","ozcan5@hotmail.com"},{"ozcan6","ozcan6@gmail.com"}
      };
  return data;
  }

}
