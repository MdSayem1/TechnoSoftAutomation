package com.priceline.testSteps;

import org.junit.Assert;

import com.priceline.utilities.PageObjectHandler;

import cucumber.api.java.en.Given;

public class TestCase0001Steps extends PageObjectHandler {

	@Given("^verify home page title$")
	public void verify_home_page_title() {

		String expectedHomePageTitle = "Priceline.com - The Best Deals on Hotels, Flights and Rental Cars.";
		String actualHomePageTitle = homePage().getHomePageTitle();
		
		Assert.assertEquals(expectedHomePageTitle, actualHomePageTitle);
		System.out.println("Home Page Title - Test SUCCESSFUL!!!");
	}
}