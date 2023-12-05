package clarusway.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C12_UsingParameters {
    @Test
    @Parameters("Param1")
    public void parameterizedTest(String name){
        System.out.println("name = "+name);



    }   @Test
    @Parameters({"name","lastName","age"})
    public void parameterizedTest(String name, String lastName, String age){
        System.out.println("Person = "+name+" "+lastName+ "  "+age);



    }
}
