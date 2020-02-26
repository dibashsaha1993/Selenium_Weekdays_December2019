package jQuary.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContributePage {
	
WebDriver driver;
	
	public ContributePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//h1")
    WebElement heading;
	
	@FindBy(linkText="Contribute")
    WebElement contributeLink;
	
	@FindBy(linkText="CLA")
    WebElement claLink;
	
	@FindBy(linkText="SUBSCRIBE FOR UPDATES")
    WebElement subscribebtn;
	
	@FindBy(xpath="//*[@id='content']/div[4]/div/form/div[2]/label")
    WebElement email;
	
	@FindBy(xpath="//*[@id='content']/div[4]/div/form/div[3]/label")
    WebElement pass;
	
	@FindBy(id="email")
    WebElement emailAddress;
	
	@FindBy(name="password")
    WebElement password;
	
	
	@FindBy(id="submit")
    WebElement submit;
	
	@FindBy(linkText="Log In")
    WebElement loginLink;
	
	@FindBy(xpath="//*[contains(text(),'Please')]")
    WebElement errorMsg;
	
	@FindBy(xpath="//*[contains(text(),'That email address does not have a lists')]")
    WebElement invalidErrorMsg;
	
	@FindBy(linkText="Registration")
    WebElement registration;
	
	@FindBy(xpath="//*[@id='content']/div[4]/div/form/div[1]/span")
    WebElement regError;
	
	
	
	public String getErrorText(){
		 return regError.getText();
	}
	
	public void clickRegLink(){
		 registration.click();
	}
	
	public boolean verfiyInvalidText(){
		return invalidErrorMsg.isDisplayed();
	}
	
	public String verfiyEmailText(){
		return email.getText();
	}
	
	public void enterEmail(String val){
		emailAddress.clear();
		emailAddress.sendKeys(val);
	}
	
	public void enterPassword(String val){
		password.clear();
		password.sendKeys(val);
	}
	
	public void clickSubmitBtn(){
		submit.click();
	}
	
	public boolean verifyMsg(){ 
		return errorMsg.isDisplayed();
	}
	
	public String verfiyPAsswordText(){
		return pass.getText();
	}
	
	public void clickLoginLink(){
		loginLink.click();
	}
	
	public void clickSubscribeBtn(){
		subscribebtn.click();
	}
	
	public boolean verifySubscribeBtn(){
		return subscribebtn.isDisplayed();
	}
	
	public void clickCla(){
		claLink.click();
	}
	public void clickContribute(){
		contributeLink.click();
	}
	public String getHeading(){
		return heading.getText();
	}
}
