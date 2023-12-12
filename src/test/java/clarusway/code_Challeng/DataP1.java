package clarusway.code_Challeng;

import clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DataP1 extends TestBase {
//    TASK -->
//    Amazona git
//    Kahve Makinası ara
//    Diş Macunu ara
//    Hotwheels ara
    @Test (dataProvider = "Amazon", dataProviderClass = TestData.class)
    public void test01(String urun) throws Exception {
        driver.get("http://amazon.com");
        driver.navigate().refresh();
      WebElement search= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
   search.click();
        Actions actions =new Actions(driver);
        actions.sendKeys(urun).sendKeys(Keys.ENTER).perform();

    }
}
