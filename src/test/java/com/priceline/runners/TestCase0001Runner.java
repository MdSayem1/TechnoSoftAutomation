package com.priceline.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = "src/test/resources/features/TestCase0001.feature", 
			glue = "com/priceline/testSteps/")
public class TestCase0001Runner {

}