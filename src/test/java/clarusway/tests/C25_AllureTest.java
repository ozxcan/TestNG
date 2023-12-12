package clarusway.tests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.SkipException;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class C25_AllureTest {
    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void test01(){
        System.out.println("Test01");
    }
       @Test
       @Severity(SeverityLevel.BLOCKER)
    public void test02(){
           System.out.println("Test02");
           throw new RuntimeException();
    }
       @Test
       @Severity(SeverityLevel.MINOR)
    public void test03(){
           System.out.println("Test03");
           throw new SkipException("Skipped");
    }
       @Test
       @Severity(SeverityLevel.TRIVIAL)
    public void test04(){
           System.out.println("Test04");
           assertTrue(false);
    }

}
