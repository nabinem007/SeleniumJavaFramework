package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber"} ,
        features = "C:\\Users\\nabin\\IdeaProjects\\CucumberFramework\\Features\\Google.feature",
        glue = "stepDefinitions"


)
public class TestRunner {
}
