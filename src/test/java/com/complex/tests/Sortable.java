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

public class Sortable extends CommonMethods {

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
    }*/

    @Test
    public void ValidateSortable() throws InterruptedException {
        driver.findElement(By.linkText("Sortable")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        String actual=driver.findElement(By.xpath("//ul[@id='sortable']/li[1]")).getText();
        Assert.assertEquals(actual,"Item 1");
        WebElement source = driver.findElement(By.xpath("//ul[@id='sortable']/li[1]"));
        WebElement dest = driver.findElement(By.xpath("//ul[@id='sortable']/li[5]"));
        Actions val=new Actions(driver);
        val.clickAndHold(source).moveToElement(dest).build().perform();

    }
////label[contains(@class,'ui-state-active') and @for='radio-2']

}
