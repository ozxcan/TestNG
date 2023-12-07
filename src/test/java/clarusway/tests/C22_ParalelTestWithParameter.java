package clarusway.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class C22_ParalelTestWithParameter {

    @Test(threadPoolSize = 4, invocationCount = 5)
    public void test01(){
        System.out.println("Thread.currentThread().getId() = " + Thread.currentThread().getId());
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.quit();
    }
}
