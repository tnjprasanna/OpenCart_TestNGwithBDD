@tag
	Feature: Login with valid details
 
 	Background:
		Given I landed on OpenCart Page 
 
 	@tag2
 	Scenario Outline: Validate the positive case 
 		Given logged in with  the Username <userName> and Password <password>
 		When click login button
 		Then Verify the searchBox 
 	
 		Examples:
 		
			|userName 				| password |
			|tnjprasannav@gmail.com	| Test@123 |
		
 	
 	
	