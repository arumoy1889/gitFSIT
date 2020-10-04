package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Login/Login.feature"},
glue = {"StepDefinition"},
tags = "@TC01",
dryRun = false, // To check if I miss any steps
monochrome = true,
strict = true,
plugin = {"html:testout/arumoy.html"}
		) // to make console o/p in proper format
public class Test_Runner {

}
