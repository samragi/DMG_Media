package com.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features",
        glue = {"com.stepDefinition"},
        //tags= {"@smoke"},
        plugin = { "html:target/cucumber-html-report", "json:target/cucumber.json" }
)


public class CucumberRunner {
}
