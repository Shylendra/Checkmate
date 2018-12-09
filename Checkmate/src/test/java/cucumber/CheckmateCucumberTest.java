package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/cucumber/features/Checkmate.feature"},
		glue={"stepdeffs"},
		plugin= {"html:target/site/cucumber-pretty","json:target/cucumber.json"})
public class CheckmateCucumberTest {

}
