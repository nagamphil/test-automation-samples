package TestRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features = "AutomationScenarios"
        ,glue={"StepDefinition"}
        )
public class Runner {

}
