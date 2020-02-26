package com.complex.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.CommonMethods;

import java.util.concurrent.TimeUnit;

public class DragAndDrop extends CommonMethods {

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
    public void ValidateDragAndDrop() throws InterruptedException {
        driver.findElement(By.linkText("Droppable")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        String actual=driver.findElement(By.id("droppable")).getText();
        Assert.assertEquals(actual,"Drop here");
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement dest = driver.findElement(By.id("droppable"));
        Actions val=new Actions(driver);
        val.dragAndDrop(source,dest).build().perform();
        String actual1=driver.findElement(By.id("droppable")).getText();
        Assert.assertEquals(actual1,"Dropped!");
    }
////label[contains(@class,'ui-state-active') and @for='radio-2']

}
