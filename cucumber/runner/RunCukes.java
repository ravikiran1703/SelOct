package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/features/Login.feature",
glue = {"steps", "pages"},
monochrome = true,
tags = {"~@reg"}
//tags = {"@smoke or @reg"}
/*dryRun = true,
snippets = SnippetType.CAMELCASE*/
		)
public class RunCukes {
	

}






