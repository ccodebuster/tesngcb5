package com.nopcommerce.testngdemo;

import com.nopcommerce.testbase.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest extends TestBase {

    @Parameters("browser")
    @BeforeMethod
    public void setupTest() {
        selectBrowser(browser);
    }

    @Test
    public void m1(){
        System.out.println("test");
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}
