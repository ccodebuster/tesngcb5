package com.nopcommerce.testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReTryTest {
    @Test
    public void test3(){
        System.out.println("I am first");
    }

    @Test
    public void test2(){
        System.out.println("I am second");
    }

    @Test (retryAnalyzer = Retry.class)
    public void test1(){
        System.out.println("I am third");
        Assert.assertTrue(false);
    }
}
