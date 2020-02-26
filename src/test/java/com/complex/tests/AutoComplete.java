package com.complex.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.CommonMethods;

import java.util.concurrent.TimeUnit;

public class AutoComplete extends CommonMethods {

    /*WebDriver driver;
    Actions action;
    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/dibashsaha/Desktop/com.macy/Driverhere/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
*/
    @Test
    public void ValidateAutomplete() throws InterruptedException {
        driver.findElement(By.linkText("Autocomplete")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        driver.findElement(By.id("tags")).sendKeys("ja");
        driver.findElement(By.xpath("//li/div[text()='JavaScript']")).click();
        String actual= driver.findElement(By.id("tags")).getAttribute("value");
        Assert.assertEquals(actual,"JavaScript");
    }


}
