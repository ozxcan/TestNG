package clarusway.Mentoring;

import clarusway.utilities.DataProviderUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Odev1HocaParalelTest {
    /*
Go to https://testpages.eviltester.com/styled/apps/notes/simplenotes.html
Add 10 notes using data provider with excel
Run it with 3 different browsers using XML file
Run it parallel with 3 threads
 */
    @Test
    public void dataProviderExcelTest() throws Exception {

        WebDriver driver = new EdgeDriver();
        driver.get("https://testpages.eviltester.com/styled/apps/notes/simplenotes.html");

        for (int i=1 ; i<11; i++) {
            driver.findElement(By.id("note-title-input")).sendKeys("title: " + i);
            driver.findElement(By.id("note-details-input")).sendKeys("note: " + i);
            driver.findElement(By.id("add-note")).click();
        }
driver.quit();
    }
    @Test
    public void dataProviderExcelTest2() throws Exception {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://testpages.eviltester.com/styled/apps/notes/simplenotes.html");
for (int i=1 ; i<11; i++) {
    driver.findElement(By.id("note-title-input")).sendKeys("title: " + i);
    driver.findElement(By.id("note-details-input")).sendKeys("note: " + i);
    driver.findElement(By.id("add-note")).click();
}
        driver.quit();
    }
    @Test
    public void dataProviderExcelTest3() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/apps/notes/simplenotes.html");

        for (int i=1 ; i<11; i++) {
            driver.findElement(By.id("note-title-input")).sendKeys("title: " + i);
            driver.findElement(By.id("note-details-input")).sendKeys("note: " + i);
            driver.findElement(By.id("add-note")).click();
        }
        driver.quit();
    }

}
