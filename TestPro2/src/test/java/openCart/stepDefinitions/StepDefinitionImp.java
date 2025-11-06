package openCart.stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.openCartPage.com.OpenCartHomePage;
import com.openCartPage.com.OpenCartLaunchLoginPage;
import com.openCartTestComponent.com.BaseTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionImp extends BaseTest {
	
	public OpenCartLaunchLoginPage landingPage; 
	public OpenCartHomePage homePage;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginButton;
	
	@Given("I landed on OpenCart Page")
	public void  I_landed_on_OpenCart_Page() throws IOException {
		
		landingPage = launchApp();	
	}
	
	@Given("^logged in with the Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void logged_in_with_the_username_and_password(String userName, String password) throws InterruptedException{
		
		homePage  = landingPage.loginApplication(userName, password);
	}
	
	@When("^click login button$")
	public void click_login_button() {
		
		System.out.println("Login button clicked");
	}
	
	@Then("^Verify the searchBox$")
	public void Verify_the_searchBox() {
		
		boolean searchBoxDisplay = homePage.verifySearchBox();
		driver.close();
	}
	
}
