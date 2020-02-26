package jQuary.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThemesPage {
	
WebDriver driver;
	
	public ThemesPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//h1")
    WebElement heading;
	
	@FindBy(xpath="//*[@id='ui-id-4']")
    WebElement accord1;
	
	@FindBy(xpath="//*[@id='ui-id-5']")
    WebElement accord1Text;
	
	@FindBy(xpath="//span[@id='ui-id-14']")
    WebElement dialogText;
	
	@FindBy(id="dialog-link")
    WebElement openDialogLink;
	
	@FindBy(linkText="Roll Your Own")
    WebElement rollThemeBtn;
	
	@FindBy(linkText="Gallery")
    WebElement galleryThemeBtn;
	
	@FindBy(linkText="Help")
    WebElement helpThemeBtn;
	
	@FindBy(xpath="//*[@id='downloadTheme']")
    WebElement downloadThemeBtn;
	
	
	public boolean checkRollText(){
		return rollThemeBtn.isDisplayed();
	}
	
	
	public boolean checkGalleryText(){
		return galleryThemeBtn.isDisplayed();
	}
	
	
	public boolean checkHelpText(){
		return helpThemeBtn.isDisplayed();
	}
	
	
	public void clickDownloadThemeBtn(){
		downloadThemeBtn.click();
	}
	
	public void clickOpenDialog(){
		openDialogLink.click();
	}
	
	public String getDialogText(){
		return dialogText.getText();
	}
	
	public String getAccor1Text(){
		return accord1Text.getText();
	}
	
	public void clickAccor1(){
		accord1.click();
	}
	
	public String getHeading(){
		return heading.getText();
	}
}
