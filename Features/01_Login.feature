# Login.feature
@SmokeTest
Feature: Login
Scenario:Login with valid credentials
	Given User launch the browser
	When User opens the URL "https://naveenautomationlabs.com/opencart/index.php?route=account/login"
	And User enters email "tnjprasannav@gmail.com" and password as "Test@123"
	And Click the Login button
	Then Page logo should get display
	When User clicks on logout link
	Then Page title should be "Account Logout"
	And Close browser
	