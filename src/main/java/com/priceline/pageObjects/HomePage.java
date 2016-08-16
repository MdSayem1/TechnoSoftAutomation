package com.priceline.pageObjects;

import com.priceline.utilities.MethodHandler;

public class HomePage extends MethodHandler {

	public String getHomePageTitle() {

		String homePageTitle = pageTitleMethod().getPageTitle();
		
		return homePageTitle;
	}
}