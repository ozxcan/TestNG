package clarusway.Mentoring;

import clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class F01_Task02Ver1 extends TestBase {
    //1. "https://www.saucedemo.com" Adresine gidin
//2. Username kutusuna "standard_user" yazdirin
//3. Password kutusuna "secret_sauce" yazdirin
//4. Login tusuna basin
//5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
//6. Add to Cart butonuna basin
//7. Alisveris sepetine tiklayin
//8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
//9. Sayfayi kapatin
    @Test
    public void test01() throws Exception {
        //1. "https://www.saucedemo.com" Adresine gidin
        driver.get("https://www.saucedemo.com");
//2. Username kutusuna "standard_user" yazdirin
        Actions actions=new Actions(driver);
actions.keyDown(Keys.TAB).keyUp(Keys.TAB)
        .sendKeys("standard_user")
        .keyDown(Keys.TAB).keyUp(Keys.TAB)
        .sendKeys("secret_sauce"+Keys.ENTER).perform();
//3. Password kutusuna "secret_sauce" yazdirin
//4. Login tusuna basin
//5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        WebElement ilkUrun= driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']"));
       System.out.println("ilkUrun.getText() = " + ilkUrun.getText());
        String actuell = ilkUrun.getText();
        ilkUrun.click();
//6. Add to Cart butonuna basin
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
//7. Alisveris sepetine tiklayin
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
//8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        Thread.sleep(2000);

        String expected="Sauce Labs Backpack";
        Assert.assertEquals(actuell,expected);
//9. Sayfayi kapatin



    }

}
