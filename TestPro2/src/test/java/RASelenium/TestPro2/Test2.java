package RASelenium.TestPro2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	
		
		driver.findElement(By.cssSelector("input#input-email")).clear();
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("tnjprasannav@gmail.com");
		
		driver.findElement(By.cssSelector("input#input-password")).clear();
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Test@123");
		WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
		loginButton.click();
		
		//List<WebElement> options = driver.findElements(By.xpath("//aside[@id='column-right']/div/a"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement container = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("column-right")));
		
		
		 
		/*
		for (WebElement link : container.findElements(By.tagName("a"))) {
		    if (link.getText().trim().equals("Address Book")) {
		        link.click();
		        break;
		    }
		}
		*/
		

		container.findElements(By.tagName("a"))
		.stream()
	    .filter(link -> "Address Book".equals(link.getText().trim()))
	    .findFirst()
	    .ifPresent(WebElement::click);
		

		

	}

}
