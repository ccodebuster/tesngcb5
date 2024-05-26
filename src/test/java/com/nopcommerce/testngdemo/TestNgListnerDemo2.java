package com.nopcommerce.testngdemo;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNgListnerDemo.class)
public class TestNgListnerDemo2 {
    @Test
    public void test1(){
        System.out.println("i am test 1");
    }

    @Test
    public void test2(){
        System.out.println("i am test 2");
        Assert.fail();
    }

    @Test
    public void test3(){
        System.out.println("i am test 3");
        throw new SkipException("skipped");

    }
}
