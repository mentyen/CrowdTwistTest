package com.crowdTwist.steps;

import com.crowdTwist.utils.BaseClass;
import com.crowdTwist.utils.CommonMethods;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	
	
	@Before
	public void start(Scenario scenario) {
		
		System.out.println("Starting test: "+scenario.getName());
		
		BaseClass.setUp();
		
	}
	
	
	@After
	public void finish(Scenario scenario) {
		
		System.out.println("Ending test: "+scenario.getName());
		
		if(scenario.isFailed()) {
			
			byte[] pic=CommonMethods.takeScreenshot();
			
			scenario.embed(pic, "png");
			
		}
		
		BaseClass.tearDown();
		
	}

}
