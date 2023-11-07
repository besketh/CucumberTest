package projectName.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Before;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/Cucumber-report/cucumber.html" },
        features = {"src/test/resources/projectName" },glue = {"projectName.stepdefs"},
        tags={"@Swing"})
public class RunnerForSwingApp {

//    static final Logger LOGGER = Logger.getLogger(Runner.class);

}



