package jQuary.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadPage {
	
WebDriver driver;
	
	public DownloadPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//h1")
    WebElement heading;
	
	@FindBy(xpath="//*[@id='download-builder']/form/div[2]/h2")
    WebElement version;
	
	@FindBy(xpath="//*[@id='download-builder']/form/div[3]/h2")
    WebElement component;
	
	
	@FindBy(xpath="//*[@id='download-builder']/form/div[4]/div[1]/div[1]/label/input")
    WebElement coreToggleCheckbox;
	
	@FindBy(xpath="//*[@id='ui-id-1']/p")
    WebElement alertMsg;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/button[2]")
    WebElement alertCancel;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/button[1]")
    WebElement alertRemove;
	

	@FindBy(xpath="//*[@id='version-1.12.1']")
    WebElement radioBtn;
	
	
	public boolean isLatestVersionSelected(){
		return radioBtn.isSelected();
	}
	
	public boolean verifyCheckbox(){
		return coreToggleCheckbox.isSelected();
	}
	
	public void clickRemoveBtn(){
		alertRemove.click();
	}

	
	public void clickCancelBtn(){
		alertCancel.click();
	}
	
	public String getVersionText(){
		return version.getText();
	}
	
	public String getCompText(){
		return component.getText();
	}
	
	public String getHeading(){
		return heading.getText();
	}
	
	public void clickCoreToggle(){
		coreToggleCheckbox.click();
	}
	
	public String getAlertText(){
		return alertMsg.getText();
	}
	
}
