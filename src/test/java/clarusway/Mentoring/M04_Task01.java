package clarusway.Mentoring;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class M04_Task01 {
    //Open the site: http://opencart.abstracta.us/index.php?route=account/login
//Register with own credentials
//You can use FAKER
//Using the Search function do it with Data Provider for Mac, iPad and Samsung.
    @Test(dataProvider = "searchboxCredentials")
    public void test01(String searchbox) throws Exception {
        WebDriver driver = new ChromeDriver();
        Faker faker = new Faker();
        driver.get("http://opencart.abstracta.us/index.php?route=account/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[.='Continue']")).click();
     WebElement firstName= driver.findElement(By.id("input-firstname"));
     firstName.click();
        Actions actions=new Actions(driver);
        String password = faker.internet().password();
        String eMail = faker.internet().emailAddress();
        System.out.println("eMail = " + eMail);
        System.out.println("password = " + password);
        actions.sendKeys(faker.name().firstName()).
                sendKeys(Keys.TAB).sendKeys(faker.name().lastName()).
                sendKeys(Keys.TAB).sendKeys(eMail).
                sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().cellPhone()).
                sendKeys(Keys.TAB).sendKeys(password).
                sendKeys(Keys.TAB).sendKeys(password)
                .perform();

        WebElement element = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
        element.click();

        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
        driver.findElement(By.xpath("//a[.='Continue']")).click();

        Thread.sleep(2000);
        driver.findElement(By.name("search")).sendKeys(searchbox);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();

    }
    @DataProvider
    public Object [][] searchboxCredentials(){
        String[][] data={
                {"Mac", },{"iPad",},{"Samsung", },
        };

        return data;
    }

}
