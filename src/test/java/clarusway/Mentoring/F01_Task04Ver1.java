package clarusway.Mentoring;

import clarusway.utilities.TestBase;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class F01_Task04Ver1 extends TestBase {

    /*
    Given kullanici "https://editor.datatables.net/" sayfasina gider
Then new butonuna basar
And editor firstname kutusuna "<firstName>" bilgileri girer
And editor lastname kutusuna "<lastName>" bilgileri girer
And editor position kutusuna "<position>" bilgileri girer
And editor office kutusuna "<office>" bilgileri girer
And editor extension kutusuna "<extension>" bilgileri girer
And editor startdate kutusuna "<startDate>" bilgileri girer
And editor salary kutusuna "<salary>" bilgileri girer
When Create tusuna basar
Then Kullanıcının eklendiğini doğrular.
And Eklediği kullanıcı kaydını siler
Then Kullanıcinin silindiğini doğrular.
*/
    Faker faker=new Faker();
    Actions actions=new Actions(driver);
    String name=faker.name().firstName();
    String lastName=faker.name().lastName();
    @Test
    public void test01() throws Exception {
//        Given kullanici "https://editor.datatables.net/" sayfasina gider
        driver.get("https://editor.datatables.net/");
//        Then new butonuna basar
        driver.findElement(By.xpath("//span[.='New']")).click();
//        And editor firstname kutusuna "<firstName>" bilgileri girer
        Faker faker=new Faker();
        Actions actions=new Actions(driver);
        actions.sendKeys(name).sendKeys(Keys.TAB).
                sendKeys(lastName).sendKeys(Keys.TAB).
                sendKeys(faker.job().position()).sendKeys(Keys.TAB).
                sendKeys(faker.address().city()).sendKeys(Keys.TAB).
                sendKeys(faker.job().title()).sendKeys(Keys.TAB).
                sendKeys(faker.date().toString()).sendKeys(Keys.TAB).
                sendKeys("5000$").sendKeys(Keys.TAB).click().perform();
//        And editor lastname kutusuna "<random().nextLong().lastName>" bilgileri girer
//        And editor position kutusuna "<position>" bilgileri girer
//        And editor office kutusuna "<office>" bilgileri girer
//        And editor extension kutusuna "<extension>" bilgileri girer
//        And editor startdate kutusuna "<startDate>" bilgileri girer
//        And editor salary kutusuna "<salary>" bilgileri girer
//        When Create tusuna basar

        //Then Kullanıcının eklendiğini doğrular.
        WebElement searchBox =  driver.findElement(By.xpath("//input[@type='search']"));
        searchBox.sendKeys(name+" "+lastName);
        Thread.sleep(2000);

        String fullName = name + lastName;
        String searchResult = driver.findElement(By.xpath("//td[@class='sorting_1']")).getText();
        Assert.assertTrue(searchResult.contains(fullName));

        //And Eklediği kullanıcı kaydını siler
        actions.click(searchBox);
        actions.click(driver.findElement(By.className("dt-button buttons-selected buttons-remove")));

        driver.switchTo().frame("nr-ext-rsicon");
        driver.findElement(By.xpath("//span[text()='Delete']")).click();
        driver.switchTo().parentFrame();

        //Then Kullanıcinin silindiğini doğrular.
        String deleteConfirm = driver.findElement(By.xpath("//td[@class='dataTables_empty']")).getText();
        Assert.assertFalse(deleteConfirm.contains(fullName));
    }
}
