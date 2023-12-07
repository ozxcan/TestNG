package clarusway.Mentoring;

import clarusway.utilities.DataProviderUtils;
import clarusway.utilities.ParameterBrowserTestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Odev1Hoca extends ParameterBrowserTestBase {
    /*
    Go to https://testpages.eviltester.com/styled/apps/notes/simplenotes.html
    Add 10 notes using data provider with excel
    Run it with 3 different browsers using XML file
    Run it parallel with 3 threads
     */
    @Test(dataProvider = "excelTitleNote",dataProviderClass = DataProviderUtils.class)
    public void dataProviderExcelTest(String title,String note) throws Exception {
        driver.get("https://testpages.eviltester.com/styled/apps/notes/simplenotes.html");

        driver.findElement(By.id("note-title-input")).sendKeys(title);
        driver.findElement(By.id("note-details-input")).sendKeys(note);
        driver.findElement(By.id("add-note")).click();


    }

}
