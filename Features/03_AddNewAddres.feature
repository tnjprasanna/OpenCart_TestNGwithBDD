# AddNewAddress.feature
@SmokeTest
Feature: Add the Address Book

  Scenario: Going to add the addresss
    Given User launch the browser
	When User opens the URL "https://naveenautomationlabs.com/opencart/index.php?route=account/login"
	And User enters email "tnjprasannav@gmail.com" and password as "Test@123"
	And Click the Login button
	And Click the AdressBook link
	And System load the AdressBookEntries Page
	Then Click the New Address button
	And Verify the AddAddress page load
    When User enter the FirstName as "<FirstName>" and LastName as "<LastName>" and Company as "<Company>" and Address1 as "<Address1>" 
    And User enter the Address2 as "<Address2>" and City as "<City>" and PostCode as "<PostCode>"  
    And User enter the  Country as "<Country>" and Region as "<Region>" and DefaultAddress "<DefaultAddress>" in address book details
    Then User click the Continue button
    And Verify the " Your address has been successfully added"

  Scenario Outline:

    Examples:
		FirstName | LastName | Company | Address1 		| Address2   | City 	 | PostCode | Country | Region 	   | DefaultAddress
		Siva1	  | sakthi1  | SS1	   | 21, North st 	| Adayar     | Chennai   | 600002 	| India   | Tamil Nadu | No
		Siva2	  | sakthi2	 | SS2	   | 22, North st 	| Santhom    | Chennai   | 600002 	| India   | Tamil Nadu | No
		Siva3	  | sakthi3  | SS3	   | 23, North st 	| Mylapore   | Chennai   | 600002 	| India   | Tamil Nadu | No