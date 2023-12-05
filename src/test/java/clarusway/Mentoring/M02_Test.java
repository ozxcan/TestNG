package clarusway.Mentoring;

import clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static clarusway.utilities.JavascriptUtils.clickElementByJS;
import static clarusway.utilities.JavascriptUtils.scrollIntoViewJS;

public class M02_Test extends TestBase {
        /*
    Given
        Go to https://www.hepsiburada.com/bilgisayarlar-c-2147483646
    When
        Click all marks and print their names
     */

    @Test
    public void markalarTest(){
//        Go to https://www.hepsiburada.com/bilgisayarlar-c-2147483646
        driver.get("https://www.hepsiburada.com/bilgisayarlar-c-2147483646");

//        Click all marks and print their names
        List<WebElement> markalar = driver.findElements(By.xpath("//input[@name='markalar']"));
        scrollIntoViewJS(driver, markalar.get(0));//scrollIntoViewJS() methodu ile tıklanacak WebElement'i üzerine sayfayı kaydırdık.

        for(WebElement w : markalar){

            clickElementByJS(driver, w);
           Object isim = ((JavascriptExecutor)driver).executeScript("return arguments[0].value", w);
            System.out.println(isim);

        }


    }


}


