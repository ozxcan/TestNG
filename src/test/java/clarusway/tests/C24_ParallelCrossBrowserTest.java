package clarusway.tests;

import clarusway.utilities.ParameterBrowserTestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class C24_ParallelCrossBrowserTest  {

    @Test
    public void test1(){
        System.out.println("Clarusway Thread Id: "+Thread.currentThread().getId());
        WebDriver driver = new FirefoxDriver();
        driver.get("https://clarusway.com");
        driver.quit();
    }

    @Test
    public void test2(){
        System.out.println("Google Thread Id: "+Thread.currentThread().getId());
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");
        driver.quit();
    }

    @Test
    public void test3(){
        System.out.println("Facebook Thread Id: "+Thread.currentThread().getId());
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        driver.quit();
    }

    @Test
    public void test4(){
        System.out.println("Linkedin Thread Id: "+Thread.currentThread().getId());
        WebDriver driver = new ChromeDriver();
        driver.get("https://linkedin.com");
        driver.quit();
    }


}
