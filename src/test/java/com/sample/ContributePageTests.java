package com.sample;


import org.testng.Assert;
import org.testng.annotations.Test;
import utils.CommonMethods;

public class ContributePageTests extends CommonMethods {
	
	@Test(priority=1)
	public void validateContributeCLSNav(){
		homePageObj.clickLogoLink();
		contributePageObj.clickContribute();
		contributePageObj.clickCla();
		Assert.assertEquals(driver.getCurrentUrl(), "https://openjsf.org/");
	}
	
	@Test(priority=2)
	public void validateSubscribeBtton(){
		driver.get( "https://openjsf.org/");
		boolean subscribebtn=contributePageObj.verifySubscribeBtn();
		Assert.assertEquals(subscribebtn, true);
	}
	
	@Test(priority=3)
	public void validateLoginOpenJSFoundation(){
		driver.get( "https://openjsf.org/");
		contributePageObj.clickSubscribeBtn();
		contributePageObj.clickLoginLink();
		String emailTxt=contributePageObj.verfiyEmailText();
		Assert.assertEquals(emailTxt, "Email Address");
		String passTxt=contributePageObj.verfiyPAsswordText();
		Assert.assertEquals(passTxt, "Password");
	}
	
	@Test(priority=4)
	public void validateEmptyEmailPass() throws Exception{
		driver.get("https://lists.openjsf.org/login");
		contributePageObj.enterEmail("");
		contributePageObj.enterPassword("");
		contributePageObj.clickSubmitBtn();
		Thread.sleep(2000);
		boolean message=contributePageObj.verifyMsg();
		Assert.assertEquals(message, true);
	}
	
	@Test(priority=5)
	public void validateEmptyPass() throws Exception{
		driver.get("https://lists.openjsf.org/login");
		contributePageObj.enterEmail("test");
		contributePageObj.enterPassword("");
		contributePageObj.clickSubmitBtn();
		Thread.sleep(2000);
		boolean message=contributePageObj.verifyMsg();
		Assert.assertEquals(message, true);
	}
	

	@Test(priority=6)
	public void validateEmptyUsername() throws Exception{
		driver.get("https://lists.openjsf.org/login");
		contributePageObj.enterEmail("");
		contributePageObj.enterPassword("test");
		contributePageObj.clickSubmitBtn();
		Thread.sleep(2000);
		boolean message=contributePageObj.verifyMsg();
		Assert.assertEquals(message, true);
	}
	

	@Test(priority=7)
	public void validateInvalidUsername() throws Exception{
		driver.get("https://lists.openjsf.org/login");
		contributePageObj.enterEmail("test");
		contributePageObj.enterPassword("test");
		contributePageObj.clickSubmitBtn();
		Thread.sleep(2000);
		boolean message=contributePageObj.verfiyInvalidText();
		Assert.assertEquals(message, true);
	}
	

	@Test(priority=8)
	public void validateInvalidPassword() throws Exception{
		driver.get("https://lists.openjsf.org/login");
		contributePageObj.enterEmail("test@gmail.com");
		contributePageObj.enterPassword("test");
		contributePageObj.clickSubmitBtn();
		Thread.sleep(2000);
		boolean message=contributePageObj.verfiyInvalidText();
		Assert.assertEquals(message, true);
	}
	
	@Test(priority=9)
	public void validateRegistrationLink(){
		driver.get("https://lists.openjsf.org/login");
		contributePageObj.clickRegLink();
		String createText=driver.getCurrentUrl();
		Assert.assertEquals(createText, "https://lists.openjsf.org/register");
	}
	
	@Test(priority=10)
	public void validateExistingRegistration() throws Exception{
		driver.get( "https://lists.openjsf.org/register");
		contributePageObj.enterEmail("testing@gmail.com");
		contributePageObj.enterPassword("testing");
		contributePageObj.clickSubmitBtn();
		Thread.sleep(2000);
		String createText=contributePageObj.getErrorText();
		Assert.assertEquals(createText, "That email address is already registered.");
		
	}
	
	
	
}
