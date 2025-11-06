package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpenCartHomePage {
	
	public WebDriver driver;
	
	public OpenCartHomePage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void clickAddressBookLink() {
		
		WebElement addressBookLink = driver.findElement(By.xpath("//a[text()='Address Book']"));
		
		if(addressBookLink.isDisplayed()) {
			addressBookLink.click();
		}		
	}
	
	
}
