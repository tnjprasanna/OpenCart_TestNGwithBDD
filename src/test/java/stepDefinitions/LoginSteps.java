package stepDefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;


public class LoginSteps {
	
	
	public WebDriver driver;
	public LoginPage loginPage;
	
	@Given("User launch the browser")
	public void user_launch_the_browser() {
		
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
		
	}

	@When("User opens the URL {string}")
	public void user_opens_the_url(String url) {
		
		driver.get(url);
		
	}

	@When("User enters email {string} and password as {string}")
	public void user_enters_email_and_password_as(String userName, String password) {
	    
		loginPage.validCredentials(userName, password);
	}

	@When("Click the Login button")
	public void click_the_login_button() throws InterruptedException {
		
		loginPage.clickLoginButton();
		Thread.sleep(1500);
	}

	@Then("Page logo should get display")
	public void page_logo_should_get_display() {
			
		loginPage.verifyHomePageLogo();
	
	}

	@When("User clicks on logout link")
	public void user_clicks_on_logout_link() {
		
		loginPage.clickLogoutButton();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String logoutTitle) throws InterruptedException {
	    
		loginPage.verifyLogoutPageTitle(logoutTitle);
	}

	@Then("Close browser")
	public void close_browser() {
	  
		   System.out.println("Browser closed finally");
	 
	}

}
