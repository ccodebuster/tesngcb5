package com.nopcommerce.testngdemo;

import com.nopcommerce.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class ParameterDemo extends TestBase {

    @Test (dataProvider = "LoginData", dataProviderClass = TestData.class)
    public void VerifyLoginNopCommerce(String email, String password) {

         /*  WebElement loginLink = driver.findElement("ico-login");
        loginLink.click();*/
        clickOnElement(By.className("ico-login"));
        WebElement emailtxt= driver.findElement(By.name("Email"));
        emailtxt.sendKeys(email);

        WebElement passwordtxt= driver.findElement(By.name("Password"));
        passwordtxt.sendKeys(password);

        WebElement submitbutton= driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));
        submitbutton.click();

    }

    @Test
    @Parameters({ "first-name", "sur-name" })
    public void displayName(String name, String surName){
        System.out.println(name);
        System.out.println(surName);
    }
}
