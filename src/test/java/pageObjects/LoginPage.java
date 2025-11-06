package pageObjects;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public static WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void validCredentials(String userName, String password) {
		
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(userName);
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(password);
		System.out.println(userName+" and "+password+ "has entered");
	}
	
	public void clickLoginButton() {
		
		driver.findElement(By.xpath("//*[@id='content']/div/div[2]/div/form/input")).click();
		System.out.println("Login clicked");
	}
	
	public void verifyHomePageLogo() {
		
		
		WebElement logoOChome = driver.findElement(By.cssSelector("div#logo"));
		logoOChome.isDisplayed();
		System.out.println("Logo Verified");
		
		
	}
	
	public void clickLogoutButton() {
		
		driver.findElement(By.xpath(".list-group a.list-group-item[href*='logout']")).click();;
		System.out.println("Logout clicked");
	}
	
	
	public void verifyLogoutPageTitle(String logoutTitle) throws InterruptedException {
		
		driver.findElement(By.cssSelector("div#content h1")).isDisplayed();
		
		Thread.sleep(1000);
		System.out.println("Logout Page tititle verified");
		driver.quit();
	}

}
