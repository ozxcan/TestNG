package clarusway.code_Challeng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DataPParalelDataClasstan {

    @Test(dataProvider = "excelParalelData" , dataProviderClass = TestData.class, threadPoolSize = 3,invocationCount = 2)
    public void homework(String name , String email ,String parola , String lastname, String company) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        System.out.println("Thread.currentThread().getId() = " + Thread.currentThread().getId());
        driver.get("https://automationexercise.com/");
        Thread.sleep(1000);
        WebElement signUp = driver.findElement(By.linkText("Signup / Login"));
        signUp.click();
        Actions action = new Actions(driver);
        WebElement nameBox = driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
        action.
                click(nameBox).
                sendKeys(name).
                sendKeys(Keys.TAB).
                sendKeys(email).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).perform();
        Thread.sleep(4000);
        WebElement title = driver.findElement(By.xpath("//input[@value='Mrs']"));
        title.click();
        WebElement nameArea = driver.findElement(By.xpath("//input[@id='name']"));
        action.click(nameArea).
                sendKeys(Keys.TAB).sendKeys(parola).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(name).
                sendKeys(Keys.ENTER).
                sendKeys(lastname).
                sendKeys(Keys.ENTER).
                sendKeys(company).
                perform();
        Thread.sleep(2000);
    }
}
