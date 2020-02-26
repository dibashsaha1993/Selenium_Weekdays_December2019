package com.sample;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.CommonMethods;

public class DocumentPageTests extends CommonMethods {
	
	@Test(priority=1)
	public void validateInteractions() throws Exception{
		String text="Can't find what you're looking for?";
		homePageObj.clickApiLink();
		String actual=documentPageObj.getDocText();
		Assert.assertEquals(actual,text);
	}
	
	@Test(priority=2)
	public void verifyMainPageLinkNavigation() throws Exception{
		homePageObj.clickApiLink();
		documentPageObj.clickMainSite();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getCurrentUrl(),"https://jqueryui.com/");
	}
	
	@Test(priority=3)
	public void verifyAPIDocPageLinkNavigation() throws Exception{
		homePageObj.clickApiLink();
		documentPageObj.clickApiDocLink();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getCurrentUrl(),"https://api.jqueryui.com/1.11/");
	}
	
	
	@Test(priority=4)
	public void verifyLearnPageLinkNavigation() throws Exception{
		homePageObj.clickApiLink();
		documentPageObj.clickjQueryLearnLink();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getCurrentUrl(),"https://learn.jquery.com/");
	}
	

	@Test(priority=5)
	public void verifyLearnerCenterPageLinkNavigation() throws Exception{
		documentPageObj.clickJqueyHome();
		homePageObj.clickApiLink();
		documentPageObj.clickjQueryLearnLink();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getCurrentUrl(),"https://learn.jquery.com/");
	}
}
