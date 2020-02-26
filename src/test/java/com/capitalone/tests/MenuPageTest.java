package com.capitalone.tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MenuPageTest {

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








	@When("^i enter home username \"([^\"]*)\"$")
	public void i_enter_username(String user) throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.id("noAcctUid")).sendKeys(user);
	}

	@When("^i enter home password \"([^\"]*)\"$")
	public void i_enter_password(String pass) {
		driver.findElement(By.id("noAcctPw")).sendKeys(pass);
	}

	@And("^i click home sign button$")
	public void i_click_sign_button() {
		driver.findElement(By.id("noAcctSubmit")).click();
	}

	@Then("^validate home password error message$")
	public void validate_password_error_message() throws Exception {
		Thread.sleep(3000);
		String actual=driver.findElement(By.id("us-login-auth-error-pass")).getText();
		org.junit.Assert.assertEquals("Please enter required information", actual);
	}

	@Then("^validate home user error message$")
	public void validate_user_error_message() throws Exception  {
		Thread.sleep(3000);
		String actual=driver.findElement(By.id("us-login-auth-error-user")).getText();
		org.junit.Assert.assertEquals("Please enter required information", actual);
	}

	@Then("^validate home invalid error message$")
	public void validate_invalid_error_message() throws Exception  {
		Thread.sleep(5000);
		String actual=driver.getCurrentUrl();
		org.junit.Assert.assertEquals("https://verified.capitalone.com/auth/error", actual);
	}

}
