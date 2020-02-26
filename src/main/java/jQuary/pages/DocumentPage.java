package jQuary.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentPage {
	
WebDriver driver;
	
	public DocumentPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//h1")
    WebElement heading;
	
	@FindBy(xpath="//*[@id='content']/h2")
    WebElement doc;
	
	@FindBy(linkText="jQuery UI")
    WebElement clickJqueyHome;
	
	@FindBy(linkText="main site")
    WebElement mainSite;
	
	@FindBy(linkText="jQuery UI 1.11 API Documentation")
    WebElement docApi;
	
	@FindBy(linkText="jQuery Learning Center")
    WebElement jQueryLearn;
	
	
	public void clickjQueryLearnLink(){
		jQueryLearn.click();
	}
	
	public void clickApiDocLink(){
		docApi.click();
	}
	
	
	public void clickMainSite(){
		 mainSite.click();
	}
	
	
	public void clickJqueyHome(){
		 clickJqueyHome.click();
	}
	
	public String getDocText(){
		return doc.getText();
	}
	
	public String getHeading(){
		return heading.getText();
	}
}
