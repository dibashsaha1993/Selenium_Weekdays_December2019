package jQuary.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="jQuery UI")
    WebElement logo;
	
	@FindBy(xpath="//p[@class='intro']")
    WebElement introText;
	
	@FindBy(linkText="Demos")
    WebElement demoLink;
	
	@FindBy(linkText="Download")
    WebElement downloadLink;

	@FindBy(linkText="API Documentation")
    WebElement apiLink;
	
	@FindBy(linkText="Themes")
    WebElement themeLink;
	
	@FindBy(linkText="Development")
    WebElement devLink;
	
	@FindBy(xpath="(//a[text()='Support'])[2]")
    WebElement supportLink;
	
	@FindBy(linkText="Blog")
    WebElement blogLink;
	
	@FindBy(linkText="About")
    WebElement aboutLink;
	
	@FindBy(name="s")
    WebElement searchTextBox;
	
	@FindBy(xpath="//button[@type='submit']")
    WebElement searchButton;
	
	@FindBy(xpath="//h1")
    WebElement searchText;
	
	@FindBy(xpath="//img[@alt='Support the JS Foundation']")
    WebElement supportProjectButton;
	
	@FindBy(linkText="QUnit")
    WebElement qunit;


	@FindBy(linkText="Plugins")
    WebElement pluginsLink;

	
	public void clickPlugin(){
		 pluginsLink.click();
	}
	
	
	public String getIntroText(){
		return introText.getText();
	}
	
	public String getSearchText(){
		return searchText.getText();
	}
	
	
	public void typeSearchBox(String value){
		searchTextBox.clear();
		searchTextBox.sendKeys(value);
	}
	
	public void clickSuportProjectButton(){
		supportProjectButton.click();
	}
	
	public void clickSearchButton(){
		searchButton.click();
	}
	
	public void clickDemoLink(){
		demoLink.click();
	}
	
	public void clickThemeLink(){
		themeLink.click();
	}
	
	public void clickApiLink(){
		apiLink.click();
	}
	
	public void clickDownloadLink(){
		downloadLink.click();
	}

	public void clickDevLink(){
		devLink.click();
	}

	public void clickSupportLink(){
		supportLink.click();
	}

	public void clickBlogLink(){
		blogLink.click();
	}

	public void clickAboutLink(){
		aboutLink.click();
	}
	
	public void clickLogoLink(){
		logo.click();
	}
	
	public void clickQUnitLink(){
		qunit.click();
	}

}
