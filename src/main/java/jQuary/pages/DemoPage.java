package jQuary.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoPage {
	
WebDriver driver;
	
	public DemoPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//h1")
    WebElement heading;
	
	@FindBy(linkText="Selectable")
    WebElement selectLink;
	
	@FindBy(xpath="//li[text()='Item 2']")
    WebElement selectListLink;
	
	@FindBy(xpath="//li[text()='Item 2']")
    WebElement getClassAttribute;
	
	@FindBy(linkText="Accordion")
    WebElement AccordionLink;
	
	@FindBy(xpath="//h3[text()='Section 1']")
    WebElement select1Link;
	
	@FindBy(xpath="//div[@id='ui-id-2']")
    WebElement select1Text;
	
	@FindBy(xpath="//h3[text()='Section 2']")
    WebElement select2Link;
	
	@FindBy(xpath="//*[@id='ui-id-4']/p")
    WebElement select2Text;
	
	@FindBy(linkText="Datepicker")
    WebElement datePickerLink;
	
	@FindBy(id="datepicker")
    WebElement datePickerTextbox;
	
	@FindBy(xpath="//a[text()='15']")
    WebElement selectDate;

	@FindBy(linkText="Selectmenu")
    WebElement selectmenuLink;
	
	@FindBy(id="speed-button")
    WebElement dropdown;
	
	@FindBy(xpath="//span[text()='Medium']")
    WebElement mediumMenu;
	

	@FindBy(xpath="//span[@id='speed-button']/span[2]")
    WebElement dropdownVal;
	
	@FindBy(linkText="Tabs")
    WebElement tab;
	
	@FindBy(linkText="Proin dolor")
    WebElement tab2;
	
	@FindBy(id="tabs-2")
    WebElement tab2text;
	
	
	public String getTab2Text(){
		return tab2text.getText();
	}
	
	public void clickTab2(){
		tab2.click();
	}
	
	public void clickTabLink(){
		tab.click();
	}
	
	public void clickSelectmenuLink(){
		selectmenuLink.click();
	}
	
	public void selectDropDown(){
		dropdown.click();
		mediumMenu.click();
	}
	
	public String getDropDownVal(){
		return dropdownVal.getText();
	}
	
	public void clickDatePickerLink(){
		datePickerLink.click();
	}
	
	public void clickDatePickerTextBox() throws Exception{
		datePickerTextbox.click();
		selectDate.click();
	}
	
	public String getDate(){
		return datePickerTextbox.getAttribute("value");
	}
	
	
	public void clickSection1(){
		select1Link.click();
	}
	
	public String getSection1Text(){
		return select1Text.getText();
	}
	
	public void clickSection2(){
		select2Link.click();
	}
	
	public String getSection2Text(){
		return select2Text.getText();
	}

	public void clickSelectable(){
		selectLink.click();
	}
	
	public void clickAccordionLink(){
		AccordionLink.click();
	}
	
	
	public void clickItem(){
		selectListLink.click();
	}
	
	public String getHeading(){
		return heading.getText();
	}
	
	public String getListClass(){
		return getClassAttribute.getAttribute("class");
	}
	

	
	
	public void selectFrame(){
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	}
	
	public void quitFrame(){
		driver.switchTo().defaultContent();
	}
}
