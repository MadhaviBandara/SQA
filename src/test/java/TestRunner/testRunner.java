package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\ravee\\Desktop\\SQA\\src\\test\\resources\\features",
        glue = {"StepDefinitions"},
        plugin = {"pretty", "json:target/cucumber.json" }
)

public class testRunner {
}
