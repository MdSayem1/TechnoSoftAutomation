package com.priceline.utilities;

import com.priceline.pageObjects.HomePage;
import com.priceline.pageObjects.LoginPage;

public abstract class PageObjectHandler {

	// Creating HomePage Object
	public static HomePage homePage() {

		HomePage homePage = new HomePage();
		return homePage;
	}
	
	// Creating LoginPage Object
	public static LoginPage loginPage() {

		LoginPage loginPage = new LoginPage();
		return loginPage;
	}
}