package com.sample;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.CommonMethods;

public class ThemePageTests extends CommonMethods {
	
	@Test
	public void validateInteractions(){
		homePageObj.clickThemeLink();
		themesPageObj.clickAccor1();
		String expected="Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet.";
		Assert.assertEquals(themesPageObj.getAccor1Text(), expected);
	}
	
	@Test
	public void validateOpenDialog() throws Exception{
		homePageObj.clickThemeLink();
		themesPageObj.clickOpenDialog();
		String expected="Dialog Title";
		Thread.sleep(2000);
		Assert.assertEquals(themesPageObj.getDialogText(), expected);
	}
	
	@Test
	public void validateDownloadThemeBtn() throws Exception{
		homePageObj.clickThemeLink();
		themesPageObj.clickDownloadThemeBtn();
		Thread.sleep(2000);
		Assert.assertEquals(downloadPageObj.getHeading(), "Download Builder");
	}
	
	@Test
	public void validateThemeRollerBtns() throws Exception{
		homePageObj.clickThemeLink();
		boolean actual=themesPageObj.checkRollText();
		Assert.assertEquals(actual, true);
	}
	
	@Test
	public void validateGalleryRollerBtns() throws Exception{
		homePageObj.clickThemeLink();
		boolean actual=themesPageObj.checkGalleryText();
		Assert.assertEquals(actual, true);
	}
	
	@Test
	public void validateHelpRollerBtns() throws Exception{
		homePageObj.clickThemeLink();
		boolean actual=themesPageObj.checkHelpText();
		Assert.assertEquals(actual, true);
	}
	
}
