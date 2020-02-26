package com.sample;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.CommonMethods;

public class JqueryNavPageTests extends CommonMethods {
	
	@Test(priority=1)
	public void validateJqueryIcon() throws Exception{
		jqueryNavPagePageObj.clickJqueryIcon();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://jquery.com/");
	}
	
	@Test(priority=2)
	public void validateJqueryUIIcon() throws Exception{
		jqueryNavPagePageObj.clickJqueryUIIcon();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://jqueryui.com/");
	}
	
	@Test(priority=3)
	public void validateJqueryMobileIcon() throws Exception{
		jqueryNavPagePageObj.clickJqueryMobileIcon();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://jquerymobile.com/");
	}
	
	@Test(priority=4)
	public void validateQunitLink() throws Exception{
		jqueryNavPagePageObj.clickQunitIcon();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://qunitjs.com/");
	}
	
	@Test(priority=5)
	public void validateSizzleLink() throws Exception{
		jqueryNavPagePageObj.clickSizzleIcon();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://github.com/jquery/sizzle/wiki");
	}
	
	
}
