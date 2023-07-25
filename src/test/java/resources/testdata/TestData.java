package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Jay
 */
    public class TestData {
        @DataProvider(name = "credentials")
        public Object[][] getData(){
            Object[][] data = new Object[][]{

                    {"Tester ","Harrow ","up to 5 miles","30000","500000 ","Per annum","Permanent ","Permanent Tester jobs in Harrow on the Hill"},
                    { "Manual Tester","Birmingham","up to 7 miles","28000" ,"Per annum","Permenent","No Jobs available at the moment"},
            };
            return data;
        }

    }




