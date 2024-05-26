package com.nopcommerce.testsuite;

import com.nopcommerce.testbase.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Random;

public class LoginTest extends TestBase {
    public Random randomGenerator = new Random();
    char[] password= generatePassword(8);
    String loginPassword = new String(password);
    String emailId=generateRandomEmail();


    /* @Test  (groups = { "smoke" })
    public void login(){
 *//*  WebElement loginLink = driver.findElement("ico-login");
        loginLink.click();*//*
        clickOnElement(By.className("ico-login"));
        String actualWelcomeText = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]")).getText();
        String expectingWelcomeText = "Welcome, Please Sign In!";
        Assert.assertEquals("Validating welcome text",expectingWelcomeText,actualWelcomeText);

        String actualMsg=driver.findElement(By.xpath("//strong[text()='New Customer']")).getText();
        String expectedMsg = "New Customer";
        Assert.assertTrue(expectedMsg.equalsIgnoreCase(actualMsg));
    }*/


    @Test (priority = 1)
    public void registeraccount(){
        driver.findElement(By.xpath("//a[@class='ico-register' and text()='Register']")).click();
        driver.findElement(By.xpath("//input[@type='radio' and @value='M']")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Shubham");
        driver.findElement(By.id("LastName")).sendKeys("Panchal");
        driver.findElement(By.id("Email")).sendKeys(emailId);
        driver.findElement(By.id("Password")).sendKeys(loginPassword);
        driver.findElement(By.name("ConfirmPassword")).sendKeys(loginPassword);
        driver.findElement(By.xpath("//button[@id='register-button']")).click();
        String amessage=driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/ul/li")).getText();
        String emessage="The specified email already exists";
        Assert.assertEquals("Registration message error",emessage,amessage);
        System.out.println();
    }


    @Test (priority = 2)
    public void validlogin(){
        //User should be able to login with valid credentials
        driver.findElement(By.xpath("//a[@class='ico-login']")).click();
        driver.findElement(By.xpath("//input[@class='email']")).sendKeys(emailId);
        driver.findElement(By.xpath("//input[@class='password']")).sendKeys(loginPassword);
        driver.findElement(By.xpath("//button[@type='submit' and text()='Log in']")).click();
        String logintext=driver.findElement(By.xpath("//div[@class='topic-block-title' or text()='Welcome to our store']")).getText();
        String expctedlogintext="Welcome to our store";
        Assert.assertEquals("Something wrong is welcome text",expctedlogintext,logintext);
    }

}
