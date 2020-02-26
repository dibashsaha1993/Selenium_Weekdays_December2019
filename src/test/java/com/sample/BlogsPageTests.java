package com.sample;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.CommonMethods;

public class BlogsPageTests extends CommonMethods {
	
	@Test
	public void validateDesignAndDev() throws Exception{
		homePageObj.clickBlogLink();
		test.log(LogStatus.INFO, "Blog link cliked sucesfully");
		blogsPageObj.clickDesign();
		Assert.assertEquals(blogsPageObj.getHeading(), "Category Archives: Design");
		blogsPageObj.clickDevelopment();
		test.log(LogStatus.INFO, "Blog download link cliked sucesfully");
		Thread.sleep(4000);
		if(blogsPageObj.getHeading().equals("Category Archives: Development")) {
			Assert.assertTrue(true);
			test.log(LogStatus.PASS, "Navigated to the specified URL");
		}else{
			Assert.assertTrue(false);
			test.log(LogStatus.PASS, "failed to load the url");
		}
	}
	
	@Test
	public void validateUnCategorizedTag() throws Exception{
		homePageObj.clickBlogLink();
		blogsPageObj.clickUncategorized();
		Thread.sleep(4000);
		Assert.assertEquals(themesPageObj.getHeading(), "Category Archives: Uncategorized");
	}
	
	@Test
	public void validateReleaseTag() throws Exception{
		homePageObj.clickBlogLink();
		blogsPageObj.clickReleasesTag();
		Thread.sleep(4000);
		Assert.assertEquals(themesPageObj.getHeading(), "Category Archives: Releases");
	}
	
	@Test
	public void validateRecentPost() throws Exception{
		homePageObj.clickBlogLink();
		blogsPageObj.clickRecentPostTag();
		Thread.sleep(4000);
		Assert.assertEquals(blogsPageObj.getHeading(), "jQuery UI 1.12.1");
	}
	
	@Test
	public void validateArchieves() throws Exception{
		homePageObj.clickBlogLink();
		blogsPageObj.clickArchives();
		Thread.sleep(4000);
		Assert.assertEquals(blogsPageObj.getHeading(), "Monthly Archives: December 2017");
	}
	
}
