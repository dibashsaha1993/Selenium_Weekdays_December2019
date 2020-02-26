package com.sample;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.CommonMethods;

public class DownloadPageTests extends CommonMethods {
	
	@Test(priority=1)
	public void validateVersionComponentText(){
		homePageObj.clickDownloadLink();
		String actualVersion=downloadPageObj.getVersionText();
		String actualComponent=downloadPageObj.getCompText();
		Assert.assertEquals(actualVersion, "Version");
		Assert.assertEquals(actualComponent, "Components");
	}
	
	@Test(priority=2)
	public void validateLatestVersionSleected(){
		boolean actual=downloadPageObj.isLatestVersionSelected();
		Assert.assertEquals(actual, true);
	}
	
	@Test(priority=3)
	public void validateAlertMsgText(){
		homePageObj.clickDownloadLink();
		downloadPageObj.clickCoreToggle();
		String actual=downloadPageObj.getAlertText();
		if(actual.contains("Are you sure you want to remove ")){
			Assert.assertTrue(true);
		}else{
			Assert.assertTrue(false);
		}
	}
	
	@Test(priority=4)
	public void validateCancelAlert(){
		homePageObj.clickDownloadLink();
		downloadPageObj.clickCoreToggle();
		downloadPageObj.clickCancelBtn();
		boolean actual=downloadPageObj.verifyCheckbox();
		Assert.assertEquals(actual, true);
	}
	
	@Test(priority=5)
	public void validateRemoveAlert(){
		homePageObj.clickDownloadLink();
		downloadPageObj.clickCoreToggle();
		downloadPageObj.clickRemoveBtn();
		boolean actual=downloadPageObj.verifyCheckbox();
		Assert.assertEquals(actual, false);
	}
	
	
	
	
}
