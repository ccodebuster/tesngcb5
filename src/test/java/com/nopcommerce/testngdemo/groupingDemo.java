package com.nopcommerce.testngdemo;

import org.testng.annotations.Test;

public class groupingDemo {

    @Test (groups = { "smoke" })
    public void loginTest1(){
        System.out.println("login test 1");
    }

    @Test (groups = { "sanity" })
    public void loginTest2(){
        System.out.println("login test 2");
    }

    @Test (groups = { "sanity" , "smoke" })
    public void loginTest3(){
        System.out.println("login test 3");
    }

    @Test
    public void loginTest4(){
        System.out.println("login test 4");
    }

    @Test (groups = { "regression" })
    public void regressionTest(){
        System.out.println("regression test");
    }
    

}
