package com.openCartAbstractComponent.com;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbsctractComponent {
	
	WebDriver driver;
	
	public AbsctractComponent(WebDriver driver){
		
		this.driver = driver;
	}
	
	public WebElement waitPresenceOfElementLocated(By findBy) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement container = wait.until(ExpectedConditions.presenceOfElementLocated(findBy));
		return container;
	}
	
	public void waitPresenceOfWebElementLocated(WebElement findBy) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(findBy));		
	}
	
	
	
}
