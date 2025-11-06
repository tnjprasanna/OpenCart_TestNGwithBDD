package com.openCartTest.com;

import com.openCartPage.com.OpenCartAddressBookPage;
import com.openCartTestComponent.com.BaseTest;

public class AddressBookTest extends BaseTest {
	
	
	public void addBookTest() {
		
		OpenCartAddressBookPage ocAddBookPage = new OpenCartAddressBookPage(driver);
		ocAddBookPage.clickNewAddress();
		
	}
	
	
	

}
