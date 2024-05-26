package com.nopcommerce;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertEquals;

public class JunitTest {

        WebDriver driver;

        @Before
        public void setup() throws Exception{

            // Initiate browser driver
            driver = new ChromeDriver();

            // adding implicit wait of 12 secs
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            // Opening the webpage
            driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
        }

        @Test
        public void verifyLoginAndRegisterPage() {

            // identify header then get text
            WebElement header = driver.findElement
                    (By.xpath("//*[@id='signInForm']/h1"));
            String text = header.getText();

            // assertions to test case to check login page
            assertEquals("Welcome, Login In", text);

            // navigate to register page
            WebElement btn = driver.findElement
                    (By.xpath("//*[@id='signInForm']/div[3]/a"));
            btn.click();

            // assertions to test case to check register page
            WebElement btnchk = driver.findElement
                    (By.xpath("//*[@id='signupForm']/div[5]/a"));
            boolean displayed = btnchk.isDisplayed();

            // assertions to test case
            assertEquals(true, displayed);
        }

        @After
        public void teardown() {

            // quitting browser
            driver.quit();
        }
}
