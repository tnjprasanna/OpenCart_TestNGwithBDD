package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddressBookEntriesPage;
import pageObjects.NewAddressPage;
import pageObjects.OpenCartHomePage;



public class AddressBookLinkEntriesSteps {
	
	public WebDriver driver;
	public OpenCartHomePage ocHomePage;
	public AddressBookEntriesPage addBookEntriesPage;
	
	
	
	@Given("Click the AdressBook link")
	public void click_the_adress_book_link() {
		
		ocHomePage = new OpenCartHomePage(driver);
		addBookEntriesPage = new AddressBookEntriesPage(driver);
		ocHomePage.clickAddressBookLink();
		System.out.println("Address Book link has clicked");
	}

	@When("System load the AdressBookEntries Page")
	public void system_load_the_adress_book_entries_page() {
		
		//addBookEntriesPage = new AddressBookEntriesPage(driver);
		addBookEntriesPage.verifyTextAddBookEntries();
	}

	@Then("Click the New Address button")
	public void click_the_new_address_button() {
		
		addBookEntriesPage.clickNewAddressButton();
		
	}



}
