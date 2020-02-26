package com.sample;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.CommonMethods;

public class HomePageTests extends CommonMethods {
	
	@Test
	public void validateJqueryIntroText(){
		String expected = "jQuery UI is a curated set of user interface interactions, effects, widgets, and themes built on top of the jQuery JavaScript Library. Whether you're building highly interactive web applications or you just need to add a date picker to a form control, jQuery UI is the perfect choice.";
		String actual=homePageObj.getIntroText();
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void validateMenusNavigation(){
		String demoHeading = "jQuery UI Demos";
		String downloadHeading = "Download Builder";
		String documentationHeading = "jQuery UI 1.12 API Documentation";
		String themesHeading = "ThemeRoller";
		String developmentHeading = "Development Center";
		String supportHeading = "Support Center";
		String blogHeading = "The Future of jQuery UI and jQuery Mobile";
		String aboutHeading = "About jQuery UI";
		
		homePageObj.clickDemoLink();
		Assert.assertEquals(demoPageObj.getHeading(), demoHeading);
		homePageObj.clickDevLink();
		Assert.assertEquals(developmentPageObj.getHeading(), developmentHeading);
		homePageObj.clickBlogLink();
		Assert.assertEquals(blogsPageObj.getHeading(), blogHeading);
		homePageObj.clickApiLink();
		Assert.assertEquals(documentPageObj.getHeading(), documentationHeading);
		homePageObj.clickDownloadLink();
		Assert.assertEquals(downloadPageObj.getHeading(), downloadHeading);
		homePageObj.clickSupportLink();
		Assert.assertEquals(supportPageObj.getHeading(), supportHeading);
		homePageObj.clickThemeLink();
		Assert.assertEquals(themesPageObj.getHeading(), themesHeading);
	}
	
	@Test
	public void validateSearchBtn(){
		String searchVal="text";
		homePageObj.typeSearchBox(searchVal);
		homePageObj.clickSearchButton();
		String searchText=homePageObj.getSearchText();
		Assert.assertEquals(searchText, "Search Results for: "+searchVal);
	}
	
	@Test
	public void validateLogoRedirection(){
		homePageObj.clickLogoLink();
		Assert.assertEquals(driver.getCurrentUrl(), "https://jqueryui.com/");
	}
	
	@Test
	public void validateSupportProjectBtn(){
		homePageObj.clickSuportProjectButton();
		Assert.assertEquals(driver.getCurrentUrl(), "https://openjsf.org/");
	}
	
	
}
