package com.openCartTest.com;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.openCartPage.com.OpenCartAddressBookPage;
import com.openCartPage.com.OpenCartHomePage;
import com.openCartPage.com.OpenCartLaunchLoginPage;
import com.openCartTestComponent.com.BaseTest;
import com.openCartTestComponent.com.Retry;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchLoginTest extends BaseTest {
	
	//ExtentReports extent;
		
	//@BeforeTest
	public void config() {
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter =	new	ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		//extent = new ExtentReports();
		//extent.attachReporter(reporter);
		//extent.setSystemInfo("Tester", "Prasanna Venkatesan");
	}
	
	@Test(dataProvider = "loginData", priority=1, groups = {"login Validations"})
	public void loginTest(HashMap<String, String> dataToMap) throws IOException, InterruptedException {
		
		//extent.createTest("loginTest");
		OpenCartHomePage homePage  = landingPage.loginApplication(dataToMap.get("email"), dataToMap.get("password"));
		homePage.verifySearchBox();
		String optionName = "Address Book";
		homePage.clickOptionsByName(optionName);
		//extent.flush();
	}
	
	@Test(dataProvider = "loginAlert", priority=2, groups = {"login Error Validation"}, retryAnalyzer = Retry.class)
	public void loginAlertTest(HashMap<String, String> dataToMap) throws IOException, InterruptedException {
		
		//extent.createTest("loginTest");
		OpenCartHomePage homePage  = landingPage.loginApplication(dataToMap.get("email"), dataToMap.get("password"));
		landingPage.getErrorMsg();
		//extent.flush();
	}
	
	@DataProvider
	public Object[][] loginData() throws IOException{
		
		//return new Object[][] {{"tnjprasannav@gmail.com"}, {"Test@123"}};
		
		/*
		 * HashMap<String,String> map = new HashMap<String, String>(); map.put("email",
		 * "tnjprasannav@gmail.com"); map.put("password", "Test@123");
		 */
		
		/*HashMap<String,String> map1 = new HashMap<String, String>();
		map.put("email", "tnjprasannav@gmail.com");
		map.put("password", "Test@1232");
		*/
		
		List<HashMap<String, String>> dataToMap = getJsonDataToMap(System.getProperty("user.dir")+"//src//test//java//com//jsonData//com//openCartLogin.JSON");
		return new Object [][] {{dataToMap.get(0)}};
		
	}
	
	@DataProvider
	public Object[][] loginAlert() throws IOException{
		List<HashMap<String, String>> dataToMap = getJsonDataToMap(System.getProperty("user.dir")+"//src//test//java//com//jsonData//com//openCartLogin.JSON");
		return new Object [][] {{dataToMap.get(1)}};
	}
	
	/*
 	public void loginTest(String email, String password) throws IOException, InterruptedException {
			
	OpenCartHomePage homePage  = landingPage.loginApplication(email, password);
	String optionName = "Address Book";
	homePage.clickOptionsByName(optionName);
	
		@Test(dataProvider = "loginData", priority=2)
		public void incorrectLoginError(HashMap<String, String> map1) throws InterruptedException {
	
		OpenCartHomePage homePage  =  landingPage.loginApplication(map1.get("email"), map1.get("password"));
		Assert.assertEquals("Warning: No match for E-Mail Address and/or Password.", landingPage.getErrorMsg());
		}

	}*/
	
}
