package com.crowdTwist.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		 features="src/test/resources/features"
		,glue ="com/crowdTwist/steps"
		,monochrome=true
		//,dryRun=true
		,tags= {"~@smoke1,@smoke"}
		,plugin={"pretty","html:target/cucumber-default-report","json:target/cucumber.json"}
		)

public class TestRunner {

}
