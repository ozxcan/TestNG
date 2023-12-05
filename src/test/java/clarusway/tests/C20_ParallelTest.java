package clarusway.tests;

import clarusway.utilities.TestBase;
import org.testng.annotations.Test;

public class C20_ParallelTest extends TestBase {
    @Test
    public void testCrossBrowser01(){
        driver.get("http://google.com");
    }
    @Test
    public void testCrossBrowser02(){
        driver.get("http://google.com");
    }
    @Test
    public void testCrossBrowser03(){
        driver.get("http://google.com");
    }
    @Test
    public void testCrossBrowser04(){
        driver.get("http://google.com");
    }

}
