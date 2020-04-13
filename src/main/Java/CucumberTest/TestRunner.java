package CucumberTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Feature"
        ,glue = {"StepDefinition"}
//        ,format = {"html:target/cucumber-html-report"}
)
public class TestRunner {

}
