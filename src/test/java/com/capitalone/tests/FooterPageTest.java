package com.capitalone.tests;

import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FooterPageTest {
/*
	WebDriver driver;
	
	@Given("^to load the application url$")
	public void to_load_the_application_url() {
		System.setProperty("webdriver.chrome.driver", "/Users/dibashsaha/Desktop/DibashProject/drivers/chromedriver");
		driver =new ChromeDriver();
		driver.get("https://www.capitalone.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@When("^i click \"([^\"]*)\" link$")
	public void i_click_link(String text) {
	    driver.findElement(By.linkText(text)).click();
	}
	
	@When("^i wait for page to load$")
	public void i_wait_for_page_to_load() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Then("^it should navigate the \"([^\"]*)\" url$")
	public void it_should_navigate_the_porper_url(String url) {
		Assert.assertEquals(url, driver.getCurrentUrl());
	}

	@And("^i switch to new window$")
	public void switch_to_new_window() {
		for(String child:driver.getWindowHandles()){
			driver.switchTo().window(child);
		}
	}


	@Then("^i close the browser$")
	public void i_close_the_browser() {
		driver.quit();
	}
*/
}

