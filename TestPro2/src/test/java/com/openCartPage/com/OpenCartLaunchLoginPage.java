package com.openCartPage.com;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.openCartAbstractComponent.com.AbsctractComponent;

public class OpenCartLaunchLoginPage extends AbsctractComponent {
	
	WebDriver driver;
	
	public OpenCartLaunchLoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#content > div > div:nth-child(2) > div > h2")
	WebElement retCust;
	
	@FindBy(id="input-email")
	WebElement userName;
	
	@FindBy(css="input#input-password")
	WebElement opcPassword;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginButton;
	
	@FindBy(css="div.alert-dismissibl")
	WebElement errorMessage;
	
	public void launchURL() {
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String returningCust = retCust.getText();
		Assert.assertEquals(returningCust, "Returning Customer"); 
		Assert.assertEquals(userName.isDisplayed(),true);
		Assert.assertEquals(opcPassword.isDisplayed(),true);
	}
	
	public OpenCartHomePage loginApplication(String email, String password) throws InterruptedException {
		
		userName.sendKeys(email);
		opcPassword.sendKeys(password);
		loginButton.click();
		Thread.sleep(3000);
		OpenCartHomePage homePage = new OpenCartHomePage(driver);
		return homePage;
	}
	
	public String getErrorMsg() {
		
		waitPresenceOfWebElementLocated(errorMessage); System.out.println("****FROM****"+errorMessage.getText());
		String LoginErrorMessage = errorMessage.getText();
		return LoginErrorMessage;
	}
	
}
