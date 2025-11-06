package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewAddressPage {
	
	public WebDriver driver; 
	
	public NewAddressPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public boolean verify_the_add_address_text() {
		
		 WebElement addNewAddress = driver.findElement(By.xpath("//*[@id='content']/h2"));
		 return addNewAddress.isDisplayed();
	}
	
	public void enter_firstName_lastName_comp_add1(String firstName, String lastName, String company, String address1) {
		
		WebElement txtfirstName = driver.findElement(By.cssSelector("input#input-firstname"));
		WebElement txtlastName = driver.findElement(By.cssSelector("input#input-lastname"));
		WebElement txtcompany =	driver.findElement(By.cssSelector("input#input-company"));
		WebElement txtaddress1 = driver.findElement(By.cssSelector("input#input-address-1"));
		
		txtfirstName.sendKeys(firstName);
		txtlastName.sendKeys(lastName);
		txtcompany.sendKeys(company);
		txtaddress1.sendKeys(address1);
	}
	
	public void enter_address2_city_postcode_country(String address2, String city, String postcode){
		
		WebElement txtaddress2 = driver.findElement(By.cssSelector("input#input-address-2"));
		WebElement txtCity = driver.findElement(By.cssSelector("input#input-city"));
		WebElement txtPostCode = driver.findElement(By.cssSelector("input#input-postcode"));
		
		txtaddress2.sendKeys(address2);
		txtCity.sendKeys(city);
		txtPostCode.sendKeys(postcode);
	}
	
	public void choose_Country_Region_DefaultAddress(String country, String region, String defAdd) throws InterruptedException{
			
		Select countryDropDown = new Select(driver.findElement(By.cssSelector("select#input-country")));
		countryDropDown.selectByVisibleText(country);
		Thread.sleep(1500);
		
		Select regionDropDown = new Select(driver.findElement(By.cssSelector("Select#input-zone")));
		regionDropDown.selectByVisibleText(region);
		Thread.sleep(1500);
		
		if(defAdd=="Yes") {
			
			WebElement optDefAdd =	driver.findElement(By.cssSelector("input[value='1']"));
			optDefAdd.click();
			System.out.println("Default address YES clicked");
		} else {
			System.out.println("No option clicked By default");
		}
		
		
	}

}
