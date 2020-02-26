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

public class SignInPageTest {

	WebDriver driver;
	
	@Given("^to load the sigin application url$")
	public void to_load_the_application_url() {
		System.setProperty("webdriver.chrome.driver", "/Users/dibashsaha/Desktop/DibashProject/drivers/chromedriver");
		driver =new ChromeDriver();
		driver.get("https://www.capitalone.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@When("^i click sigin \"([^\"]*)\" link$")
	public void i_click_link(String text) {
	    driver.findElement(By.linkText(text)).click();
	}
	
	@When("^i wait for sigin page to load$")
	public void i_wait_for_page_to_load() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Then("^it should navigate sigin the \"([^\"]*)\" url$")
	public void it_should_navigate_the_porper_url(String url) throws Exception {
		Thread.sleep(3000);
		Assert.assertEquals(url, driver.getCurrentUrl());
	}

	@And("^i switch to sigin new window$")
	public void switch_to_new_window() {
		for(String child:driver.getWindowHandles()){
			driver.switchTo().window(child);
		}
	}
	
	
	
	
	
	@When("^i enter username \"([^\"]*)\"$")
	public void i_enter_username(String user) {
		driver.findElement(By.xpath("//input[@id='ods-input-0']")).sendKeys(user);
	}
	
	@When("^i enter password \"([^\"]*)\"$")
	public void i_enter_password(String pass) {
		driver.findElement(By.xpath("//input[@id='ods-input-1']")).sendKeys(pass);
	}
	
	@And("^i click sign button$")
	public void i_click_sign_button() {
		driver.findElement(By.xpath("//body/app-root/div/div/app-sign-in/ci-content-card/div/div[2]/ngx-ent-signin/form/p[2]/button")).click();
	}
	
	@Then("^validate password error message$")
	public void validate_password_error_message() throws Exception {
		Thread.sleep(3000);
		String actual=driver.findElement(By.xpath("//*[@id='ods-error-1']")).getText();
		Assert.assertEquals("This field is required.", actual);
	}
	
	@Then("^validate user error message$")
	public void validate_user_error_message() throws Exception  {
		Thread.sleep(3000);
		String actual=driver.findElement(By.xpath("//*[@id='ods-error-0']")).getText();
		Assert.assertEquals("This field is required.", actual);
	}
	
	@Then("^validate invalid error message$")
	public void validate_invalid_error_message() throws Exception  {
		Thread.sleep(5000);
		String actual=driver.findElement(By.xpath("/html/body/app-root/div/div/app-sign-in/ci-content-card/div/div[2]/ngx-ent-signin/ngx-ent-signin-error/p/text()")).getText();
		Assert.assertEquals("What you entered doesn't match what we have on file.", actual);
	}

	@Then("^i close signin the browser$")
	public void i_close_the_browser() {
		driver.quit();
	}

}
