package jQuary.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlogsPage {
	
WebDriver driver;
	
	public BlogsPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//h1")
    WebElement heading;

	@FindBy(linkText="Design")
    WebElement designLink;
	
	@FindBy(xpath="//*[@id='sidebar']/aside[1]/ul/li[2]/a")
    WebElement developmentLink;

	@FindBy(linkText="Uncategorized")
    WebElement uncategorizedLink;
	
	@FindBy(linkText="Releases")
    WebElement releasesTag;
	
	@FindBy(linkText="jQuery UI 1.12.1")
    WebElement recentPostLink;
	
	@FindBy(linkText="December 2017")
    WebElement archieve;
	

	
	public void clickArchives(){
		archieve.click();
	}
	
	public void clickRecentPostTag(){
		recentPostLink.click();
	}


	
	public void clickReleasesTag(){
		releasesTag.click();
	}

	
	public void clickUncategorized(){
		uncategorizedLink.click();
	}

	
	public void clickDesign(){
		designLink.click();
	}
	
	
	public void clickDevelopment(){
		developmentLink.click();
	}
	

	
	public String getHeading(){
		return heading.getText();
	}
}
