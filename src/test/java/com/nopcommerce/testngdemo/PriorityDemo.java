package com.nopcommerce.testngdemo;

import org.testng.annotations.Test;

public class PriorityDemo {

    @Test (priority = 1)
    public void test3(){
        System.out.println("I am first");
    }

    @Test (priority = 2)
    public void test2(){
        System.out.println("I am second");
    }

    @Test (priority = 3)
    public void test1(){
        System.out.println("I am third");
    }
}
