package clarusway.tests;

import clarusway.utilities.DataProviderUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C23_DataProviderParallelTest {

@Test(dataProvider = "excelTitleNote", dataProviderClass = DataProviderUtils.class)
    public void dataProviderParallelTest(String title, String note){

    System.out.println("Thread.currentThread().getId() = " + Thread.currentThread().getId());

    System.out.println("title = " + title);
    System.out.println("note = " + note);

    //ödev 3 erli 5 erli gönder. öncekinki ödeve odev1Hoca
}
}
