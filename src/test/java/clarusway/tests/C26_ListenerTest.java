package clarusway.tests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;
@Listeners (clarusway.utilities.ListenersUtils.class)
public class C26_ListenerTest {
    @Test
    public void test01(){
        System.out.println("Test01");
    }
    @Test
    public void test02(){
        System.out.println("Test02");
        throw new RuntimeException();
    }
    @Test
    public void test03(){
        System.out.println("Test03");
        throw new SkipException("Skipped");
    }
    @Test
    public void test04() throws InterruptedException {

        System.out.println("Test04");
        assertTrue(false);
    }
    @Test
    public void test05() throws InterruptedException {

        System.out.println("Test05");

    }
    @Test
    public void test06() throws InterruptedException {

        System.out.println("Test06");

    }

}
