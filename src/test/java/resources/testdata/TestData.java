package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "LoginData")
    public Object[][] createData1() {

        return new Object[][] {
                { "test1@gmail.com", "123456" },
                { "test2@gmail.com", "123456" },
                { "test3@gmail.com", "123456" },
                { "test4@gmail.com", "123456" },
        };
    }

    @DataProvider(name = "Ukdata")
    public Object[][] createData2() {

        return new Object[][] {
                { "test1@gmail.com", "123456" },
                { "test2@gmail.com", "123456" },
                { "test3@gmail.com", "123456" },
                { "test4@gmail.com", "123456" },
        };
    }
}
