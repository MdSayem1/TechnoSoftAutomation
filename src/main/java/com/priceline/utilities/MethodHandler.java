package com.priceline.utilities;

import com.priceline.baseActions.ClickMethod;
import com.priceline.baseActions.PageTitleMethod;

public abstract class MethodHandler {

	// Creating PageTitleMethod Object
	public static PageTitleMethod pageTitleMethod() {

		PageTitleMethod pageTitleMethod = new PageTitleMethod();
		return pageTitleMethod;
	}
	
	// Creating ClickMethod Object
	public static ClickMethod clickMethod() {

		ClickMethod clickMethod = new ClickMethod();
		return clickMethod;
	}
}