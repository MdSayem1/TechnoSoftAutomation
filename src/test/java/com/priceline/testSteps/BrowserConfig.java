package com.priceline.testSteps;

import com.priceline.utilities.GlobalConfig;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BrowserConfig extends GlobalConfig {

	@Before
	// Initialize driver and open up browser
	public static void setUpBrowser() {
		ConfigDrivers();
	}

	@After
	// Close the browser
	public static void stopBrowser() {
		terminateDrivers();
	}
}