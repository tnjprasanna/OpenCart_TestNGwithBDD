package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.NewAddressPage;



public class AddNewAddressSteps {

	public WebDriver driver;
	public NewAddressPage newAddressPage;
	
	
	@Given("Verify the AddAddress page load")
	public void verify_the_add_address_page_load() {
		newAddressPage = new NewAddressPage(driver);
		newAddressPage.verify_the_add_address_text();
	}

	@When("User enter the FirstName as {string} and LastName as {string} and Company as {string} and Address1 as {string}")
	public void user_enter_the_first_name_as_and_last_name_as_and_company_as_and_address1_as(String fn, String ln, String comp, String add1){
	    
		newAddressPage.enter_firstName_lastName_comp_add1(fn, ln, comp, add1);
	}

	@When("User enter the Address2 as {string} and City as {string} and PostCode as {string}")
	public void user_enter_the_address2_as_and_city_as_and_post_code_as(String add2, String city, String postCode){
	    
		newAddressPage.enter_address2_city_postcode_country(add2, city, postCode);
	}

	@When("User enter the  Country as {string} and Region as {string} and DefaultAddress {string} in address book details")
	public void user_enter_the_country_as_and_region_as_and_default_address_in_address_book_details(String country, String region, String defAdd) throws InterruptedException{
	    
		newAddressPage.choose_Country_Region_DefaultAddress(country, region, defAdd);
	}

	@Then("User click the Continue button")
	public void user_click_the_continue_button() {
	   
		
	}

	@Then("Verify the {string}")
	public void verify_the(String string) {
	   
		
	}


	
	
}
