package com.openCartPage.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.openCartAbstractComponent.com.AbsctractComponent;

public class OpenCartNewAddressPage  extends AbsctractComponent{
	
	WebDriver driver;
	
	public OpenCartNewAddressPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
}
