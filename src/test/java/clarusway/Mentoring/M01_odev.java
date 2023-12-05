package clarusway.Mentoring;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class M01_odev {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() throws Exception {
        driver = new ChromeDriver();
        System.out.println("beforeClass");
        driver.manage().window().maximize();

    }

    @AfterClass
    public void afterClass() throws Exception {
        driver.quit();
    }

    @Test
    public void facebook01() throws Exception {
        driver.get("https://facebook.com");
        System.out.println("test01");

    }

    @Test(dependsOnMethods = "facebook01")
    public void google02() throws Exception {
        driver.get("https://google.com");

        Thread.sleep(2000);
        System.out.println("test02");

    }

    @Test(dependsOnMethods = {"facebook01", "google02"})
    public void amazon03() throws Exception {
        driver.get("https://amazon.com");

        Thread.sleep(2000);
        System.out.println("test03");

    }
}
