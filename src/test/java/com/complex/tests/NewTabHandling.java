package com.complex.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.CommonMethods;

import java.util.concurrent.TimeUnit;

public class NewTabHandling extends CommonMethods {

   /* WebDriver driver;
    Actions action;
    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/dibashsaha/Desktop/com.macy/Driverhere/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }*/

    @Test
    public void ValidateNewTabHandling() throws InterruptedException {
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
        String parent=driver.getWindowHandle();
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//button")).click();
        for(String child:driver.getWindowHandles()){
            driver.switchTo().window(child);
        }
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.w3schools.com/");
        driver.close();
        driver.switchTo().window(parent);
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");

    }


}
