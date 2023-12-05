package clarusway.Mentoring;

import clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class F01_Task01Ver1 extends TestBase {
    /*
1. http://zero.webappsecurity.com sayfasina gidin
2. Signin buttonuna tiklayin
3. Login alanine  "username" yazdirin
4. Password alanine "password" yazdirin
5. Sign in buttonuna tiklayin (hata mesaji icin back tusuna tiklayin)
6. Online Banking menusunden Pay Bills sayfasina gidin
7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
8. tarih kismina "2020-09-10" yazdirin
9. Pay buttonuna tiklayin
10. "The payment was successfully submitted." mesajinin ciktigini kontrol edin
*/
    @Test
    public void zeroTest () throws AWTException, InterruptedException {
        //1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");
        //2. Signin buttonuna tiklayin
        WebElement signIn= driver.findElement(By.xpath("//button[@id='signin_button']"));
        signIn.click();
        //3. Login alanine  "username" yazdirin
        Thread.sleep(2000);
        WebElement logIn= driver.findElement(By.xpath("//input[@id='user_login']"));
        logIn.sendKeys("username");
//        4. Password alanine "password" yazdirin
        WebElement password= driver.findElement(By.xpath("//input[@id='user_password']"));
        password.sendKeys("password");
//        5. Sign in buttonuna tiklayin (hata mesaji icin back tusuna tiklayin)
        WebElement submit= driver.findElement(By.xpath("//input[@name='submit']"));
        submit.click();
        driver.navigate().back();
        //6. Online Banking menusunden Pay Bills sayfasina gidin
        driver.findElement(By.id("onlineBankingMenu")).click();
        driver.findElement(By.id("pay_bills_link")).click();  // Pay-bills link
        //7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        driver.findElement(By.id("sp_amount")).sendKeys("1000");  // Amount entered
        //8. tarih kismina "2020-09-10" yazdirin
        driver.findElement(By.id("sp_date")).sendKeys("2020-09-10");  // Date entered
        //9. Pay buttonuna tiklayin
        driver.findElement(By.id("pay_saved_payees")).click();
        //10. "The payment was successfully submitted." mesajinin ciktigini kontrol edin
        String pay = driver.findElement(By.id("alert_content")).getText();
        Assert.assertEquals(pay,"The payment was successfully submitted.");

    }
}
