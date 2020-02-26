package com.sample;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.CommonMethods;

public class CookbookPageTests extends CommonMethods {
	
	@Test
	public void validateCookBokHeading(){
		homePageObj.clickQUnitLink();
		Assert.assertEquals(cookbookPageObj.getHeading(), "QUnit: A JavaScript Unit Testing framework.");
	}
	
	@Test
	public void validateHidePassedTest(){
		homePageObj.clickQUnitLink();
		cookbookPageObj.selectFrame();
		cookbookPageObj.clickPassedCheckbox();
		boolean actual=cookbookPageObj.clickPassedTestRes();
		cookbookPageObj.quitFrame();
		Assert.assertEquals(actual,false);
	}
	
	@Test
	public void validateRerunTest() throws Exception{
		homePageObj.clickQUnitLink();
		cookbookPageObj.selectFrame();
		cookbookPageObj.clickRerun();
		Thread.sleep(4000);
		boolean actual=cookbookPageObj.getRerunAllText();
		Thread.sleep(2000);
		cookbookPageObj.quitFrame();
		Assert.assertEquals(actual,true);
	}
	
	@Test
	public void validatesearchTest() throws Exception{
		homePageObj.clickQUnitLink();
		cookbookPageObj.selectFrame();
		cookbookPageObj.enterSearch();
		Thread.sleep(2000);
		boolean actual=cookbookPageObj.clickPassedTestRes();
		cookbookPageObj.quitFrame();
		Assert.assertEquals(actual,true);
	}
	
	@Test
	public void validatePluginsHeading(){
		homePageObj.clickQUnitLink();
		homePageObj.clickPlugin();
		Assert.assertEquals(cookbookPageObj.getHeading(), "The jQuery Plugin Registry");
	}
	
}
