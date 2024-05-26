package com.nopcommerce.testsuite;

import com.nopcommerce.testbase.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test  (groups = { "smoke" })
    public void login(){
 /*  WebElement loginLink = driver.findElement("ico-login");
        loginLink.click();*/
        clickOnElement(By.className("ico-login"));
        String actualWelcomeText = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]")).getText();
        String expectingWelcomeText = "Welcome, Please Sign In!";
        Assert.assertEquals("Validating welcome text",expectingWelcomeText,actualWelcomeText);

        String actualMsg=driver.findElement(By.xpath("//strong[text()='New Customer']")).getText();
        String expectedMsg = "New Customer";
        Assert.assertTrue(expectedMsg.equalsIgnoreCase(actualMsg));
    }

}
