package clarusway.code_Challeng;

import clarusway.utilities.ExcelUtils;
import com.github.javafaker.Faker;
import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider
    public Object[][] Registration (){
        String[][] data={
                {Faker.instance().name().toString(),"ozcan3@gmail.com"},{"ozcan4","ozcan4@gmail.com"},{"ozcan5","ozcan5@hotmail.com"},{"ozcan6","ozcan6@gmail.com"}
        };
        return data;
    }
    @DataProvider
    public Object[][] RegistrationFaker (){
        String[][] data={
                {Faker.instance().name().firstName(), Faker.instance().internet().emailAddress()}
                ,{Faker.instance().name().firstName(), Faker.instance().internet().emailAddress()},
                {Faker.instance().name().firstName(), Faker.instance().internet().emailAddress()},
                {Faker.instance().name().firstName(), Faker.instance().internet().emailAddress()}
        };
        return data;
    }
    @DataProvider
    public Object[][] Amazon (){
        String[][] urun={
                {"kahve makinasi"},{"Diş Macunu"},{Faker.instance().book().author()}

        };
        return urun;
    }
@DataProvider
    public Object [][] excelData(){
    ExcelUtils excelUtils =new ExcelUtils("resources/username_Password2.xlsx","T1");
   return excelUtils.getDataArrayWithoutFirstRow(); }



@DataProvider(parallel = true)
    public Object [][] excelParalelData(){
    ExcelUtils excelUtils =new ExcelUtils("resources/username_Password2.xlsx","T1");
   return excelUtils.getDataArrayWithoutFirstRow(); }


}
