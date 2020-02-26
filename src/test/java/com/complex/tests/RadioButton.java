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

public class RadioButton extends CommonMethods {



  /*  WebDriver driver;
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
    public void ValidateRadio() throws InterruptedException {
        driver.findElement(By.linkText("Checkboxradio")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        driver.findElement(By.xpath("/html/body/div/fieldset[1]/label[2]")).click();
        boolean actual= driver.findElement(By.xpath("//label[contains(@class,'ui-state-active') and @for='radio-2']")).isDisplayed();
        Assert.assertEquals(actual,true);
    }


}
