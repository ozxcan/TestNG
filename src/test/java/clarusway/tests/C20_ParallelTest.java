package clarusway.tests;

import clarusway.utilities.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class C20_ParallelTest  {
    @Test
    public void testCrossBrowser01(){
        System.out.println("Thread.currentThread().getId() = " + Thread.currentThread().getId());
        WebDriver driver=new ChromeDriver();
        driver.get("http://google.com");
        driver.quit();
    }
    @Test
    public void testCrossBrowser02(){
        WebDriver driver=new ChromeDriver();
        System.out.println("Thread.currentThread().getId() = " + Thread.currentThread().getId());
        driver.get("http://google.com");
        driver.quit();
    }
    @Test
    public void testCrossBrowser03(){
        WebDriver driver=new EdgeDriver();
        System.out.println("Thread.currentThread().getId() = " + Thread.currentThread().getId());
        driver.get("http://google.com");
        driver.quit();
    }
    @Test
    public void testCrossBrowser04(){
        WebDriver driver=new FirefoxDriver();
        System.out.println("Thread.currentThread().getId() = " + Thread.currentThread().getId());
        driver.get("http://google.com");
        driver.quit();
    }

}
