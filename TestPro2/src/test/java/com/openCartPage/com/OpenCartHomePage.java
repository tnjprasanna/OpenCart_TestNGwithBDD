package com.openCartPage.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.openCartAbstractComponent.com.AbsctractComponent;

public class OpenCartHomePage extends AbsctractComponent  {
	
	WebDriver driver;
	
	public OpenCartHomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(tagName="a")
	List<WebElement> options;
	
	@FindBy(css="input[name='search']")
	WebElement searchBox;
	
	By optionList = By.id("column-right");
	By atag = By.tagName("a");
	
	
	public List<WebElement> getOptionName(){
		
		waitPresenceOfElementLocated(optionList).findElements(atag);
		return options;
	}
	
	public boolean verifySearchBox() {
		boolean displaySearchBox = searchBox.isDisplayed();
		return displaySearchBox;
	}
	
	public WebElement getOptionsByName(String name) {
		
		WebElement addressBookOption = 
		options.stream()
	    .filter(link -> "Address Book".equals(link.getText().trim()))
	    .findFirst().orElse(null);
		 return addressBookOption;
	}
	
	public void clickOptionsByName(String name) {
		
		WebElement addressBookOption = getOptionsByName(name);
		addressBookOption.click();
		OpenCartAddressBookPage addBookPage = new OpenCartAddressBookPage(driver);
	}
	

}
