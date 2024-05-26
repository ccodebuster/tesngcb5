package com.nopcommerce.testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNgAssert {

    @Test
    public void hardAssert(){

        int a =5;
        int b = 6;
        int sum = a+b;
        System.out.println("Assertion start");
        Assert.assertEquals(sum,12);
        System.out.println("Assertion stop");

    }

    @Test
    public void softAssert(){
        SoftAssert softAssert = new SoftAssert();
        int a =5;
        int b = 6;
        int sum = a+b;
        System.out.println("Assertion start");
        softAssert.assertEquals(sum,12);
        System.out.println("Assertion stop");
        softAssert.assertAll();
    }
}
