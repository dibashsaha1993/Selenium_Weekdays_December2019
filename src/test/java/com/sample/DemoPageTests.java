package com.sample;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.CommonMethods;

public class DemoPageTests extends CommonMethods {
	
	@Test
	public void validateInteractions(){
		demoPageObj.clickSelectable();
		demoPageObj.selectFrame();
		demoPageObj.clickItem();
		String actual=demoPageObj.getListClass();
		demoPageObj.quitFrame();
		Assert.assertEquals(actual, "ui-widget-content ui-selectee ui-selected");
	}
	
	@Test
	public void validateAccordion() throws Exception{
		String expectedText2 = "Sed non urna. Donec et ante. Phasellus eu ligula. Vestibulum sit amet purus. Vivamus hendrerit, dolor at aliquet laoreet, mauris turpis porttitor velit, faucibus interdum tellus libero ac justo. Vivamus non quam. In suscipit faucibus urna.";
		String expectedText1 = "Mauris mauris ante, blandit et, ultrices a, suscipit eget, quam. Integer ut neque. Vivamus nisi metus, molestie vel, gravida in, condimentum sit amet, nunc. Nam a nibh. Donec suscipit eros. Nam mi. Proin viverra leo ut odio. Curabitur malesuada. Vestibulum a velit eu ante scelerisque vulputate.";
		
		demoPageObj.clickAccordionLink();
		demoPageObj.selectFrame();
		demoPageObj.clickSection1();
		String actualText1=demoPageObj.getSection1Text();
		Assert.assertEquals(actualText1, expectedText1);
		
		demoPageObj.clickSection2();
		Thread.sleep(5000);
		String actualText2=demoPageObj.getSection2Text();
		demoPageObj.quitFrame();
		Assert.assertEquals(actualText2, expectedText2);
	}
	
	@Test
	public void validateDatePicker() throws Exception{
		demoPageObj.clickDatePickerLink();
		demoPageObj.selectFrame();
		demoPageObj.clickDatePickerTextBox();
		String actual=demoPageObj.getDate();
		demoPageObj.quitFrame();
		Assert.assertEquals(actual, "01/15/2020");
	}
	
	@Test
	public void validateDropDwon() throws Exception{
		demoPageObj.clickSelectmenuLink();
		demoPageObj.selectFrame();
		demoPageObj.selectDropDown();
		String actual=demoPageObj.getDropDownVal();
		demoPageObj.quitFrame();
		Assert.assertEquals(actual, "Medium");
	}
	
	@Test
	public void validateTab() {
		String expectedText = "Morbi tincidunt, dui sit amet facilisis feugiat, odio metus gravida ante, ut pharetra massa metus id nunc. Duis scelerisque molestie turpis. Sed fringilla, massa eget luctus malesuada, metus eros molestie lectus, ut tempus eros massa ut dolor. Aenean aliquet fringilla sem. Suspendisse sed ligula in ligula suscipit aliquam. Praesent in eros vestibulum mi adipiscing adipiscing. Morbi facilisis. Curabitur ornare consequat nunc. Aenean vel metus. Ut posuere viverra nulla. Aliquam erat volutpat. Pellentesque convallis. Maecenas feugiat, tellus pellentesque pretium posuere, felis lorem euismod felis, eu ornare leo nisi vel felis. Mauris consectetur tortor et purus.";
		
		demoPageObj.clickTabLink();
		demoPageObj.selectFrame();
		demoPageObj.clickTab2();
		String actualText1=demoPageObj.getTab2Text();
		Assert.assertEquals(actualText1, expectedText);
		
	}
	
}
