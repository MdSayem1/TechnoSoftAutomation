package com.priceline.baseActions;

import com.priceline.utilities.GlobalConfig;

public class PageTitleMethod extends GlobalConfig {

	public String getPageTitle() {
		
		String pageTitle = myDriver.getTitle();
		return pageTitle;
	}
}