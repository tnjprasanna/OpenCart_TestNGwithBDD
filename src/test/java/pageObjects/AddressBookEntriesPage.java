package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressBookEntriesPage {

	public WebDriver driver; 
	
	public AddressBookEntriesPage(WebDriver driver) {
	
		this.driver = driver;
	}
	
	//=================================================
		public void clickAddressBookLink() {
			
			WebElement addressBookLink = driver.findElement(By.xpath("//a[text()='Address Book']"));
			
			if(addressBookLink.isDisplayed()) {
				addressBookLink.click();
			}	
		}
		
		public boolean verifyTextAddBookEntries() {
			
			WebElement entriesText = driver.findElement(By.xpath("//*[@id='content']/h2"));
			boolean dispText = entriesText.isDisplayed();
			return dispText;
		}
		
		public void clickNewAddressButton() {
			
			WebElement btnNewAddress = driver.findElement(By.xpath("//a[text()='New Address']"));
			btnNewAddress.click();
		}
		//================================================================================

}
