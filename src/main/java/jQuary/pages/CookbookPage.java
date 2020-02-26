package jQuary.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CookbookPage {
	
WebDriver driver;
	
	public CookbookPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//h1")
    WebElement heading;
	

	@FindBy(xpath="//*[@id='qunit-urlconfig-hidepassed']")
    WebElement passedTestCheckbox;
	
	@FindBy(id="qunit-tests")
    WebElement passedTestResult;
	
	
	@FindBy(xpath="//ol[@id='qunit-tests']/li/a")
    WebElement rerun;
	
	
	@FindBy(xpath="//a[text()='Run all tests']")
    WebElement rerunTests;
	
	@FindBy(name="filter")
    WebElement filter;
	

	@FindBy(xpath="//*[@id='qunit-testrunner-toolbar']/form[2]/button")
    WebElement filterGoBtn;
	

	
	public void enterSearch(){
		filter.clear();
		filter.sendKeys("test");
		filterGoBtn.click();
	}
	

	
	public boolean getRerunAllText(){
		return rerunTests.isDisplayed();
	}
	
	public void clickRerun(){
		 rerun.click();
	}

	public void clickPassedCheckbox(){
		passedTestCheckbox.click();
	}
	
	public boolean clickPassedTestRes(){
		return passedTestResult.isDisplayed();
	}
	
	public String getHeading(){
		return heading.getText();
	}
	
	public void selectFrame(){
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
	}
	
	public void quitFrame(){
		driver.switchTo().defaultContent();
	}
}
