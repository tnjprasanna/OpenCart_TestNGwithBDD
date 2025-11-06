package com.openCartPage.com;

import java.time.Duration;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.openCartAbstractComponent.com.AbsctractComponent;

public class OpenCartAddressBookPage extends AbsctractComponent {
	
	WebDriver driver;
	
	public OpenCartAddressBookPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#content > div.buttons.clearfix > div.pull-right > a")
	WebElement NewAddress;
	
	public void clickNewAddress() {
		NewAddress.click();
	}
	
	
	
}
