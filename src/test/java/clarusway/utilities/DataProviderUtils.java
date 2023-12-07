package clarusway.utilities;

import com.github.javafaker.Faker;
import org.testng.annotations.DataProvider;

public class DataProviderUtils {
    @DataProvider
    public Object [][] usernamePassword(){
        String[][] data={
                {"john", "Doe"},{"Ali", "Can"},{"Veli", "Den"},
        };

        return data;
    }
    @DataProvider
    public Object [][] fakeUsernamePassword(){
        String[][] data={
                {Faker.instance().name().username(), Faker.instance().internet().password(),Faker.instance().lorem().paragraph(2)},
                {Faker.instance().name().username(), Faker.instance().internet().password(),Faker.instance().lorem().paragraph(3)},
                {Faker.instance().name().username(), Faker.instance().internet().password(),Faker.instance().lorem().paragraph(1)},
        };

        return data;
    }

    @DataProvider
    public Object [][] excelData(){

        ExcelUtils excelUtils = new ExcelUtils("resources/username_password.xlsx", "Sheet1");

        return excelUtils.getDataArrayWithoutFirstRow();
    }
    @DataProvider (parallel = true)
    public Object [][] excelTitleNote(){

        ExcelUtils excelUtils = new ExcelUtils("resources/username_password.xlsx", "Sheet2");

        return excelUtils.getDataArrayWithoutFirstRow();
    }
}
