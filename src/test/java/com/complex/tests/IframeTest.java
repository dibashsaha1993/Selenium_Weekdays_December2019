package com.complex.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import utils.CommonMethods;

public class IframeTest extends CommonMethods {

  /*  WebDriver driver;
    Actions action;
    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/dibashsaha/Desktop/com.macy/Driverhere/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Frames.html");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
*/


    @Test
    public void ValidateIframe() throws InterruptedException {
        driver.get("http://demo.automationtesting.in/Frames.html");
        WebElement frame=driver.findElement(By.xpath("//*[@id=\"singleframe\"]"));
        driver.switchTo().frame(frame);
        WebElement box=driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
        box.sendKeys("home now");
        Thread.sleep(3000);
    }
}
